/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import QLK.model.chiTietXuatDao;
import QLK.model.khachHangDao;
import QLK.model.xuat;
import QLK.model.xuatDao;
import QLK.view.QLXuatKho;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class XuatKhoControl {
    xuatDao xd=new xuatDao();
    chiTietXuatDao ctd=new chiTietXuatDao();
    khachHangDao khd=new khachHangDao();
    QLXuatKho qlxk;

    public XuatKhoControl(QLXuatKho qlxk) {
        this.qlxk = qlxk;
    }
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public TableModel getModelTable(int maNV)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã xuất kho");
        model.addColumn("Tên khách hàng");
        model.addColumn("Ngày xuất");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        xuat xk;
        for (int i = 0; i < xd.getList(maNV).size(); i++) {
            xk=xd.getList(maNV).get(i);
            row=new Vector();
            row.add(xk.getMaXuat());
            row.add(khd.getName(xk.getMaKh()));
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
    public void delete(int maXuat)
    {
        int deletexuat=xd.delete(maXuat);
        int deleteCTXuat=ctd.delete2(maXuat);
        if(deleteCTXuat==1 && deletexuat==1)
        {
            qlxk.reset();
            
        }
        
    }

    public DefaultTableModel getModelBy(int  x,int maNV) {
         Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã xuất kho");
        model.addColumn("Tên khách hàng");
        model.addColumn("Ngày xuất");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        xuat xk;
        
       
        for (int i = 0; i < xd.getListBy(x, maNV).size(); i++) {
            xk=xd.getListBy(x, maNV).get(i);
            row=new Vector();
            row.add(xk.getMaXuat());
            row.add(khd.getName(xk.getMaKh()));
            row.add(formatter.format(xk.getThoiGian()));
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
}
