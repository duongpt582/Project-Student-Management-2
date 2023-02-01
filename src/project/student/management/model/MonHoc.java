/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

/**
 *
 * @author Pham Thai Duong 20207595
 */
public class MonHoc {
    private String tenMonHoc;
    private String maMonHoc;
    private String nganhHoc;
    private String hocKy;
    private double trongSo;
    private double diemGK;
    private double diemCK;
    private int soTinChi;

    public MonHoc(String tenMonHoc, String maMonHoc, String hocKy, double trongSo, double diemGK, double diemCK, int soTinChi) {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.hocKy = hocKy;
        this.trongSo = trongSo;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.soTinChi = soTinChi;
    }

    public MonHoc(String tenMonHoc, String maMonHoc, String nganhHoc, double trongSo, int soTinChi) {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.nganhHoc = nganhHoc;
        this.trongSo = trongSo;
        this.soTinChi = soTinChi;
    }

    public MonHoc(String tenMonHoc, String nganhHoc, double trongSo, double diemGK, double diemCK, int soTinChi) {
        this.tenMonHoc = tenMonHoc;
        this.nganhHoc = nganhHoc;
        this.trongSo = trongSo;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.soTinChi = soTinChi;
    }
    
    

    public MonHoc() {
    }
    
    

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo = trongSo;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public void setDiemGK(double diemGK) {
        this.diemGK = diemGK;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(double diemCK) {
        this.diemCK = diemCK;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    
    
    public double tinhDiemTB() {
        return (diemGK * trongSo + diemCK * trongSo);
    }
}
