// do van hai 20207600
package project.student.management.view;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JFrame {

    // set tai khoan, mat khau mac dinh
    private String username = "admin";
    private char[] password = {'1','2','3','4'};
    
    public DangNhap() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        textField_DangNhap = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dangNhap_button = new com.k33ptoo.components.KButton();
        hienMatKhau_checkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/graduated.png"))); // NOI18N
        jLabel1.setText("Quản lý sinh viên");

        textField_DangNhap.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        textField_DangNhap.setText("Nhập tài khoản");
        textField_DangNhap.setToolTipText("Nhập tài khoản");
        textField_DangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 204, 153)));
        textField_DangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField_DangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_DangNhapMouseClicked(evt);
            }
        });

        passwordField.setText("PassWord");
        passwordField.setToolTipText("Nhập mật khẩu");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 204, 153)));
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel2.setText("Tài khoản");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N
        jLabel3.setText("Mật khẩu");

        dangNhap_button.setText("Đăng nhập");
        dangNhap_button.setkEndColor(new java.awt.Color(255, 204, 255));
        dangNhap_button.setkStartColor(new java.awt.Color(204, 204, 0));
        dangNhap_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangNhap_buttonMouseClicked(evt);
            }
        });

        hienMatKhau_checkbox.setText("Hiện mật khẩu");
        hienMatKhau_checkbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hienMatKhau_checkboxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dangNhap_button, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hienMatKhau_checkbox))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textField_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hienMatKhau_checkbox)
                .addGap(44, 44, 44)
                .addComponent(dangNhap_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // click chuot vao text field se reset 
    private void textField_DangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_DangNhapMouseClicked
        // TODO add your handling code here:
        textField_DangNhap.setText("");
    }//GEN-LAST:event_textField_DangNhapMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked
      // set hien mat khau
    private void hienMatKhau_checkboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hienMatKhau_checkboxStateChanged
        // TODO add your handling code here:
        if(hienMatKhau_checkbox.isSelected()) {
            passwordField.setEchoChar((char)0);
        }
        else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_hienMatKhau_checkboxStateChanged
// check tai khoan mat khau 
    private void dangNhap_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangNhap_buttonMouseClicked
        // TODO add your handling code here:
         String userInput;
        char[] passwordInput;
        
        userInput = textField_DangNhap.getText();
        passwordInput = passwordField.getPassword();
        
        if((username.equals(userInput)) && (Arrays.equals(password, passwordInput))){
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập chuẩn.","",JOptionPane.PLAIN_MESSAGE);
                                    
                    dispose();
                }
         else {
             JOptionPane.showMessageDialog(null, "SAI","",JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_dangNhap_buttonMouseClicked
 // dang nhap bang phim enter
    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             String userInput;
             char[] passwordInput;
        
        userInput = textField_DangNhap.getText();
        passwordInput = passwordField.getPassword();
        
        if((username.equals(userInput)) && (Arrays.equals(password, passwordInput))){
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập chuẩn.","",JOptionPane.PLAIN_MESSAGE);
                                    
                    dispose();
                }
         else {
             JOptionPane.showMessageDialog(null, "SAI","",JOptionPane.ERROR_MESSAGE);
         }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

  
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton dangNhap_button;
    private javax.swing.JCheckBox hienMatKhau_checkbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textField_DangNhap;
    // End of variables declaration//GEN-END:variables
}
