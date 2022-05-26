/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import QLK.model.SanPhamDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import QLK.model.chiTietXuat;
import QLK.model.chiTietXuatDao;
import QLK.model.xuat;
import QLK.model.xuatDao;
import QLK.view.TTPhieuXuat;
import java.util.Vector;
/**
 *
 * @author ADMIN
 */
public class TTPhieuXuatControl {
     TTPhieuXuat ttpx;
    chiTietXuatDao ctxd=new chiTietXuatDao();
    xuatDao nhapDao=new xuatDao();
    SanPhamDao spd=new SanPhamDao();

    public TTPhieuXuatControl(TTPhieuXuat ttpn) {
        this.ttpx = ttpx;
    }
    
      public TableModel getModelTable(int maXuat)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã chi tiết xuất ");
        model.addColumn("Mã  xuất ");
        model.addColumn("Mã  sản phẩm ");
        model.addColumn("Tên sản phẩm ");
        model.addColumn("Số lượng xuất ");
        model.addColumn("Giá xuất");
        
        chiTietXuat ctx;
        for (int i = 0; i < ctxd.getList(maXuat).size(); i++) {
            ctx=ctxd.getList(maXuat).get(i);
            row=new Vector();
            row.add(ctx.getMaCTXuat());
            row.add(ctx.getMaXuat());
            row.add(ctx.getMaSanPham());
            row.add(spd.getName(ctx.getMaSanPham()));
            row.add(ctx.getSoLuong());
            row.add(ctx.getGiaXuat());
            model.addRow(row);
        }
        return model;
    }
      public void delete(chiTietXuat ctx)
      {
          ctxd.delete(ctx.getMaCTXuat());
          int tt=(int) (ctx.getSoLuong()*ctx.getGiaXuat());
          xuat xuat=new xuat();
          xuat.setMaXuat(ctx.getMaXuat());
          xuat.setThanhTien(tt);
          nhapDao.update2(xuat);
          ttpx.reset();
      }
}
