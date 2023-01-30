/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;
import java.util.Date;


public class SinhVienTinChi extends SinhVien{
    private int soTinChiHoanThanh;

    public SinhVienTinChi(int soTinChiHoanThanh, String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, ChuongTrinhDaoTao nganhHoc, ArrayList<MonHoc2> listMonHoc) {
        super(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, LoaiSinhVien.TC, nganhHoc, listMonHoc);
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }


    

    

    public int getSoTinChiHoanThanh() {
        return soTinChiHoanThanh;
    }

    public void setSoTinChiHoanThanh(int soTinChiHoanThanh) {
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }

    @Override
    public boolean xetTotNghiep() {
        super.xetTotNghiep();
        return false;
    }
    
    
}
