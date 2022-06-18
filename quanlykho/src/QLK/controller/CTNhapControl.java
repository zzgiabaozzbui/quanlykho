/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import QLK.model.ChiTietNhap;
import QLK.model.ChiTietNhapDao;
import QLK.model.Nhap;
import QLK.model.NhapKhoDao;
import QLK.model.SanPham;
import QLK.model.SanPhamDao;
import QLK.view.ThemCTPN;

/**
 *
 * @author ADMIN
 */
public class CTNhapControl {
    ThemCTPN them;
    ChiTietNhapDao ctnd=new ChiTietNhapDao();
    NhapKhoDao nd=new NhapKhoDao();
    SanPhamDao spd=new SanPhamDao();
    
    public CTNhapControl(ThemCTPN them) {
       this.them=them;
    }
    
    public int add(ChiTietNhap nhap)
    {
        int x=ctnd.insert(nhap);
        if(x==1)
        {
            Nhap n=new Nhap();
            n.setMaNhap(nhap.getMaNhap());
            n.setTrangThai(0);
            float tt=nhap.getSoLuong()*nhap.getGiaNhap();
            n.setThanhTien(tt);
            nd.update(n);
        }
        return x;
    }
    public TableModel getModelTable()
    {   DefaultTableModel model=null;
        try {
            
    
        Vector row = null;
         model=new DefaultTableModel();
        model.addColumn("Mã sản phẩm ");
        model.addColumn("Tên sản phẩm");
        model.addColumn("Mô tả");
        
        SanPham sp;
        for (int i = 0; i < spd.getList().size(); i++) {
            sp=spd.getList().get(i);
            row=new Vector();
            row.add(sp.getMaSanPham());
            row.add(sp.getTenSanPham());
            row.add(sp.getMoTa());
            model.addRow(row);
        }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
         return model;
    }
    
}
