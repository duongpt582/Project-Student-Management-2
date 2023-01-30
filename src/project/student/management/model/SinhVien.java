/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;
import java.util.Date;
import project.student.management.interfaces.XetTotNghiep;

/**
 *
 * @author duongpt
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
    private LoaiSinhVien loaiSinhVien;
    private ChuongTrinhDaoTao nganhHoc;
    private ArrayList<MonHoc2> listMonHoc;

    public SinhVien(String hoTen, String maSV, String gioiTinh, String ngaySinh, String email, int khoaHoc, LoaiSinhVien loaiSinhVien, ChuongTrinhDaoTao nganhHoc, ArrayList<MonHoc2> listMonHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.khoaHoc = khoaHoc;
        this.loaiSinhVien = loaiSinhVien;
        this.nganhHoc = nganhHoc;
        this.listMonHoc = listMonHoc;
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

    public LoaiSinhVien getLoaiSinhVien() {
        return loaiSinhVien;
    }

    public void setLoaiSinhVien(LoaiSinhVien loaiSinhVien) {
        this.loaiSinhVien = loaiSinhVien;
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

    public ChuongTrinhDaoTao getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(ChuongTrinhDaoTao nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public ArrayList<MonHoc2> getListMonHoc() {
        return listMonHoc;
    }

    public void setListMonHoc(ArrayList<MonHoc2> listMonHoc) {
        this.listMonHoc = listMonHoc;
    }

    

    @Override
    public boolean xetTotNghiep() {
        return true;
    }
    
    
}
