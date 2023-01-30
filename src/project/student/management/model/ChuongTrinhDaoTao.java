/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

public class ChuongTrinhDaoTao {
    private  String nganhHoc;
    private String maNganh;
    private int tongSoTC;
    private int tongSoMon;

    public ChuongTrinhDaoTao(String nganhHoc, String maNganh, int tongSoTC, int tongSoMon) {
        this.nganhHoc = nganhHoc;
        this.maNganh = maNganh;
        this.tongSoTC = tongSoTC;
        this.tongSoMon = tongSoMon;
    }

    public ChuongTrinhDaoTao() {
    }
    
    

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public int getTongSoTC() {
        return tongSoTC;
    }

    public void setTongSoTC(int tongSoTC) {
        this.tongSoTC = tongSoTC;
    }

    public int getTongSoMon() {
        return tongSoMon;
    }

    public void setTongSoMon(int tongSoMon) {
        this.tongSoMon = tongSoMon;
    }

    @Override
    public String toString() {
        return "ChuongTrinhDaoTao{" + "nganhHoc=" + nganhHoc + ", maNganh=" + maNganh + ", tongSoTC=" + tongSoTC + ", tongSoMon=" + tongSoMon + '}';
    }
    
    
}
