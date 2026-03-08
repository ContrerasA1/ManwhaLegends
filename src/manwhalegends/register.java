package manwhalegends;

import config.config;
import javax.swing.JOptionPane;


public class register extends javax.swing.JFrame {

    //Creates new form register
     
    //constructor ni 
    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        RegisterPanel = new javax.swing.JPanel();
        RegisterHeader = new javax.swing.JLabel();
        UsernameLabel1 = new javax.swing.JLabel();
        PasswordLabel1 = new javax.swing.JLabel();
        EmailLabel1 = new javax.swing.JLabel();
        rPassword = new javax.swing.JPasswordField();
        Separator1 = new javax.swing.JSeparator();
        Separator = new javax.swing.JSeparator();
        UserIcon = new javax.swing.JLabel();
        PasswordIcon = new javax.swing.JLabel();
        EmailIcon = new javax.swing.JLabel();
        rEmail = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        accountTxt = new javax.swing.JLabel();
        SignInRegister = new javax.swing.JPanel();
        SignInBtn = new javax.swing.JLabel();
        SignUPPnl = new javax.swing.JPanel();
        SignUpRegister = new javax.swing.JLabel();
        SystemLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterHeader.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        RegisterHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterHeader.setText("Register");
        RegisterPanel.add(RegisterHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 250, 60));

        UsernameLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        UsernameLabel1.setText("Username");
        RegisterPanel.add(UsernameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        PasswordLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        PasswordLabel1.setText("Password");
        RegisterPanel.add(PasswordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        EmailLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        EmailLabel1.setText("Email");
        RegisterPanel.add(EmailLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        rPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPasswordActionPerformed(evt);
            }
        });
        RegisterPanel.add(rPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 350, 30));
        RegisterPanel.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 10));
        RegisterPanel.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 360, 10));

        UserIcon.setBackground(new java.awt.Color(0, 0, 0));
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_circle_24dp_E3E3E3_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        UserIcon.setOpaque(true);
        RegisterPanel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        PasswordIcon.setBackground(new java.awt.Color(0, 0, 0));
        PasswordIcon.setForeground(new java.awt.Color(255, 255, 255));
        PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_24dp_E3E3E3_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        PasswordIcon.setOpaque(true);
        RegisterPanel.add(PasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        EmailIcon.setBackground(new java.awt.Color(0, 0, 0));
        EmailIcon.setForeground(new java.awt.Color(51, 51, 51));
        EmailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_24dp_E3E3E3_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        EmailIcon.setOpaque(true);
        RegisterPanel.add(EmailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        rEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailActionPerformed(evt);
            }
        });
        RegisterPanel.add(rEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 30));

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        RegisterPanel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 350, 30));

        accountTxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        accountTxt.setText("Already have an  account?");
        RegisterPanel.add(accountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        SignInRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInRegisterMouseClicked(evt);
            }
        });

        SignInBtn.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        SignInBtn.setText("Sign in");
        SignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SignInRegisterLayout = new javax.swing.GroupLayout(SignInRegister);
        SignInRegister.setLayout(SignInRegisterLayout);
        SignInRegisterLayout.setHorizontalGroup(
            SignInRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInRegisterLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(SignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        SignInRegisterLayout.setVerticalGroup(
            SignInRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        RegisterPanel.add(SignInRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, 20));

        SignUPPnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUPPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUPPnlMouseClicked(evt);
            }
        });

        SignUpRegister.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        SignUpRegister.setText("Sign Up");

        javax.swing.GroupLayout SignUPPnlLayout = new javax.swing.GroupLayout(SignUPPnl);
        SignUPPnl.setLayout(SignUPPnlLayout);
        SignUPPnlLayout.setHorizontalGroup(
            SignUPPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUPPnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SignUpRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        SignUPPnlLayout.setVerticalGroup(
            SignUPPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUPPnlLayout.createSequentialGroup()
                .addComponent(SignUpRegister)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        RegisterPanel.add(SignUPPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 120, 30));

        BackgroundPanel.add(RegisterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 430, 370));

        SystemLogo.setBackground(new java.awt.Color(0, 0, 0));
        SystemLogo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        SystemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images__2_-removebg-preview.png"))); // NOI18N
        SystemLogo.setMaximumSize(new java.awt.Dimension(60, 60));
        SystemLogo.setMinimumSize(new java.awt.Dimension(60, 60));
        BackgroundPanel.add(SystemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPasswordActionPerformed

    private void rEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void SignInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInBtnMouseClicked
            login login = new login();
            login.setVisible(true);
 this.dispose();
       
    }//GEN-LAST:event_SignInBtnMouseClicked

    private void SignInRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInRegisterMouseClicked
             login login = new login();
             login.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_SignInRegisterMouseClicked

    private void SignUPPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUPPnlMouseClicked
             String username = Username.getText().trim();
             String email = rEmail.getText().trim();
             String password = new String(rPassword.getPassword()).trim();

    // mao ni moklaro ug validate
    if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
             JOptionPane.showMessageDialog(this,
                "All fields are required!",
                "Validation Error",
             JOptionPane.ERROR_MESSAGE);
return;
              }

             config con = new config();

try {

 if (con.emailExists(email)) {
             JOptionPane.showMessageDialog(this,
                "Email already exists!",
                "Registration Error",
              JOptionPane.ERROR_MESSAGE);
return;
             }

             String insertSql = "INSERT INTO tbl_Acc (name, email, password, type, status) VALUES (?, ?, ?, ?, ?)";

            String hashedPassword = con.hashPassword(password);
            
            con.addRecord(insertSql,
            username,
            email,
            hashedPassword,
            "reader",
            "PENDING");

             JOptionPane.showMessageDialog(this,
            "Registered Successfully! Waiting for admin approval.",
            "Success",
             JOptionPane.INFORMATION_MESSAGE);

 new login().setVisible(true);
 this.dispose();

} catch (Exception e) {
            JOptionPane.showMessageDialog(this,
            "Error: " + e.getMessage());
}

    }//GEN-LAST:event_SignUPPnlMouseClicked


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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel EmailIcon;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JLabel PasswordIcon;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JLabel RegisterHeader;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JLabel SignInBtn;
    private javax.swing.JPanel SignInRegister;
    private javax.swing.JPanel SignUPPnl;
    private javax.swing.JLabel SignUpRegister;
    private javax.swing.JLabel SystemLogo;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameLabel1;
    private javax.swing.JLabel accountTxt;
    private javax.swing.JTextField rEmail;
    private javax.swing.JPasswordField rPassword;
    // End of variables declaration//GEN-END:variables
}
