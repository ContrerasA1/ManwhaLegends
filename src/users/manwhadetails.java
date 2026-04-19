package users;

import config.config;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import manwhalegends.login;
import userdashboard.readerdashboard;

public class manwhadetails extends javax.swing.JFrame {

    //Creates new form manwhadetails
   
    private int manwhaId;
    
    public manwhadetails() {
    initComponents();
    }
    
 public manwhadetails(int id) {
    initComponents();
    this.manwhaId = id;
    loadManwhaDetails();
 }
    
    private void loadManwhaDetails() {

    try {
        Connection conn = config.connectDB();
        String sql = "SELECT * FROM tbl_manwha WHERE m_id=?";
PreparedStatement pst = conn.prepareStatement(sql);
 pst.setInt(1, manwhaId);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            Title.setText(rs.getString("title"));
            MAuthor.setText(rs.getString("author"));
            MGenre.setText(rs.getString("genre"));
            MStatus.setText(rs.getString("status"));
            Description.setText(rs.getString("description"));

            // IMAGE
        String imagePath = rs.getString("image");

java.net.URL imgURL = getClass().getResource("/" + imagePath);

if (imgURL != null) {
    ImageIcon icon = new ImageIcon(imgURL);

    Image img = icon.getImage();
    Image scaledImg = img.getScaledInstance(
            image.getWidth(),
            image.getHeight(),
            Image.SCALE_SMOOTH
    );

    image.setIcon(new ImageIcon(scaledImg));
} else {
    System.out.println("Image not found: " + imagePath);
}
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        FavoritesHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        image = new javax.swing.JLabel();
        MGenre = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        MAuthor = new javax.swing.JLabel();
        MStatus = new javax.swing.JLabel();
        ScrollPnlDescript = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        Author = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Backbtn = new javax.swing.JButton();
        Read = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FavoritesHeader.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        FavoritesHeader.setText("Manwha ");
        jPanel2.add(FavoritesHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 600, 10));
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 180));

        MGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(MGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 110, 20));

        Title.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        Title.setText("Title");
        jPanel2.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, -1));

        MAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(MAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 110, 20));

        MStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(MStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 20));

        ScrollPnlDescript.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        Description.setEditable(false);
        Description.setBackground(new java.awt.Color(0, 0, 0));
        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Description.setForeground(new java.awt.Color(255, 255, 255));
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Description);

        ScrollPnlDescript.setViewportView(jScrollPane1);

        jPanel2.add(ScrollPnlDescript, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 390, 180));

        Author.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Author.setText("Author:");
        jPanel2.add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        Genre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Genre.setText("Genre:");
        jPanel2.add(Genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Status.setText("Status:");
        Status.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                StatusComponentRemoved(evt);
            }
        });
        jPanel2.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 40, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 40, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 10));

        Backbtn.setBackground(new java.awt.Color(255, 255, 255));
        Backbtn.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 377, 70, 30));

        Read.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        Read.setText("READ");
        Read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadActionPerformed(evt);
            }
        });
        jPanel2.add(Read, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 600, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StatusComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_StatusComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusComponentRemoved

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
  
    this.dispose();
    }//GEN-LAST:event_BackbtnActionPerformed

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed
        new ChaptersPages.Chapters(manwhaId).setVisible(true);
    }//GEN-LAST:event_ReadActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manwhadetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manwhadetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manwhadetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manwhadetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manwhadetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private javax.swing.JButton Backbtn;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel FavoritesHeader;
    private javax.swing.JLabel Genre;
    private javax.swing.JLabel MAuthor;
    private javax.swing.JLabel MGenre;
    private javax.swing.JLabel MStatus;
    private javax.swing.JButton Read;
    private javax.swing.JScrollPane ScrollPnlDescript;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
