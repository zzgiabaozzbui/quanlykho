/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

import java.sql.Timestamp;

/**
 *
 * @author ADMIN
 */
public class Nhap {
    private int maNhap;
    private int maNCC;
    private int maNV;
    private Timestamp thoiGian;
    private float thanhTien;
    private int trangThai;

    public Nhap(int maNhap, int maNCC, int maNV, Timestamp thoiGian, float thanhTien, int trangThai) {
        this.maNhap = maNhap;
        this.maNCC = maNCC;
        this.maNV = maNV;
        this.thoiGian = thoiGian;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
    }

    public Nhap() {
    }

    public int getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(int maNhap) {
        this.maNhap = maNhap;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public Timestamp getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Timestamp thoiGian) {
        this.thoiGian = thoiGian;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
