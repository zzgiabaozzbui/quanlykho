/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import QLK.model.chiTietXuat;
import QLK.model.chiTietXuatDao;
import QLK.model.khachHangDao;
import QLK.model.xuat;
import QLK.model.xuatDao;
import QLK.view.XacNhanXuat;
import java.util.Date;
import qlk.model.ThongTinKho;
import qlk.model.ThongTinKhoDao;

/**
 *
 * @author ADMIN
 */
public class XacNhanXuatControl {
     XacNhanXuat xnx;
    xuatDao xd=new xuatDao();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    khachHangDao khd=new khachHangDao();
    chiTietXuatDao ctxdao=new chiTietXuatDao();
    ThongTinKhoDao ttkdao=new ThongTinKhoDao();

    public XacNhanXuatControl(XacNhanXuat xnx) {
        this.xnx = xnx;
    }
    
    
    public TableModel getData(int maNV)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã xuất kho");
        model.addColumn("Mã khách hàng");
        model.addColumn("Ngày xuất");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        xuat xk;
        for (int i = 0; i < xd.getListNot(maNV).size(); i++) {
            xk=xd.getListNot(maNV).get(i);
            row=new Vector();
            row.add(xk.getMaXuat());
            row.add(xk.getMaKh());
            row.add(xk.getThoiGian() == null ? formatter.format(new Date()) : formatter.format(xk.getThoiGian()));
            row.add(xk.getThanhTien());
            if(xk.getTrangThai()==1)
            {
                row.add("Hoàn thành");
            }
            else
            {
                row.add("Đang chờ");
            }
            model.addRow(row);
        }
        return model;
    }
    public void xacNhan(xuat xuat,int maNV)
    {
        int maKho=getMaKho(maNV);
        xd.update(xuat);
        List list=ctxdao.getList(xuat.getMaXuat());
        for (int i = 0; i < list.size(); i++) {
            chiTietXuat ctx=(chiTietXuat) list.get(i);
            ThongTinKho ttk=new ThongTinKho(maKho, xuat.getMaKh(), ctx.getMaSanPham(), ctx.getSoLuong(), ctx.getGiaXuat());
            if(ttkdao.check(ttk)==0)
            {
                ttkdao.insert(ttk);
            }
            else
            {
                ttkdao.update(ttk);
            }
            xnx.next();
            
        }
    }

    private int getMaKho(int maNV) {
        return 1;
    }
}
