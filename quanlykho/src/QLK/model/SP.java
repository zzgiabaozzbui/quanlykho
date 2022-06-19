/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

/**
 *
 * @author Pham Thang <Thangyb2706@gmail.com>
 */
public class SP {
    private String maSP;
    private int sLNhap;

    public SP() {
    }

    public SP(String maSP, int sLNhap) {
        this.maSP = maSP;
        this.sLNhap = sLNhap;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getsLNhap() {
        return sLNhap;
    }

    public void setsLNhap(int sLNhap) {
        this.sLNhap = sLNhap;
    }

    @Override
    public String toString() {
        return "SP{" + "maSP=" + maSP + ", sLNhap=" + sLNhap + '}';
    }
    
    
    

   
    
}
    
    

