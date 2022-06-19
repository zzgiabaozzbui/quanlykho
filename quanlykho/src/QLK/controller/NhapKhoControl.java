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
import QLK.model.ChiTietNhapDao;
import QLK.model.NhaCungCapDao;
import QLK.model.Nhap;
import QLK.model.NhapKhoDao;
import QLK.view.QuanLyNK;
import QLK.view.ThemCTPN;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhapKhoControl {
    NhapKhoDao nd=new NhapKhoDao();
    ChiTietNhapDao ctd=new ChiTietNhapDao();
    NhaCungCapDao nccd=new NhaCungCapDao();
    QuanLyNK qlnk;
    ThemCTPN themCTPN;

    public NhapKhoControl(QuanLyNK qlnk) {
        this.qlnk=qlnk;
    }
    
    public NhapKhoControl(ThemCTPN themCTPN)
    {
        this.themCTPN=themCTPN;
    }
    
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public TableModel getModelTable(String maNV)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã nhập kho");
        model.addColumn("Tên nhà cung cấp");
        model.addColumn("Ngày nhập");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        Nhap nk;
        for (int i = 0; i < nd.getList(maNV).size(); i++) {
            nk=nd.getList(maNV).get(i);
            row=new Vector();
            row.add(nk.getMaNhap());
            row.add(nccd.getName(nk.getMaNCC()));
            row.add(formatter.format(nk.getThoiGian()));
            row.add(nk.getThanhTien());
            if(nk.getTrangThai()==1)
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
    public void delete(int maNhap)
    {
        int deleteNhap=nd.delete(maNhap);
        int deleteCTNhap=ctd.delete2(maNhap);
        if(deleteCTNhap==1 && deleteNhap==1)
        {
            qlnk.reset();
        }
        else
        {
             JOptionPane.showMessageDialog(null," Xóa thất bại !");
        }
        
    }
    
    public void deletePN(int maNhap)
    {
       int deleteNhap=nd.delete(maNhap);
       themCTPN.result(deleteNhap);
       
    }

    public DefaultTableModel getModelBy(int  x,String maNV) {
         Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã nhập kho");
        model.addColumn("Tên nhà cung cấp");
        model.addColumn("Ngày nhập");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        Nhap nk;
        
       
        for (int i = 0; i < nd.getListBy(x, maNV).size(); i++) {
            nk=nd.getListBy(x, maNV).get(i);
            row=new Vector();
            row.add(nk.getMaNhap());
            row.add(nccd.getName(nk.getMaNCC()));
            row.add(formatter.format(nk.getThoiGian()));
            row.add(nk.getThanhTien());
            if(nk.getTrangThai()==1)
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
