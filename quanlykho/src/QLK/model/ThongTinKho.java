/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

/**
 *
 * @author ADMIN
 */
public class ThongTinKho {
    private int maKho;
    private String maNCC;
    private String maSP;
    private int soLuong;
    private float giaXuat;

    public ThongTinKho(int maKho, String maNCC, String maSP, int soLuong, float giaXuat) {
        this.maKho = maKho;
        this.maNCC = maNCC;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.giaXuat = giaXuat;
    }

    

    public ThongTinKho() {
    }

    public int getMaKho() {
        return maKho;
    }

    public void setMaKho(int maKho) {
        this.maKho = maKho;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(float giaXuat) {
        this.giaXuat = giaXuat;
    }
    
}
