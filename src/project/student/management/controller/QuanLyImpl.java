/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.controller;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.student.management.interfaces.QuanLy;
import project.student.management.model.SinhVien;
import project.student.management.model.SinhVienCTMau;
import project.student.management.model.SinhVienTinChi;
import project.student.management.database.DBConnection;
import project.student.management.model.MonHoc;

/**
 *
 * @author Pham Thai Duong 20207595
 * and Nguyen Minh Duc 20207592
 */
public class QuanLyImpl implements QuanLy{
    private Connection conn;
    private PreparedStatement ps;

    @Override
    public void themSV(SinhVien sinhVien) { // ghi đè phương thức thêm sinh viên - Nguyen Minh Duc 20207592
        try {
            conn = DBConnection.getConnection(); // tạo kết nối tới cơ sở dữ liệu
            ps = conn.prepareStatement("INSERT INTO dssv"
                    + "(loaiSV, hoTen, maSV, gioiTinh, ngaySinh, Email, khoaHoc, nganhHoc) "
                    + "VALUES (?,?,?,?,?,?,?,?)"); // câu lệnh truy vấn cơ sở dữ liệu
            /**
             * các câu lệnh để lấy thông tin của tham số truyền vào và gán cho các tham số ở câu truy vấn
             */
            if(sinhVien instanceof SinhVienCTMau)
                ps.setString(1, "CTM");
            else ps.setString(1, "TC");
            ps.setString(2, sinhVien.getHoTen());
            ps.setString(3, sinhVien.getMaSV());
            ps.setString(4, sinhVien.getGioiTinh());
            ps.setString(5, sinhVien.getNgaySinh());
            ps.setString(6, sinhVien.getEmail());
            ps.setInt(7, sinhVien.getKhoaHoc());
            ps.setString(8, sinhVien.getNganhHoc());
            ps.executeUpdate(); // thêm sinh viên vào bảng
            conn.close(); // đóng kết nối cơ sở dữ liệu
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void xoaSV(String maSV) { // ghi đè phương thức xóa sinh viên - Nguyen Minh Duc 20207592
        try{
            conn = DBConnection.getConnection(); // tạo kết nối tới cơ sở dữ liệu 
            ps = conn.prepareStatement("DELETE FROM dsdk WHERE maSV=?"); // câu lệnh truy vấn cơ sở dữ liệu
            ps.setString(1, maSV); // gán giá trị tham số truyền vào cho tham số ở câu truy vấn
            ps.executeUpdate(); // xóa các môn đã đăng ký của sinh viên bị xóa
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try{
            conn = DBConnection.getConnection(); // tạo kết nối tới cơ sở dữ liệu
            ps = conn.prepareStatement("DELETE FROM dssv WHERE maSV=?"); // câu lệnh truy vấn cơ sở dữ liệu
            ps.setString(1, maSV); // gán giá trị tham số truyền vào cho tham số ở câu truy vấn
            ps.executeUpdate(); // xóa sinh viên khỏi bảng
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void suaThongTinSV(String maSV, SinhVien sinhVien) { // ghi đè phương thức chỉnh sửa thông tin sinh viên - Nguyen Minh Duc 20207592
        try{
            conn = DBConnection.getConnection(); // tạo kết nối cơ sở dữ liệu
            ps = conn.prepareStatement("UPDATE dssv "
                    + "SET loaiSV=?, hoTen=?, maSV=?, gioiTinh=?, ngaySinh=?, Email=?, khoaHoc=?, nganhHoc=? WHERE maSV=?"); // câu lệnh truy vấn cơ sở dữ liệu
            /**
             * các câu lệnh để lấy thông tin của tham số truyền vào và gán cho các tham số ở câu truy vấn
             */
            if(sinhVien instanceof SinhVienCTMau)
                ps.setString(1, "CTM");
            else ps.setString(1, "TC");
            ps.setString(2, sinhVien.getHoTen());
            ps.setString(3, sinhVien.getMaSV());
            ps.setString(4, sinhVien.getGioiTinh());
            ps.setString(5, sinhVien.getNgaySinh());
            ps.setString(6, sinhVien.getEmail());
            ps.setInt(7, sinhVien.getKhoaHoc());
            ps.setString(8, sinhVien.getNganhHoc());
            ps.setString(9, maSV);
            ps.executeUpdate(); // chỉnh sửa thông tin sinh viên
            conn.close(); // đóng kết nối cơ sở dữ liệu
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<SinhVien> timKiemSV(String valueSearch) { // ghi đè phương thức tìm kiếm sinh viên - Nguyen Minh Duc 20207592
        List<SinhVien> listSV = new ArrayList<SinhVien>();
        SinhVien sinhVien = null;
        try {
            conn = DBConnection.getConnection(); // tạo kết nối cơ sở dữ liệu
            ps = conn.prepareStatement("SELECT * FROM dssv WHERE hoTen like ? or maSV like ? or khoaHoc like ?"); // câu lệnh truy vấn cơ sở dữ liệu
            /**
             * các câu lệnh để lấy thông tin của tham số truyền vào và gán cho các tham số ở câu truy vấn
             */
            ps.setString(1, "%" + valueSearch + "%");
            ps.setString(2, "%" + valueSearch + "%");
            ps.setString(3, "%" + valueSearch + "%");
            ResultSet rs = ps.executeQuery(); // gán đối tượng tìm được vào biến "rs" kiểu ResultSet
            while(rs.next()){ // lưu các giá trị của các thuộc tính từ sinh viên tìm được vào các biến, 
                            // đồng thời khởi tạo đối tượng "sinhVien" mang các thuộc tính đó và thêm vào list sinh viên
                String loaiSV = rs.getString("loaiSV");
                String hoTen = rs.getString("hoTen");
                String maSV = rs.getString("maSV");
                String gioiTinh = rs.getString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String email = rs.getString("Email");
                int khoaHoc = rs.getInt("khoaHoc");
                String nganhHoc = rs.getString("nganhHoc");
                
                if(loaiSV.equals("CTM"))
                    sinhVien = new SinhVienCTMau(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                else
                    sinhVien = new SinhVienTinChi(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                listSV.add(sinhVien);
            }
            conn.close(); // đóng kết nối cơ sở dữ liệu
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSV; // trả về list sinh viên
    }

    @Override
    public List<SinhVien> timKiemSVTheoMon(String valueSearch) { // ghi đè phương thức tìm kiếm sinh viên theo môn học - Pham Thai Duong 20207595
        List<SinhVien> listSV = new ArrayList<SinhVien>();
        SinhVien sinhVien = null;
        try {
            conn = DBConnection.getConnection(); // tạo kết nối cơ sở dữ liệu
            ps = conn.prepareStatement("SELECT * FROM dsdk t1, monhoc t2, dssv t3 WHERE t1.maMonHoc LIKE ? AND t2.maMonHoc = t1.maMonHoc AND t3.maSV = t1.maSV "); // câu lệnh truy vấn cơ sở dữ liệu
            ps.setString(1, "%" + valueSearch + "%"); // gán giá trị tham số truyền vào cho tham số ở câu truy vấn
            ResultSet rs = ps.executeQuery(); // gán đối tượng tìm được vào biến "rs" kiểu ResultSet
            while(rs.next()){ // lưu các giá trị của các thuộc tính từ sinh viên tìm được vào các biến, 
                            // đồng thời khởi tạo đối tượng "sinhVien" mang các thuộc tính đó và thêm vào list sinh viên
                String loaiSV = rs.getString("loaiSV");
                String hoTen = rs.getString("hoTen");
                String maSV = rs.getString("maSV");
                String tenMonHoc = rs.getString("tenMonHoc");
                String maMonHoc = rs.getString("maMonHoc");
                int soTinChi = rs.getInt("soTinChi");
                double trongSo = rs.getDouble("trongSo");
                double diemGK = rs.getDouble("diemGK");
                double diemCK = rs.getDouble("diemCK");
                String hocKy = rs.getString("hocKy");
                int khoaHoc = rs.getInt("khoaHoc");
                String nganhHoc = rs.getString("nganhHoc");
                
                MonHoc monHoc = new MonHoc(tenMonHoc, maMonHoc, hocKy, trongSo, diemGK, diemCK, soTinChi);
                ArrayList<MonHoc> monHocArrayList = new ArrayList<>();
                monHocArrayList.add(monHoc);
                System.out.println("size array: " + monHocArrayList.size());
                
                if(loaiSV.equals("CTM"))
                    sinhVien = new SinhVienCTMau(hoTen, maSV, khoaHoc, nganhHoc, monHocArrayList);
                else
                    sinhVien = new SinhVienTinChi(hoTen, maSV, khoaHoc, nganhHoc, monHocArrayList);
                listSV.add(sinhVien);
            }
            conn.close(); // đóng kết nối cơ sở dữ liệu
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSV; // trả về list sinh viên
    }
    
    

    @Override
    public List<SinhVien> inDSSV(String loaiSV) { // ghi đè phương thức in danh sách sinh viên - Nguyen Minh Duc 20207592
        List<SinhVien> listSV = new ArrayList<SinhVien>();
        SinhVien sinhVien = null;
        try{
            conn = DBConnection.getConnection(); // tạo kết nối cơ sở dữ liệu
            ps = conn.prepareStatement("SELECT * FROM dssv WHERE loaiSV=?"); // câu lệnh truy vấn cơ sở dữ liệu
            ps.setString(1, loaiSV); // gán giá trị tham số truyền vào cho tham số ở câu truy vấn
            ResultSet rs = ps.executeQuery(); // gán đối tượng tìm được vào biến "rs" kiểu ResultSet
            while(rs.next()){ // lưu các giá trị của các thuộc tính từ sinh viên tìm được vào các biến, 
                            // đồng thời khởi tạo đối tượng "sinhVien" mang các thuộc tính đó và thêm vào list sinh viên
                String loaiSV1 = rs.getString("loaiSV");
                String hoTen = rs.getString("hoTen");
                String maSV = rs.getString("maSV");
                String gioiTinh = rs.getString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String email = rs.getString("Email");
                int khoaHoc = rs.getInt("khoaHoc");
                String nganhHoc = rs.getString("nganhHoc");
                
                if(loaiSV1.equals("CTM"))
                    sinhVien = new SinhVienCTMau(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                else
                    sinhVien = new SinhVienTinChi(hoTen, maSV, gioiTinh, ngaySinh, email, khoaHoc, nganhHoc);
                
                listSV.add(sinhVien);
            }
            conn.close(); // đóng kết nối cơ sở dữ liệu
        }
        catch(SQLException ex){
            Logger.getLogger(QuanLyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSV; // trả về list sinh viên
    }

    @Override
    public List<SinhVien> inDSSVDuocTotNghiep(List<SinhVien> sinhViens) { // ghi đè phương thức in danh sách sinh viên được tốt nghiệp - Pham Thai Duong 20207595
        
        SinhVien sinhVien = new SinhVien() {};
        
        List<SinhVien> sinhVienList = new ArrayList<>();
        
        for (int i = 0; i < sinhViens.size(); i++) { // duyệt các đối tượng của sinhVienList và kiểm tra có được tốt nghiệp hay không
            if (sinhViens.get(i) != null) {
                boolean duocTotNghiep = sinhVien.xetTotNghiep(sinhViens.get(i));
                System.out.println("duoc tot nghiep: " + sinhViens.get(i).getHoTen() + "---> " + duocTotNghiep);
                
                if (duocTotNghiep) {
                    sinhVienList.add(sinhViens.get(i));
                }
            }
        }
        
        return sinhVienList;
    }
}
