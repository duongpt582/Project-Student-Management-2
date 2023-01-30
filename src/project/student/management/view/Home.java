/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.student.management.view;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.student.management.controller.QuanLyImpl;
import project.student.management.database.DBConnection;
import project.student.management.model.SinhVien;
import project.student.management.model.SinhVienCTMau;
import project.student.management.model.SinhVienTinChi;

/**
 *
 * @author seape
 */
public class Home extends javax.swing.JPanel {
    QuanLyImpl ql = new QuanLyImpl();
    private Connection conn;
    private PreparedStatement ps;
    DefaultTableModel model;
    private String maSV;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        jPanel1.setVisible(false);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        themButton = new com.k33ptoo.components.KButton();
        suaBtn = new com.k33ptoo.components.KButton();
        xoaBtn = new com.k33ptoo.components.KButton();
        timkiemField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hotenTextField = new javax.swing.JTextField();
        maSVTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        khoahocTextField = new javax.swing.JTextField();
        gioitinhCombobox = new javax.swing.JComboBox<>();
        loaiSVComboBox = new javax.swing.JComboBox<>();
        nganhHocComboBox = new javax.swing.JComboBox<>();
        SUABUTTON = new com.k33ptoo.components.KButton();
        ngaySinhDC = new com.toedter.calendar.JDateChooser();
        THEMBUTTON = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        themButton.setText("Thêm sinh viên");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(themButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        suaBtn.setText("Chỉnh sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(suaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        xoaBtn.setText("Xóa sinh viên");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(xoaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        timkiemField.setText("Tìm kiếm với tên, mã sinh viên, khóa học");
        timkiemField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemFieldMouseClicked(evt);
            }
        });
        timkiemField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timkiemFieldKeyPressed(evt);
            }
        });
        kGradientPanel1.add(timkiemField, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 6, 570, 37));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Họ tên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã SV");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 46, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Giới tính");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 46, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 108, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 108, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Khóa học");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 108, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ngành học");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Loại SV");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 170, -1, -1));
        jPanel1.add(hotenTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 43, 150, -1));
        jPanel1.add(maSVTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 43, 140, -1));
        jPanel1.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 105, 140, -1));
        jPanel1.add(khoahocTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 105, 130, -1));

        gioitinhCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nam", "Nữ" }));
        jPanel1.add(gioitinhCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 43, 130, -1));

        loaiSVComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Tín chỉ", "Chương trình mẫu" }));
        jPanel1.add(loaiSVComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 167, 140, -1));

        nganhHocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Công nghệ thông tin", "Quản trị kinh doanh", "Kỹ thuật Cơ điện tử" }));
        jPanel1.add(nganhHocComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 167, 150, -1));

        SUABUTTON.setText("Sửa");
        SUABUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUABUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(SUABUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 153, -1));

        ngaySinhDC.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(ngaySinhDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 110, 180, -1));

        THEMBUTTON.setText("Thêm");
        THEMBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEMBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(THEMBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 154, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 980, 220));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại SV", "Họ tên", "Mã SV", "Giới tính", "Ngày sinh", "Email", "Khóa học", "Ngành học"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(90);
        }

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 850, 242));

        jLabel9.setText(".");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void timkiemFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemFieldMouseClicked
        // TODO add your handling code here:
        timkiemField.setText("");
    }//GEN-LAST:event_timkiemFieldMouseClicked

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Hãy chọn một sinh viên để xóa!");
        else if(jTable1.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một sinh viên để xóa!");
        else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa sinh viên khỏi danh sách không?",
                    "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                ql.xoaSV(maSV);
                JOptionPane.showMessageDialog(null, "Xóa sinh viên thành công!");
                showTable();
            } 
        }
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        SUABUTTON.setVisible(false);
        THEMBUTTON.setVisible(true);
    }//GEN-LAST:event_themButtonActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        SUABUTTON.setVisible(true);
        THEMBUTTON.setVisible(false);
    }//GEN-LAST:event_suaBtnActionPerformed

    private void timkiemFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemFieldKeyPressed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            List<SinhVien> listSV = ql.timKiemSV(timkiemField.getText());
            model.setRowCount(0);
            for (SinhVien sinhVien : listSV) {
                String loaiSV;
                if(sinhVien instanceof SinhVienCTMau)
                    loaiSV = "CTM";
                else loaiSV ="TC";
                String hoTen = sinhVien.getHoTen();
                String maSV = sinhVien.getMaSV();
                String gioiTinh = sinhVien.getGioiTinh();
                String ngaySinh = sinhVien.getNgaySinh();
                String email = sinhVien.getEmail();
                int khoaHoc = sinhVien.getKhoaHoc();
                String nganhHoc = sinhVien.getNganhHoc();
                model.addRow(new Object[]{
                loaiSV, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc
        });
            }
        }
    }//GEN-LAST:event_timkiemFieldKeyPressed

    private void THEMBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEMBUTTONActionPerformed
        // TODO add your handling code here:
        if( hotenTextField.getText().equals("") ||
            maSVTextField.getText().equals("") ||
            gioitinhCombobox.getSelectedIndex() == 0 ||
            ngaySinhDC.getDateFormatString().equals("") ||
            emailTextField.getText().equals("") ||
            khoahocTextField.getText().equals("") ||
            nganhHocComboBox.getSelectedIndex() == 0 || 
            loaiSVComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Không được để trống!");
        }
        else if(!isNumeric(khoahocTextField.getText())){
            JOptionPane.showMessageDialog(null, "Khoá học phải là số nguyên!");
        }
        else{
            SinhVien sinhVien = null;
            String loaiSV;
            String hoTen = hotenTextField.getText();
            String maSV = maSVTextField.getText();
            String gioiTinh = gioitinhCombobox.getSelectedItem().toString();
            String ngaySinh = convertUtilToSql(ngaySinhDC.getDate()).toString();
            String email = emailTextField.getText();
            int khoaHoc = Integer.parseInt(khoahocTextField.getText());
            String nganhHoc = nganhHocComboBox.getSelectedItem().toString();
            if(loaiSVComboBox.getSelectedIndex() == 1){
                loaiSV = "TC";
                sinhVien = new SinhVienTinChi(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
            }
            else if(loaiSVComboBox.getSelectedIndex() == 2){
                loaiSV = "CTM";
                sinhVien = new SinhVienCTMau(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
            }
            ql.themSV(sinhVien);
            JOptionPane.showMessageDialog(null, "Thêm sinh viên thành công!");
            showTable();
        }  
    }//GEN-LAST:event_THEMBUTTONActionPerformed

    private void SUABUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUABUTTONActionPerformed
        // TODO add your handling code here:
        SinhVien sinhVien = null;
        if(jTable1.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Hãy chọn một sinh viên để chỉnh sửa!");
        else if(jTable1.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một sinh viên để chỉnh sửa");
        else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn chỉnh sửa thông tin của sinh viên này không?",
                    "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                String hoTen = hotenTextField.getText();
                String maSV1 = maSVTextField.getText();
                String gioiTinh = gioitinhCombobox.getSelectedItem().toString();
                String ngaySinh = convertUtilToSql(ngaySinhDC.getDate()).toString();
                String email = emailTextField.getText();
                int khoaHoc = Integer.parseInt(khoahocTextField.getText());
                String nganhHoc = nganhHocComboBox.getSelectedItem().toString();
                String loaiSV;
                if(loaiSVComboBox.getSelectedIndex() == 1){
                    loaiSV = "TC";
                    sinhVien = new SinhVienTinChi(hoTen, maSV1, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                }
                else if(loaiSVComboBox.getSelectedIndex() == 2){
                    loaiSV = "CTM";
                    sinhVien = new SinhVienCTMau(hoTen, maSV1, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                }
                ql.suaThongTinSV(maSV, sinhVien);
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
                showTable();
            } 
        }
    }//GEN-LAST:event_SUABUTTONActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 1){
            maSV = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            try {
                getInformationFromTableToTxt();
            } catch (ParseException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private boolean isNumeric(String str) { 
        try {  
            Integer.parseInt(str);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    private void getInformationFromTableToTxt() throws ParseException{
        loaiSVComboBox.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        if(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString().equals("TC")){
            loaiSVComboBox.setSelectedItem("Tín chỉ");
        }
        else if(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString().equals("CTM")){
            loaiSVComboBox.setSelectedItem("Chương trình mẫu");
        }
        hotenTextField.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        maSVTextField.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        gioitinhCombobox.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        
        String ngaySinh = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        java.util.Date ngaySinhUltiDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinh);
        ngaySinhDC.setDate(ngaySinhUltiDate);
        
        emailTextField.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        khoahocTextField.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        nganhHocComboBox.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
    }
    
    private void showTable(){
        try {
            model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement("SELECT * FROM dssv");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String loaiSV = rs.getString("loaiSV");
                String hoTen = rs.getString("hoTen");
                String maSV = rs.getString("maSV");
                String gioiTinh = rs.getString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String email = rs.getString("Email");
                int khoaHoc = rs.getInt("khoahoc");
                String nganhHoc = rs.getString("nganhHoc");
                
                model.addRow(new Object[]{
                    loaiSV, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton SUABUTTON;
    private com.k33ptoo.components.KButton THEMBUTTON;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> gioitinhCombobox;
    private javax.swing.JTextField hotenTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField khoahocTextField;
    private javax.swing.JComboBox<String> loaiSVComboBox;
    private javax.swing.JTextField maSVTextField;
    private javax.swing.JComboBox<String> nganhHocComboBox;
    private com.toedter.calendar.JDateChooser ngaySinhDC;
    private com.k33ptoo.components.KButton suaBtn;
    private com.k33ptoo.components.KButton themButton;
    private javax.swing.JTextField timkiemField;
    private com.k33ptoo.components.KButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
