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
    public void themSV(SinhVien sinhVien); // phương thức thêm sinh viên
    public void xoaSV(String maSV); // phương thức xóa sinh viên
    public void suaThongTinSV(String maSV, SinhVien sinhVien); // phương thức chỉnh sửa thông tin sinh viên
    public List<SinhVien> timKiemSV(String valueSearch); // phương thức tìm kiếm sinh viên 
    public List<SinhVien> timKiemSVTheoMon(String valueSearch); // phương thức tìm kiếm sinh viên theo môn học
    public List<SinhVien> inDSSV(String loaiSV); // phương thức in danh sách sinh viên
    public List<SinhVien> inDSSVDuocTotNghiep(List<SinhVien> sinhViens); // phương thức in danh sách sinh viên được tốt nghiệp
    
}
