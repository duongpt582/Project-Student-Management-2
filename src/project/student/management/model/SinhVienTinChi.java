/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SinhVienTinChi extends SinhVien{
    private int soTinChiHoanThanh;

    public SinhVienTinChi(int soTinChiHoanThanh, String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc, ArrayList<MonHoc> listMonHoc) {
        super(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, listMonHoc);
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }
    
    public SinhVienTinChi(String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc){
        super(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
    }

    public int getSoTinChiHoanThanh() {
        return soTinChiHoanThanh;
    }

    public void setSoTinChiHoanThanh(int soTinChiHoanThanh) {
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }

    @Override
    public boolean xetTotNghiep() {
        super.xetTotNghiep(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return false;
    }
    
    
}
