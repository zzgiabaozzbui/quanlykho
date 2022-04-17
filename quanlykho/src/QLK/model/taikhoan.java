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
public class taikhoan {
    private String taikhoan;
    private String matkhau;
    private String maNV;
    private int trangthai;
    private int quyen;

    public taikhoan() {
    }

    public taikhoan(String taikhoan, String matkhau, String maNV, int trangthai, int quyen) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.maNV = maNV;
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
        return taikhoan;
    }

    
    
}
