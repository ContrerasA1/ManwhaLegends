package userdashboard;

import javax.swing.JOptionPane;
import manwhalegends.login;
import users.managemanwha;
import users.manageuser;


public class admindashboard extends javax.swing.JFrame {

    //Creates new form admindashboard 
    public admindashboard() {
        initComponents();
        
        getRootPane().setDefaultButton(LogoutAdmin);
                                                                                                                                                                         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        MenuPNL = new javax.swing.JPanel();
        OverviewAdmin = new javax.swing.JButton();
        Users = new javax.swing.JButton();
        ManageManwha = new javax.swing.JButton();
        LogoutAdmin = new javax.swing.JButton();
        Systemlogo = new javax.swing.JLabel();
        AdminDashboardPanel = new javax.swing.JPanel();
        WelcomeAdmin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PersonAdmin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        OverviewDashboardAdmin = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        ManwhaIcon = new javax.swing.JLabel();
        OverallUsers = new javax.swing.JLabel();
        TotalManwha = new javax.swing.JLabel();
        OverallManwha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OverviewAdmin.setText("Overview");
        OverviewAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverviewAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverviewAdminMouseClicked(evt);
            }
        });
        OverviewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewAdminActionPerformed(evt);
            }
        });
        MenuPNL.add(OverviewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 40));

        Users.setText("Users");
        Users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
        });
        Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersActionPerformed(evt);
            }
        });
        MenuPNL.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 40));

        ManageManwha.setText("Manwha");
        ManageManwha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageManwha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageManwhaMouseClicked(evt);
            }
        });
        ManageManwha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageManwhaActionPerformed(evt);
            }
        });
        MenuPNL.add(ManageManwha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 40));

        LogoutAdmin.setText("Logout");
        LogoutAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutAdminActionPerformed(evt);
            }
        });
        LogoutAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LogoutAdminKeyPressed(evt);
            }
        });
        MenuPNL.add(LogoutAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 303, 100, 30));

        BackgroundPanel.add(MenuPNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 340));

        Systemlogo.setBackground(new java.awt.Color(0, 0, 0));
        Systemlogo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Systemlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images__2_-removebg-preview.png"))); // NOI18N
        Systemlogo.setMaximumSize(new java.awt.Dimension(60, 60));
        Systemlogo.setMinimumSize(new java.awt.Dimension(60, 60));
        BackgroundPanel.add(Systemlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 70));

        AdminDashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeAdmin.setFont(new java.awt.Font("Palatino Linotype", 3, 40)); // NOI18N
        WelcomeAdmin.setText("Welcome, Admin!");
        AdminDashboardPanel.add(WelcomeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));
        AdminDashboardPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 20));

        PersonAdmin.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        PersonAdmin.setText("Total Active Users: ");
        AdminDashboardPanel.add(PersonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));
        AdminDashboardPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 20));

        OverviewDashboardAdmin.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        OverviewDashboardAdmin.setText("Overview Dashboard");
        AdminDashboardPanel.add(OverviewDashboardAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/person_book_40dp_1F1F1F_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        AdminDashboardPanel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 40, 30));

        ManwhaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_book_40dp_1F1F1F_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        AdminDashboardPanel.add(ManwhaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 40, 30));

        OverallUsers.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        OverallUsers.setText("30 Users");
        AdminDashboardPanel.add(OverallUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        TotalManwha.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        TotalManwha.setText("Total Manwhas:");
        AdminDashboardPanel.add(TotalManwha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        OverallManwha.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        OverallManwha.setText("20 Manwhas");
        AdminDashboardPanel.add(OverallManwha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        BackgroundPanel.add(AdminDashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 470, 380));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
private void OverviewAdminActionPerformed(java.awt.event.ActionEvent evt) {
    
    
}

private void ManageManwhaActionPerformed(java.awt.event.ActionEvent evt) {
new managemanwha().setVisible(true);
this.dispose();
                                                                                                                                                                     }

private void UsersActionPerformed(java.awt.event.ActionEvent evt) {
       new manageuser().setVisible(true);
       this.dispose();
                                                                                                                                                                     }

private void LogoutAdminActionPerformed(java.awt.event.ActionEvent evt) {
if (JOptionPane.showConfirmDialog(this,
        "Are you sure you want to logout?",
        "Confirm Logout",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

new login().setVisible(true);
this.dispose();
                                                                                                                                                                                }
}

    private void OverviewAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OverviewAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OverviewAdminMouseClicked

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        manageuser manageuser = new manageuser();
        manageuser.setVisible(true);
this.dispose();
    }//GEN-LAST:event_UsersMouseClicked

    private void ManageManwhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageManwhaMouseClicked
        managemanwha managemanwha = new managemanwha();
        managemanwha.setVisible(true);
this.dispose();
    }//GEN-LAST:event_ManageManwhaMouseClicked

    private void LogoutAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogoutAdminKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutAdminKeyPressed

  
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
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboard().setVisible(true);
                                                                                                                                                                                 }
        });
                                                                                                                                                                         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminDashboardPanel;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton LogoutAdmin;
    private javax.swing.JButton ManageManwha;
    private javax.swing.JLabel ManwhaIcon;
    private javax.swing.JPanel MenuPNL;
    private javax.swing.JLabel OverallManwha;
    private javax.swing.JLabel OverallUsers;
    private javax.swing.JButton OverviewAdmin;
    private javax.swing.JLabel OverviewDashboardAdmin;
    private javax.swing.JLabel PersonAdmin;
    private javax.swing.JLabel Systemlogo;
    private javax.swing.JLabel TotalManwha;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JButton Users;
    private javax.swing.JLabel WelcomeAdmin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
