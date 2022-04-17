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
import QLK.model.NhapDao;
import QLK.model.SanPham;
import QLK.model.SanPhamDao;
import QLK.view.TTPhieuNhap;

/**
 *
 * @author ADMIN
 */
public class TTPhieuNhapControl {
    TTPhieuNhap ttpn;
    ChiTietNhapDao ctnd=new ChiTietNhapDao();
    NhapDao nhapDao=new NhapDao();
    SanPhamDao spd=new SanPhamDao();
    public TTPhieuNhapControl(TTPhieuNhap ttpn) {
        this.ttpn = ttpn;
    }
      public TableModel getModelTable(int maNhap)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã chi tiết nhập ");
        model.addColumn("Mã  nhập ");
        model.addColumn("Mã  sản phẩm ");
        model.addColumn("Tên sản phẩm ");
         model.addColumn("Số lượng nhập ");
        model.addColumn("Giá nhập");
        
        ChiTietNhap ctn;
        for (int i = 0; i < ctnd.getList(maNhap).size(); i++) {
            ctn=ctnd.getList(maNhap).get(i);
            row=new Vector();
            row.add(ctn.getMaCTNhap());
            row.add(ctn.getMaNhap());
            row.add(ctn.getMaSanPham());
            row.add(spd.getName(ctn.getMaSanPham()));
            row.add(ctn.getSoLuong());
            row.add(ctn.getGiaNhap());
            model.addRow(row);
        }
        return model;
    }
      public void delete(ChiTietNhap ctn)
      {
          ctnd.delete(ctn.getMaCTNhap());
          int tt=(int) (ctn.getSoLuong()*ctn.getGiaNhap());
          Nhap nhap=new Nhap();
          nhap.setMaNhap(ctn.getMaNhap());
          nhap.setThanhTien(tt);
          nhapDao.update2(nhap);
          ttpn.reset();
      }
    
    
}
