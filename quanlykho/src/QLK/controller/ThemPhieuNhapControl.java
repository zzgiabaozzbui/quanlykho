/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import QLK.model.NhaCungCap;
import QLK.controller.NhaCungCapDao;
import QLK.model.Nhap;
import QLK.model.NhapDao;
import QLK.view.ThemPhieuNhap;

/**
 *
 * @author ADMIN
 */
public class ThemPhieuNhapControl {
    ThemPhieuNhap them;
    NhapDao nhapdao=new NhapDao();
    NhaCungCapDao nccdao=new NhaCungCapDao();
    

    public ThemPhieuNhapControl(ThemPhieuNhap them) {
         this.them = them;
    }
    public DefaultTableModel getDataNCC()
    {
         Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã nhà cung cấp");
        model.addColumn("Tên nhà cung cấp");
        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        NhaCungCap ncc;
        for (int i = 0; i < nccdao.getAll().size(); i++) {
            ncc=nccdao.getAll().get(i);
            row=new Vector();
            row.add(ncc.getMaNCC());
            row.add(ncc.getTenNCC());
            row.add(ncc.getDiaChi());
            row.add(ncc.getsdtNCC());
            model.addRow(row);
        }
        return model;
    }
    public void add(Nhap nhap)
    {
        int key=nhapdao.insert(nhap);
        them.next(key);
    }
    
}
