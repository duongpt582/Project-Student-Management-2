/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.student.management.view;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.student.management.controller.QuanLyImpl;
import project.student.management.database.DBConnection;
import project.student.management.model.ChuongTrinhDaoTao;
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
    private String loaiSV;
    private String hoTen;
    private String maSV;
    private String gioiTinh;
    private String ngaySinh;
    private String email;
    private int khoaHoc;
    private ChuongTrinhDaoTao nganhHoc;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        THEMBUTTON = new com.k33ptoo.components.KButton();
        hotenTextField = new javax.swing.JTextField();
        nganhsinhTextField = new javax.swing.JTextField();
        maSVTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        khoahocTextField = new javax.swing.JTextField();
        gioitinhCombobox = new javax.swing.JComboBox<>();
        loaiSVTextField = new javax.swing.JComboBox<>();
        nganhhocTextField = new javax.swing.JComboBox<>();
        SUABUTTON = new com.k33ptoo.components.KButton();

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

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));

        themButton.setText("Thêm sinh viên");
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        suaBtn.setText("Chỉnh sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });

        xoaBtn.setText("Xóa sinh viên");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Họ tên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã SV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Giới tính");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Khóa học");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ngành học");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Loại SV");

        THEMBUTTON.setText("Thêm");

        gioitinhCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        gioitinhCombobox.setSelectedIndex(-1);

        loaiSVTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tín chỉ", "Chương trình mẫu" }));
        loaiSVTextField.setSelectedIndex(-1);

        nganhhocTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Quản trị kinh doanh", "Kỹ thuật Cơ điện tử" }));
        nganhhocTextField.setSelectedIndex(-1);

        SUABUTTON.setText("Sửa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hotenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(nganhsinhTextField)
                    .addComponent(nganhhocTextField, 0, 1, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maSVTextField)
                    .addComponent(emailTextField)
                    .addComponent(loaiSVTextField, 0, 130, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(khoahocTextField)
                            .addComponent(gioitinhCombobox, 0, 130, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(THEMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SUABUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(hotenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioitinhCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(nganhsinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khoahocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(THEMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nganhhocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUABUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(timkiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(timkiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void timkiemFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemFieldMouseClicked
        // TODO add your handling code here:
        timkiemField.setText("");
    }//GEN-LAST:event_timkiemFieldMouseClicked

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked
        // TODO add your handling code here:
//        ThemSV themSV = new ThemSV();
//        themSV.setVisible(true);
    }//GEN-LAST:event_themButtonMouseClicked

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 1){
            loaiSV = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            hoTen = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
            maSV = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
            gioiTinh = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
            ngaySinh = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
            email = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 5);
            khoaHoc = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 6);
            nganhHoc.setNganhHoc((String) jTable1.getValueAt(jTable1.getSelectedRow(), 7));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
//        ThemSV themSV = new ThemSV();
//        themSV.setVisible(true);
//        if(!themSV.isVisible()){
//            showTable();
//        }
           jPanel1.setVisible(true);
           SUABUTTON.setVisible(false);
           THEMBUTTON.setVisible(true);
    }//GEN-LAST:event_themButtonActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
           jPanel1.setVisible(true);
           SUABUTTON.setVisible(true);
           THEMBUTTON.setVisible(false);
        SinhVien sinhVien = null;
        if(loaiSV.equals(SinhVien.LoaiSinhVien.CTM))
            sinhVien = new SinhVienCTMau(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, 0.5, 5);
        else sinhVien = new SinhVienTinChi(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
        if(jTable1.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Hãy chọn một sinh viên để chỉnh sửa!");
        else if(jTable1.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một sinh viên để chỉnh sửa");
        else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn chỉnh sửa thông tin của sinh viên này không?",
                    "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ql.suaThongTinSV(maSV, sinhVien);
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
                showTable();
            } 
        }
    }//GEN-LAST:event_suaBtnActionPerformed

    private void timkiemFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemFieldKeyPressed
        // TODO add your handling code here:
        List<SinhVien> listSV = ql.timKiemSV(timkiemField.getText());
        model = (DefaultTableModel) jTable1.getModel();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
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
                ChuongTrinhDaoTao nganhHoc = sinhVien.getNganhHoc();
                model.addRow(new Object[]{
                loaiSV, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc
        });
            }
        }
    }//GEN-LAST:event_timkiemFieldKeyPressed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField khoahocTextField;
    private javax.swing.JComboBox<String> loaiSVTextField;
    private javax.swing.JTextField maSVTextField;
    private javax.swing.JComboBox<String> nganhhocTextField;
    private javax.swing.JTextField nganhsinhTextField;
    private com.k33ptoo.components.KButton suaBtn;
    private com.k33ptoo.components.KButton themButton;
    private javax.swing.JTextField timkiemField;
    private com.k33ptoo.components.KButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
