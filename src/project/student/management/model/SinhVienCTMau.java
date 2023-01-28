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
public class SinhVienCTMau extends SinhVien{
    private int soMonHocHoanThanh;
    private double diemTB;

    public SinhVienCTMau(int soMonHocHoanThanh, double diemTB, String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc, ArrayList<MonHoc> listMonHoc) {
        super(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc, listMonHoc);
        this.soMonHocHoanThanh = soMonHocHoanThanh;
        this.diemTB = diemTB;
    }
    
    public SinhVienCTMau(String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc){
        super(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
    }

    public int getSoMonHocHoanThanh() {
        return soMonHocHoanThanh;
    }

    public void setSoMonHocHoanThanh(int soMonHocHoanThanh) {
        this.soMonHocHoanThanh = soMonHocHoanThanh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    @Override
    public boolean xetTotNghiep() {
        super.xetTotNghiep(); 
        return true;
    }
    
    
}
