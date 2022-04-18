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
public class xuat {
    private int maXuat;
    private int maKh;
    private int maNV;
    private Timestamp thoiGian;
    private float thanhTien;
    private int trangThai;


    public xuat() {
    }

    public xuat(int maXuat, int maKh, int maNV, Timestamp thoiGian, float thanhTien, int trangThai) {
        this.maXuat = maXuat;
        this.maKh = maKh;
        this.maNV = maNV;
        this.thoiGian = thoiGian;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
    }

    public int getMaXuat() {
        return maXuat;
    }

    public void setMaXuat(int maXuat) {
        this.maXuat = maXuat;
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
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
