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
public class chiTietXuat {
    private int maCTXuat;
    private int maXuat;
    private String maSanPham;
    private int soLuong;
    private float giaXuat;

    public chiTietXuat() {
    }

    public chiTietXuat(int maCTXuat, int maXuat, String maSanPham, int soLuong, float giaXuat) {
        this.maCTXuat = maCTXuat;
        this.maXuat = maXuat;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaXuat = giaXuat;
    }
    

    public int getMaCTXuat() {
        return maCTXuat;
    }

    public void setMaCTXuat(int maCTXuat) {
        this.maCTXuat = maCTXuat;
    }

    public int getMaXuat() {
        return maXuat;
    }

    public void setMaXuat(int maXuat) {
        this.maXuat = maXuat;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
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
