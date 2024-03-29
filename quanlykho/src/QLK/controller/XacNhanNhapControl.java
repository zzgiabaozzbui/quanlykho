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
import QLK.model.ChiTietNhap;
import QLK.model.ChiTietNhapDao;
import QLK.model.Nhap;
import QLK.model.NhapKhoDao;
import QLK.model.ThongTinKho;
import QLK.model.ThongTinKhoDao;
import QLK.view.XacNhanNhap;

/**
 *
 * @author ADMIN
 */
public class XacNhanNhapControl {
    XacNhanNhap xnn;
    NhapKhoDao nd=new NhapKhoDao();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    NhaCungCapDao nccd=new NhaCungCapDao();
    ChiTietNhapDao ctndao=new ChiTietNhapDao();
    ThongTinKhoDao ttkdao=new ThongTinKhoDao();
    
    public XacNhanNhapControl(XacNhanNhap xnn) {
        this.xnn = xnn;
    }
    
    public TableModel getData(String maNV)
    {
        Vector row = null;
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã nhập kho");
        model.addColumn("Mã nhà cung cấp");
        model.addColumn("Ngày nhập");
        model.addColumn("Thành tiền");
        model.addColumn("Trạng thái");
        Nhap nk;
        for (int i = 0; i < nd.getListNot(maNV).size(); i++) {
            nk=nd.getListNot(maNV).get(i);
            row=new Vector();
            row.add(nk.getMaNhap());
            row.add(nk.getMaNCC());
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
    
    public void xacNhan(Nhap nhap,String maNV)
    {
        int maKho=getMaKho(maNV);
        nd.update(nhap);
        List list=ctndao.getList(nhap.getMaNhap());
        for (int i = 0; i < list.size(); i++) {
            ChiTietNhap ctn=(ChiTietNhap) list.get(i);
            ThongTinKho ttk=new ThongTinKho(maKho, nhap.getMaNCC(), ctn.getMaSanPham(), ctn.getSoLuong(), ctn.getGiaNhap());
            int result=-1;
            if(ttkdao.check(ttk)==0)
            {
                result=ttkdao.insert(ttk);
            }
            else
            {
                result=ttkdao.update(ttk);
            }
            xnn.next();
            
        }
    }

    private int getMaKho(String maNV) {
        System.out.println(maNV);
        try {
            System.out.println(new NhanVienDao().getNVbyID(maNV)+"MAKHO");
            return new NhanVienDao().getNVbyID(maNV);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
}
