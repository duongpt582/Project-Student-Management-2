/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.interfaces;

import java.util.List;
import project.student.management.model.SinhVien;

/**
 *
 * @author Pham Thai Duong
 */
public interface QuanLy {
    public void themSV(SinhVien sinhVien);
    public void xoaSV(String maSV);
    public void suaThongTinSV(String maSV, SinhVien sinhVien);
    public List<SinhVien> timKiemSV(String valueSearch);
    public List<SinhVien> inDSSV(String loaiSV);
    public List<SinhVien> inDSSVDuocTotNghiep();
    
}
