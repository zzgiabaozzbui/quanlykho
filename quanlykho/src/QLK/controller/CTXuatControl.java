/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import QLK.model.SanPham;
import QLK.model.SanPhamDao;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import QLK.model.chiTietXuat;
import QLK.model.chiTietXuatDao;
import QLK.model.xuat;
import QLK.model.xuatDao;
import QLK.view.ThemCTPX;

/**
 *
 * @author ADMIN
 */
public class CTXuatControl {

    ThemCTPX them;
    chiTietXuatDao ctnd = new chiTietXuatDao();
    xuatDao nd = new xuatDao();
    SanPhamDao spd = new SanPhamDao();

    public CTXuatControl(ThemCTPX them) {
        this.them = them;
    }

    public int add(chiTietXuat xuat) {
        int x = ctnd.insert(xuat);

        if (x > 0) {
            xuat n = new xuat();
            n.setTrangThai(0);
            float tt = xuat.getSoLuong() * xuat.getGiaXuat();
            n.setThanhTien(tt);
            n.setMaXuat(xuat.getMaXuat());
            nd.update(n);
        }
        return x;
    }

    public TableModel getModelTable(int maNV) {
        Vector row = null;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã sản phẩm ");
        model.addColumn("Tên sản phẩm");
        model.addColumn("Mô tả");

        SanPham sp;
        for (int i = 0; i < spd.getList().size(); i++) {
            sp = spd.getList().get(i);
            row = new Vector();
            row.add(sp.getMaSanPham());
            row.add(sp.getTenSanPham());
            row.add(sp.getMoTa());
            model.addRow(row);
        }
        return model;
    }

}
