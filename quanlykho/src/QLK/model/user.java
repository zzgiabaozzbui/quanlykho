/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

/**
 *
 * @author Admins
 */
public class user {
    private String taikhoan;
    private String matkhau;
    private String maNV;
    private String tenNV;
    private String email;
    private String sdt;
    private int trangthai;
    private int quyen;

    public user() {
    }

    public user(String taikhoan, String matkhau, String maNV, String tenNV, String email, String sdt, int trangthai, int quyen) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.email = email;
        this.sdt = sdt;
        this.trangthai = trangthai;
        this.quyen = quyen;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    @Override
    public String toString() {
        return tenNV ;
    }
    
}
