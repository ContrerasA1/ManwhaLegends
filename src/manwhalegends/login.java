package manwhalegends;

import config.Session;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import userdashboard.admindashboard;
import userdashboard.readerdashboard;


public class login extends javax.swing.JFrame {

    // Creates new form login
     
    char defaultEchoChar;
     
    
    //constructor ni wally boldyola
    public login() {
        initComponents();
        getRootPane().setDefaultButton(LoginButton);
        
 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInCheckBox = new javax.swing.JCheckBox();
        BackgroundPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        SignUpHeader = new javax.swing.JLabel();
        LoginEmail = new javax.swing.JTextField();
        Separator2 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        LoginPasswordIcon = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        NewLbl = new javax.swing.JLabel();
        CreateACClbl = new javax.swing.JLabel();
        LoginEmailIcon1 = new javax.swing.JLabel();
        LoginPassword = new javax.swing.JPasswordField();
        SystemLogo = new javax.swing.JLabel();
        RememberMe = new javax.swing.JCheckBox();

        LogInCheckBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LogInCheckBox.setText("Remember me");
        LogInCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInCheckBoxActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpHeader.setFont(new java.awt.Font("Palatino Linotype", 3, 40)); // NOI18N
        SignUpHeader.setText("Login");
        LoginPanel.add(SignUpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 11, -1, -1));
        LoginPanel.add(LoginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 109, 400, 30));
        LoginPanel.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 145, 400, 15));
        LoginPanel.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 400, 15));

        LoginPasswordIcon.setBackground(new java.awt.Color(0, 0, 0));
        LoginPasswordIcon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LoginPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_24dp_E3E3E3_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        LoginPasswordIcon.setOpaque(true);
        LoginPanel.add(LoginPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 171, -1, 30));

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        LoginButton.setText("Log In");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginButtonKeyPressed(evt);
            }
        });
        LoginPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, -1));

        NewLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NewLbl.setText("New?");
        NewLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginPanel.add(NewLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, 20));

        CreateACClbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CreateACClbl.setForeground(new java.awt.Color(102, 102, 255));
        CreateACClbl.setText("Create an account");
        CreateACClbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateACClbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateACClblMouseClicked(evt);
            }
        });
        LoginPanel.add(CreateACClbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, 20));

        LoginEmailIcon1.setBackground(new java.awt.Color(0, 0, 0));
        LoginEmailIcon1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LoginEmailIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_24dp_E3E3E3_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        LoginEmailIcon1.setOpaque(true);
        LoginPanel.add(LoginEmailIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 109, -1, 30));

        LoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 400, 30));

        SystemLogo.setBackground(new java.awt.Color(0, 0, 0));
        SystemLogo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        SystemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images__2_-removebg-preview.png"))); // NOI18N
        SystemLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SystemLogo.setMaximumSize(new java.awt.Dimension(60, 60));
        SystemLogo.setMinimumSize(new java.awt.Dimension(60, 60));
        LoginPanel.add(SystemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 70));

        RememberMe.setText("Remember Me");
        LoginPanel.add(RememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        BackgroundPanel.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 510, 330));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInCheckBoxActionPerformed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
    // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        String email = LoginEmail.getText().trim();
                     String password = new String(LoginPassword.getPassword()).trim();

 try {
                   Connection con = DriverManager.getConnection("jdbc:sqlite:AlGUI.db");
                   String sql = "SELECT * FROM tbl_Acc WHERE email=? AND password=?";
                   PreparedStatement pst = con.prepareStatement(sql);
        
                   pst.setString(1, email);
                   
                   config.config conf = new config.config();
                    String hashedPassword = conf.hashPassword(password);
                   pst.setString(2, hashedPassword);
         
                   ResultSet rs = pst.executeQuery();
 
 if (rs.next()) {

    String status = rs.getString("status");

    if (status.equalsIgnoreCase("PENDING")) {
        JOptionPane.showMessageDialog(this, "Waiting for admin approval.");
        return;
    }

    if (!status.equalsIgnoreCase("ACTIVE")) {
        JOptionPane.showMessageDialog(this, "Account is not active.");
        return;
    }           
    
    Session.getInstance().setSession(
        rs.getInt("u_id"),
        rs.getString("name"),
        rs.getString("email"),
        rs.getString("type"),
        rs.getString("status")
    );

    JOptionPane.showMessageDialog(null, "Login Successful!");


                   String userType = rs.getString("type");

 if (userType.equalsIgnoreCase("admin")) {
                

new admindashboard().setVisible(true);
this.dispose();

} else if (userType.equalsIgnoreCase("reader")) {

                new readerdashboard().setVisible(true);
                this.dispose();
             
            }
            
            

 } else {
                     JOptionPane.showMessageDialog(this, "Invalid Email or Password!");
            }

                     con.close();

 } catch (Exception e) {
                     JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CreateACClblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateACClblMouseClicked
            register register = new register();
            register.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_CreateACClblMouseClicked

    private void LoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordActionPerformed
       
    }//GEN-LAST:event_LoginPasswordActionPerformed

    private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonKeyPressed

 
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel CreateACClbl;
    private javax.swing.JCheckBox LogInCheckBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField LoginEmail;
    private javax.swing.JLabel LoginEmailIcon1;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField LoginPassword;
    private javax.swing.JLabel LoginPasswordIcon;
    private javax.swing.JLabel NewLbl;
    private javax.swing.JCheckBox RememberMe;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JLabel SignUpHeader;
    private javax.swing.JLabel SystemLogo;
    // End of variables declaration//GEN-END:variables
}
