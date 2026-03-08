package CRUDReader;

import javax.swing.JOptionPane;


public class PasswordProfile extends javax.swing.JFrame {

    // Creates new form PasswordProfile
     
    public PasswordProfile() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        AddHeader1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        EPassword = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        Ecancel = new javax.swing.JButton();
        Esave = new javax.swing.JButton();
        ConfirmPass = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        NewPass = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        currentpass = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 10));

        AddHeader1.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        AddHeader1.setText("Edit Password");
        jPanel1.add(AddHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manwhalegends.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 100));

        EPassword.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        EPassword.setText("Current Password:");
        jPanel1.add(EPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        Ecancel.setText("Cancel");
        Ecancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcancelActionPerformed(evt);
            }
        });
        Ecancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EcancelKeyPressed(evt);
            }
        });
        jPanel1.add(Ecancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 70, 30));

        Esave.setText("Save");
        Esave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsaveActionPerformed(evt);
            }
        });
        jPanel1.add(Esave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 70, 30));

        ConfirmPass.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        ConfirmPass.setText("Confirm New Pass:");
        jPanel1.add(ConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 20));

        NewPass.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        NewPass.setText("New Password:");
        jPanel1.add(NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 20));

        currentpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentpassActionPerformed(evt);
            }
        });
        jPanel1.add(currentpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 300, 30));

        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 300, 30));

        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 300, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_EcancelActionPerformed

    private void EsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsaveActionPerformed
      String currentPass = new String(currentpass.getPassword()).trim();
      String newPass = new String(newpass.getPassword()).trim();
       String confirmPass = new String(confirmpass.getPassword()).trim();

if (currentPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
    JOptionPane.showMessageDialog(this, "All fields are required!");
    return;
}

if (!newPass.equals(confirmPass)) {
    JOptionPane.showMessageDialog(this, "New passwords do not match!");
    return;
}

try {
    config.config conf = new config.config();

    // get current logged in user ID
   int userId = config.Session.getInstance().getUserId();

    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:sqlite:AlGUI.db");

    // HASH current password input
    String hashedCurrent = conf.hashPassword(currentPass);

    String checkSql = "SELECT * FROM tbl_Acc WHERE u_id=? AND password=?";
    java.sql.PreparedStatement pst = con.prepareStatement(checkSql);
    pst.setInt(1, userId);
    pst.setString(2, hashedCurrent);

    java.sql.ResultSet rs = pst.executeQuery();

    if (!rs.next()) {
        JOptionPane.showMessageDialog(this, "Current password is incorrect!");
        con.close();
        return;
    }

    // HASH new password
    String hashedNew = conf.hashPassword(newPass);

    String updateSql = "UPDATE tbl_Acc SET password=? WHERE u_id=?";
    java.sql.PreparedStatement updatePst = con.prepareStatement(updateSql);
    updatePst.setString(1, hashedNew);
    updatePst.setInt(2, userId);
    updatePst.executeUpdate();

    JOptionPane.showMessageDialog(this, "Password changed successfully!");

    con.close();

    // OPEN editprofile again
    new editprofile().setVisible(true);
    this.dispose();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }//GEN-LAST:event_EsaveActionPerformed

    private void EcancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EcancelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcancelKeyPressed

    private void currentpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentpassActionPerformed

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddHeader1;
    private javax.swing.JLabel ConfirmPass;
    private javax.swing.JLabel EPassword;
    private javax.swing.JButton Ecancel;
    private javax.swing.JButton Esave;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NewPass;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JPasswordField currentpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPasswordField newpass;
    // End of variables declaration//GEN-END:variables
}
