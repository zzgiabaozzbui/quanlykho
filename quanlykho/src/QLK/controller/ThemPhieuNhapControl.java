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
import QLK.model.NhaCungCapDao;
import QLK.model.Nhap;
import QLK.model.NhapKhoDao;
import QLK.view.ThemPhieuNhap;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ThemPhieuNhapControl {
    ThemPhieuNhap them;
    NhapKhoDao nhapdao=new NhapKhoDao();
    NhaCungCapDao nccdao=new NhaCungCapDao();
    

    public ThemPhieuNhapControl(ThemPhieuNhap themPN) {
         this.them = themPN;
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
        for (int i = 0; i < nccdao.getList().size(); i++) {
            ncc=nccdao.getList().get(i);
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
            
            if(key!=-1)
            {
                them.next(key);
                JOptionPane.showMessageDialog(null,"Tạo thành công ");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tạo thất bại !");
            }
            
       
    }
    
}
