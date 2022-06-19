/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import QLK.model.KhachHang;
import QLK.model.khachHangDao;
import QLK.model.xuat;
import QLK.model.xuatDao;
import QLK.view.ThemPhieuXuat;

/**
 *
 * @author ADMIN
 */
public class ThemPhieuXuatControl {
    ThemPhieuXuat them;
    xuatDao xuatdao=new xuatDao();
    khachHangDao khdao=new khachHangDao();

    public ThemPhieuXuatControl(ThemPhieuXuat them) {
        this.them = them;
    }
    
    public DefaultTableModel getDataKH()
    {
         Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Chứng minh nhân dân");
        KhachHang kh;
        for (int i = 0; i < khdao.getList().size(); i++) {
            kh=khdao.getList().get(i);
            row=new Vector();
            row.add(kh.getMaKH());
            row.add(kh.getTenKH());
            row.add(kh.getDiaChi());
            row.add(kh.getSDT());
            row.add(kh.getCMND());
            model.addRow(row);
        }
        return model;
    }
    public void add(xuat xuat)
    {
        int key=xuatdao.insert(xuat);
        them.next(key);
    }
}
