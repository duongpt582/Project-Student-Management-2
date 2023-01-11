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
    public void xoaSV(int maSV);
    public void suaThongTinSV(int maSV, SinhVien sinhVien);
    public SinhVien timKiemSV(String valueSearch);
    public List<SinhVien> inDSSV();
    public List<SinhVien> inDSSVDuocTotNghiep();
    
}
