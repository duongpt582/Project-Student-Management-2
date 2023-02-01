/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.student.management.view;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import project.student.management.controller.QuanLyImpl;
import project.student.management.database.DBConnection;
import project.student.management.model.MonHoc;
import project.student.management.model.SinhVien;
import project.student.management.model.SinhVienCTMau;
import project.student.management.model.SinhVienTinChi;

/**
 *
 * @author seape and duongpt
 */
public class TotNghiep extends javax.swing.JPanel {

    private DefaultTableModel model;
    /**
     * Creates new form Home
     */
    
    private QuanLyImpl quanLyImpl;
    private Connection conn;
    private PreparedStatement ps;

    public TotNghiep() {
        initComponents();
        
        quanLyImpl = new QuanLyImpl();
        
//        SinhVienTinChi sinhVienTinChi = new SinhVienTinChi(5,5);
        List<SinhVien> sinhViens = layDanhSachSinhVien();
        List<SinhVien> DSSVDuocTotNghiep = quanLyImpl.inDSSVDuocTotNghiep(sinhViens);
        
        showTable(DSSVDuocTotNghiep);
    }
    private void showTable(List<SinhVien> sinhViens){
        String loaiSV = null;
        model = (DefaultTableModel) danhsachTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i) instanceof SinhVienCTMau) {
                loaiSV = "CTM";
            } else if (sinhViens.get(i) instanceof SinhVienTinChi) {
                loaiSV = "TC";
            }
            model.addRow(new Object[]{
                sinhViens.get(i).getHoTen(),
                sinhViens.get(i).getMaSV(),
                sinhViens.get(i).getGioiTinh(),
                sinhViens.get(i).getNgaySinh(),
                sinhViens.get(i).getEmail(),
                sinhViens.get(i).getKhoaHoc(),
                sinhViens.get(i).getNganhHoc(),
                loaiSV
            });
        }
       
           
        
    }

    
    private SinhVien xuLyTotNghiepMotSV(String maSV, String nganhHoc) {
        SinhVien sinhVien = null;
        ArrayList<SinhVien> listSV = new ArrayList<>();
        ArrayList<MonHoc> monHocList = new ArrayList<>();
        String loaiSV = null, hoTen = null, maSv, gioiTinh = null, ngaySinh = null, email = null,tenMonHoc;
        int khoaHoc = 0, soTinChi, tongSoTinChi = 0, soTinChiDaHoanThanh = 0, soMonHocDaHoanThanh = 0;
        double diemGK, diemCK, trongSo, diemTB = 0, diem = 0;
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(
                    "SELECT t4.loaiSV, t4.hoTen, t4.gioiTinh, t4.ngaySinh, t4.Email, t4.khoaHoc, t1.maSV, t2.tenMonHoc, t2.nganhHoc, t2.soTinChi, t3.tongSoTC, t1.diemGK, t1.diemCK, t2.trongSo "
                            + "FROM dsdk t1, monhoc t2, ctdt t3, dssv t4 "
                            + "WHERE t1.maSV = ? AND t1.maMonHoc = t2.maMonHoc AND t2.nganhHoc LIKE ? AND t3.nganhHoc LIKE ? AND t4.maSV like ?");
            ps.setString(1, maSV);
            ps.setString(2, "%" + nganhHoc + "%");
            ps.setString(3, "%" + nganhHoc + "%");
            ps.setString(4, "%" + maSV + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                loaiSV = rs.getString("loaiSV");
                hoTen = rs.getString("hoTen");
                maSv = rs.getString("maSV");
                gioiTinh = rs.getString("gioiTinh");
                ngaySinh = rs.getString("ngaySinh");
                email = rs.getString("Email");
                khoaHoc = rs.getInt("khoaHoc");
                tenMonHoc = rs.getString("tenMonHoc");
                soTinChi = rs.getInt("soTinChi");
                tongSoTinChi = rs.getInt("tongSoTC");
                diemGK = rs.getDouble("diemGK");
                diemCK = rs.getDouble("diemCK");
                trongSo = rs.getDouble("trongSo");
                
                MonHoc monHoc = new MonHoc(tenMonHoc, nganhHoc, trongSo, diemGK, diemCK, soTinChi);
                monHocList.add(monHoc);

            }
            
            for (int i = 0; i < monHocList.size(); i++) {
                double diemTongKet = (monHocList.get(i).getDiemGK() * monHocList.get(i).getTrongSo() +
                                    monHocList.get(i).getDiemCK() * ( 1.0 - monHocList.get(i).getTrongSo()));
                if (diemTongKet >= 5.0) {
                    soTinChiDaHoanThanh += monHocList.get(i).getSoTinChi();
                    soMonHocDaHoanThanh ++;
                    
                    diem += diemTongKet;
                    System.out.println("tong so tin chi: " + soTinChiDaHoanThanh);
                }
            }
            
            diemTB = diem / (double)monHocList.size();
            
            if (loaiSV != null) {
                if(loaiSV.equals("CTM")) {
                    sinhVien = new SinhVienCTMau(soMonHocDaHoanThanh, diemTB, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, monHocList);
                } else {
                    sinhVien = new SinhVienTinChi(soTinChiDaHoanThanh, tongSoTinChi, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, monHocList);

                }
                listSV.add(sinhVien);
            }

            
            System.out.println("size monhoclist: " + monHocList.size());
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sinhVien;
    }
    
    private List<SinhVien> layDanhSachSinhVien() {
        SinhVien sinhVien = null;
        ArrayList<SinhVien> listSV = new ArrayList<>();
         try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement("SELECT * FROM dssv");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String maSV = rs.getString("maSV");
                String nganhHoc = rs.getString("nganhHoc");
                
                sinhVien = xuLyTotNghiepMotSV(maSV, nganhHoc);
                listSV.add(sinhVien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSV;
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
        danhsachTable = new javax.swing.JTable();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        danhsachTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Mã SV", "Giới tính", "Ngày sinh", "Email", "Khóa học", "Ngành học", "Loại SV"
            }
        ));
        jScrollPane1.setViewportView(danhsachTable);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Danh sách sinh viên được tốt nghiệp");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel1)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(103, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable danhsachTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
