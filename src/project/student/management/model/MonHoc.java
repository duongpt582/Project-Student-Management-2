/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

/**
 *
 * @author duongpt
 */
public class MonHoc {
    private String tenMonHoc;
    private String maMonHoc;
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
    
    public double tinhDiemTB() {
        return (diemGK * trongSo + diemCK * trongSo);
    }
}
