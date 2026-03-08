package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class config {
    
    //Connection Method ni
    public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            con = DriverManager.getConnection("jdbc:sqlite:AlGUI.db"); // Establish connection
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }
    
    //Add Record ni
    public void addRecord(String sql, Object... values) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        for (int i = 0; i < values.length; i++) {
            pstmt.setObject(i + 1, values[i]);
        }

        pstmt.executeUpdate();
        System.out.println("Record added successfully!");
    } catch (SQLException e) {
        System.out.println("Error adding record: " + e.getMessage());
    }
}
    
    //Login Method ni
    public String authenticate(String sql, Object... values) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        for (int i = 0; i < values.length; i++) {
            pstmt.setObject(i + 1, values[i]);
        }

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getString("type");
            }
        }
    } catch (SQLException e) {
        System.out.println("Login Error: " + e.getMessage());
    }
    return null;
}
    // Get User Details ni para check if naay emails naba
public boolean emailExists(String email) {

    String sql = "SELECT 1 FROM tbl_Acc WHERE email = ?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, email);

        try (ResultSet rs = pstmt.executeQuery()) {
            return rs.next();
        }

    } catch (SQLException e) {
        System.out.println("Check Email Error: " + e.getMessage());
    }

    return false;
}
    
    //Display ni sa ako TABLE
    public void displayData(String sql, javax.swing.JTable table, Object... values) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        // Set the parameters for the search
        for (int i = 0; i < values.length; i++) {
            pstmt.setObject(i + 1, values[i]);
        }

        try (ResultSet rs = pstmt.executeQuery()) {
            // Automatically maps the filtered ResultSet to your JTable
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
    } catch (SQLException e) {
        System.out.println("Error filtering data: " + e.getMessage());
    }
}
    
    
public void getAllUsers(JTable table) {

    DefaultTableModel model = new DefaultTableModel();
    
    model.setColumnIdentifiers(new String[]{
        "User ID", "Name", "Email", "Password", "Type", "Status"
    });

    try {
        Connection con = connectDB();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_Acc");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("u_id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getString("type"),
                rs.getString("status")
            });
        }

        table.setModel(model);
        table.setDefaultEditor(Object.class, null); // read only

        rs.close();
        stmt.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
//modisplay table sa readerservice manwha
public void getAllManwha(JTable table) {

    String sql = "SELECT m_id, title, genre, author, status FROM tbl_manwha";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        table.setModel(DbUtils.resultSetToTableModel(rs));
        table.setDefaultEditor(Object.class, null); // read only

    } catch (SQLException e) {
        System.out.println("Error loading manwha: " + e.getMessage());
    }
}
//search bar ug button sa readerservice para modisplay ang desired manwha
public void searchManwha(String keyword, JTable table) {

    String sql = "SELECT m_id, title, genre, author, status FROM tbl_manwha WHERE title LIKE ? OR genre LIKE ? OR author LIKE ?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        String searchPattern = "%" + keyword + "%";

        pstmt.setString(1, searchPattern);
        pstmt.setString(2, searchPattern);
        pstmt.setString(3, searchPattern);

        ResultSet rs = pstmt.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));

    } catch (SQLException e) {
        System.out.println("Search Error: " + e.getMessage());
    }
}
    //addtofavorite nga button 
public void addToFavorites(int userId, int manwhaId) {
    
    String checkSql = "SELECT * FROM tbl_favorites WHERE user_id = ? AND manwha_id = ?";
    String insertSql = "INSERT INTO tbl_favorites (user_id, manwha_id) VALUES (?, ?)";

    try (Connection conn = connectDB();
         PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {

        checkStmt.setInt(1, userId);
        checkStmt.setInt(2, manwhaId);
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next()) {
            System.out.println("Already in favorites.");
            return;
        }

        PreparedStatement insertStmt = conn.prepareStatement(insertSql);
        insertStmt.setInt(1, userId);
        insertStmt.setInt(2, manwhaId);
        insertStmt.executeUpdate();

        System.out.println("Added to favorites!");

    } catch (SQLException e) {
        System.out.println("Favorite Error: " + e.getMessage());
    }
}

public void getUserFavorites(int userId, JTable table) {

    String sql = "SELECT m.m_id, m.title, m.genre, m.author, m.status " +
                 "FROM tbl_favorites f " +
                 "JOIN tbl_manwha m ON f.manwha_id = m.m_id " +
                 "WHERE f.user_id = ?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, userId);
        ResultSet rs = pstmt.executeQuery();

        table.setModel(DbUtils.resultSetToTableModel(rs));
        table.setDefaultEditor(Object.class, null);

    } catch (SQLException e) {
        System.out.println("Favorites Load Error: " + e.getMessage());
    }
}

// ================= REMOVE FROM FAVORITES =================
public void removeFromFavorites(int userId, int manwhaId) {

    String sql = "DELETE FROM tbl_favorites WHERE user_id = ? AND manwha_id = ?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, userId);
        pstmt.setInt(2, manwhaId);
        pstmt.executeUpdate();

        System.out.println("Removed from favorites!");

    } catch (SQLException e) {
        System.out.println("Remove Error: " + e.getMessage());
    }
}
// CRUD Method ni dring dapita sa managemanwha

//addbtn sa managemanwha 
public void addManwha(String title, String genre, String author, String status) {

    String sql = "INSERT INTO tbl_manwha (title, genre, author, status) VALUES (?, ?, ?, ?)";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, title);
        pstmt.setString(2, genre);
        pstmt.setString(3, author);
        pstmt.setString(4, status);

        pstmt.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Add Error: " + e.getMessage());
    }
}
//update sa managemanwha
public void updateManwha(int id, String title, String genre, String author, String status) {

    String sql = "UPDATE tbl_manwha SET title=?, genre=?, author=?, status=? WHERE m_id=?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, title);
        pstmt.setString(2, genre);
        pstmt.setString(3, author);
        pstmt.setString(4, status);
        pstmt.setInt(5, id);

        pstmt.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Update Error: " + e.getMessage());
    }
}
//delete sa managemanwha
public void deleteManwha(int id) {

    String sql = "DELETE FROM tbl_manwha WHERE m_id=?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, id);
        pstmt.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Delete Error: " + e.getMessage());
    }
}

// ================= METHOD ADMIN SEARCH MANWHA =================
public void searchAdminManwha(String keyword, JTable table) {

    String sql = "SELECT m_id, title, genre, author, status " +
                 "FROM tbl_manwha " +
                 "WHERE title LIKE ? OR genre LIKE ? OR author LIKE ? OR status LIKE ?";

    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        String searchPattern = "%" + keyword + "%";

        pstmt.setString(1, searchPattern);
        pstmt.setString(2, searchPattern);
        pstmt.setString(3, searchPattern);
        pstmt.setString(4, searchPattern);

        ResultSet rs = pstmt.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));

    } catch (SQLException e) {
        System.out.println("Admin Search Error: " + e.getMessage());
    }
}
//method ni CRUD para UsersTable
public void executeUpdate(String sql) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:AlGUI.db");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
//Password Hashing sa Database
public static String hashPassword(String password) {
    try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashedBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
        
    } catch (java.security.NoSuchAlgorithmException e) {
        System.out.println("Error hashing password: " + e.getMessage());
        return null;
    }
}
}
