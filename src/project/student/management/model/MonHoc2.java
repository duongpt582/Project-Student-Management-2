/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

/**
 *
 * @author ASUS
 */
public class MonHoc2 {
    private ChuongTrinhDaoTao nganhHoc;
    private String tenMonHoc;
    private String maMonHoc;
    private double trongSo;
    private int soTinChi;

    public MonHoc2(ChuongTrinhDaoTao nganhHoc, String tenMonHoc, String maMonHoc, double trongSo, int soTinChi) {
        this.nganhHoc = nganhHoc;
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.trongSo = trongSo;
        this.soTinChi = soTinChi;
    }

    public ChuongTrinhDaoTao getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(ChuongTrinhDaoTao nganhHoc) {
        this.nganhHoc = nganhHoc;
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

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo = trongSo;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    
}
