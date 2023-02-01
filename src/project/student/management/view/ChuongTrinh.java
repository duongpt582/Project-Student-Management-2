/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
// do van hai 20207600
package project.student.management.view;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import project.student.management.controller.QuanLyImpl;
import project.student.management.model.SinhVien;

/**
 *
 * @author seape
 */
public class ChuongTrinh extends javax.swing.JPanel {
    QuanLyImpl ql = new QuanLyImpl();
    DefaultTableModel model;
    /**
     * Creates new form Home
     */
    public ChuongTrinh() {
        initComponents();
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
        chuongtrinh_tinchiButton = new com.k33ptoo.components.KButton();
        chuongtrinh_mauButton = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 690));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));

        chuongtrinh_tinchiButton.setText("Chương trình tín chỉ");
        chuongtrinh_tinchiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuongtrinh_tinchiButtonActionPerformed(evt);
            }
        });

        chuongtrinh_mauButton.setText("Chương trình mẫu");
        chuongtrinh_mauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuongtrinh_mauButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Mã SV", "Giới tính", "Ngày sinh", "Email", "Khóa học", "Ngành học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chuongtrinh_tinchiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(chuongtrinh_mauButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chuongtrinh_tinchiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chuongtrinh_mauButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chuongtrinh_tinchiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuongtrinh_tinchiButtonActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        List<SinhVien> listSV = ql.inDSSV("TC");
        for (SinhVien sinhVien : listSV) {
            String hoTen = sinhVien.getHoTen();
            String maSV = sinhVien.getMaSV();
            String gioiTinh = sinhVien.getGioiTinh();
            String ngaySinh = sinhVien.getNgaySinh();
            String email = sinhVien.getEmail();
            int khoaHoc = sinhVien.getKhoaHoc();
            String nganhHoc = sinhVien.getNganhHoc();
            model.addRow(new Object[]{
            hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc
        });
        }
    }//GEN-LAST:event_chuongtrinh_tinchiButtonActionPerformed

    private void chuongtrinh_mauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuongtrinh_mauButtonActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        List<SinhVien> listSV = ql.inDSSV("CTM");
        for (SinhVien sinhVien : listSV) {
            String hoTen = sinhVien.getHoTen();
            String maSV = sinhVien.getMaSV();
            String gioiTinh = sinhVien.getGioiTinh();
            String ngaySinh = sinhVien.getNgaySinh();
            String email = sinhVien.getEmail();
            int khoaHoc = sinhVien.getKhoaHoc();
            String nganhHoc = sinhVien.getNganhHoc();
            model.addRow(new Object[]{
            hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc
        });
        }
    }//GEN-LAST:event_chuongtrinh_mauButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton chuongtrinh_mauButton;
    private com.k33ptoo.components.KButton chuongtrinh_tinchiButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
