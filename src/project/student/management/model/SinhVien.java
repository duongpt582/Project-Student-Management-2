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
    private String email;
    private String khoaHoc;
    private ArrayList<MonHoc> listMonHoc;

    public SinhVien(String hoTen, String maSV, String gioiTinh, String email, String khoaHoc, ArrayList<MonHoc> listMonHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.khoaHoc = khoaHoc;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
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
