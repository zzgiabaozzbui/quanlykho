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
public class Kho {
    private int maKho;
    private String tenKho;

    public Kho() {
    }

    public Kho(int maKho) {
        this.maKho = maKho;
    }

    public Kho(int maKho, String tenKho) {
        this.maKho = maKho;
        this.tenKho = tenKho;
    }

    public int getMaKho() {
        return maKho;
    }

    public void setMaKho(int maKho) {
        this.maKho = maKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    @Override
    public String toString() {
        return "Kho{" + "maKho=" + maKho + ", tenKho=" + tenKho + '}';
    }
    
    
}