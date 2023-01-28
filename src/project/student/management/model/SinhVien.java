/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;
import project.student.management.interfaces.XetTotNghiep;

/**
 *
 * @author duongpt
 */
public abstract class SinhVien implements XetTotNghiep{
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
    public boolean xetTotNghiep() {
        return true;
    }
    
    
}
