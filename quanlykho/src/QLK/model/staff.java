/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

/**
 *
 * @author zzgia
 */
public class staff {
    private String maNV;
    private String tenNV;
    private String email;
    private String diaChi;
    private String sdt;
    private String cmnd;
    private String chucVu;
    private String maKho;

    public staff() {
    }

    public staff(String maNV) {
        this.maNV = maNV;
    }

    public staff(String maNV, String tenNV, String email, String diaChi, String sdt, String cmnd, String chucVu, String maKho) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.email = email;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.chucVu = chucVu;
        this.maKho = maKho;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    

    @Override
    public String toString() {
        return  tenNV;
    }
    
}
