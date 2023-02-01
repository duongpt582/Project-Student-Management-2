/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;
import project.student.management.interfaces.XetTotNghiep;

/**
 *
 * @author Pham Thai Duong 20207595
 */
public abstract class SinhVien implements XetTotNghiep{
    public static enum LoaiSinhVien{
        TC, CTM;
    }
    
    private String hoTen;
    private String maSV;
    private String gioiTinh;
    private String ngaySinh;
    private String email;
    private int khoaHoc;
    private String nganhHoc;
    private ArrayList<MonHoc> listMonHoc;

    public SinhVien(String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc, ArrayList<MonHoc> listMonHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.khoaHoc = khoaHoc;
        this.nganhHoc = nganhHoc;
        this.listMonHoc = listMonHoc;
    }
    
    public SinhVien(String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, String nganhHoc){
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.khoaHoc = khoaHoc;
        this.nganhHoc = nganhHoc;
    }

    public SinhVien(String hoTen, String maSV, int khoaHoc, String nganhHoc, ArrayList<MonHoc> listMonHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.khoaHoc = khoaHoc;
        this.nganhHoc = nganhHoc;
        this.listMonHoc = listMonHoc;
    }

    public SinhVien() {
    }

    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public ArrayList<MonHoc> getListMonHoc() {
        return listMonHoc;
    }

    public void setListMonHoc(ArrayList<MonHoc> listMonHoc) {
        this.listMonHoc = listMonHoc;
    }

    @Override
    public boolean xetTotNghiep(SinhVien sinhvien) {
        if (sinhvien instanceof SinhVienCTMau) {
            if (((SinhVienCTMau) sinhvien).getDiemTB() > 5.0 &&
                    ((SinhVienCTMau) sinhvien).getDiemTB() <= 10.0 
                    && ((SinhVienCTMau) sinhvien).getSoMonHocHoanThanh() == 5) {
                return true;
            } else {
                return false;
            }
        } else if (sinhvien instanceof SinhVienTinChi) {
            if (((SinhVienTinChi) sinhvien).getSoTinChiHoanThanh() == ((SinhVienTinChi) sinhvien).getTongSoTinChi()) {
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    }
    
    
}
