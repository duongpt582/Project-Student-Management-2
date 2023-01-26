/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.controller;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.student.management.interfaces.QuanLy;
import project.student.management.model.SinhVien;
import project.student.management.model.SinhVienCTMau;
import project.student.management.model.SinhVienTinChi;
import project.student.management.database.DBConnection;

/**
 *
 * @author Pham Thai Duong and Nguyen Minh Duc
 */
public class QuanLyImpl implements QuanLy{
    private Connection conn;
    private PreparedStatement ps;

    @Override
    public void themSV(SinhVien sinhVien) {
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement("INSERT INTO dssv"
                    + "(loaiSV, hoTen, maSV, gioiTinh, ngaySinh, Email, khoaHoc, nganhHoc) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            if(sinhVien instanceof SinhVienCTMau)
                ps.setString(1, "CTM");
            else ps.setString(1, "TC");
            ps.setString(2, sinhVien.getHoTen());
            ps.setString(3, sinhVien.getMaSV());
            ps.setString(4, sinhVien.getGioiTinh());
            ps.setString(5, sinhVien.getNgaySinh());
            ps.setString(6, sinhVien.getEmail());
            ps.setString(7, sinhVien.getKhoaHoc());
            ps.setString(8, sinhVien.getNganhHoc());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void xoaSV(String maSV) {
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement("DELETE FROM dssv WHERE maSV=?");
            ps.setString(1, maSV);
            ps.executeUpdate();
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void suaThongTinSV(String maSV, SinhVien sinhVien) {
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement("UPDATE dssv "
                    + "SET loaiSV=?, hoTen=?, maSV=?, gioiTinh=?, ngaySinh=?, Email=?, khoaHoc=?, nganhHoc=? WHERE maSV=?");
            if(sinhVien instanceof SinhVienCTMau)
                ps.setString(1, "CTM");
            else ps.setString(1, "TC");
            ps.setString(2, sinhVien.getHoTen());
            ps.setString(3, sinhVien.getMaSV());
            ps.setString(4, sinhVien.getGioiTinh());
            ps.setString(5, sinhVien.getNgaySinh());
            ps.setString(6, sinhVien.getEmail());
            ps.setString(7, sinhVien.getKhoaHoc());
            ps.setString(8, sinhVien.getNganhHoc());
            ps.setString(9, maSV);
            ps.executeUpdate();
            conn.close();
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SinhVien timKiemSV(String valueSearch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SinhVien> inDSSV(String loaiSV) {
        List<SinhVien> listSV = new ArrayList<SinhVien>();
        SinhVien sinhVien;
//        try{
//            conn = DBConnection.getConnection();
//            ps = conn.prepareStatement("SELECT * FROM dssv WHERE loaiSV=?");
//            ps.setString(1, loaiSV);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                String loaiSV1 = rs.getString("loaiSV");
//                String hoTen = rs.getString("hoTen");
//                String maSV = rs.getString("maSV");
//                String gioiTinh = rs.getString("gioiTinh");
//                String ngaySinh = rs.getString("ngaySinh");
//                String email = rs.getString("Email");
//                String khoaHoc = rs.getString("khoaHoc");
//                String nganhHoc = rs.getString("nganhHoc");
//                
//                if(loaiSV1.equals("CTM"))
//                    sinhVien = new SinhVienCTMau(0, 0, hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, listMonHoc)
//            }
//        }
//        catch(SQLException ex){
//            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return listSV;
    }

    @Override
    public List<SinhVien> inDSSVDuocTotNghiep() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
