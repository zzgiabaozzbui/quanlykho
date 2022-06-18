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
public class ChiTietNhap {
    private int maCTNhap;
    private int maNhap;
    private String maSanPham;
    private int soLuong;
    private float giaNhap;

    public ChiTietNhap() {
    }

    public ChiTietNhap(int maCTNhap, int maNhap, String maSanPham, int soLuong, float giaNhap) {
        this.maCTNhap = maCTNhap;
        this.maNhap = maNhap;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }

    public int getMaCTNhap() {
        return maCTNhap;
    }

    public void setMaCTNhap(int maCTNhap) {
        this.maCTNhap = maCTNhap;
    }

    public int getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(int maNhap) {
        this.maNhap = maNhap;
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

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    
}
