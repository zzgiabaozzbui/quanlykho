/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import QLK.connect.MyConnection;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import QLK.model.SanPham;

/**
 *
 * @author Pham Thang <Thangyb2706@gmail.com>
 */
public class SanPhamController {

    private static final String TABLE_NAME="sanpham";
    private static final String MASP="masanpham";
    private static final String TENSP="tensanpham";
    private static final String MOTA="mota";
  
  
    
    Connection conn=  MyConnection.getInstance().getConnection();

    public List<SanPham> getAll() {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql_select = "SELECT * FROM "+TABLE_NAME;
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            
            while (rs.next()) {                    
                String maSP = rs.getString(MASP);
                String tenSP = rs.getString(TENSP);
                String mota= rs.getString(MOTA);
                list.add(new SanPham(maSP,tenSP,mota));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;   
    }


    public Optional<SanPham> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public Optional<SanPham> get(String id) {
        SanPham sanPham = new SanPham();
        try {
            String querySelect="SELECT * FROM "+TABLE_NAME+" where masanpham=?";
            PreparedStatement ps = conn.prepareStatement(querySelect);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {    
                sanPham.setMaSanPham(rs.getString(MASP));
                sanPham.setTenSanPham(rs.getString(TENSP));
                sanPham.setMoTa(rs.getString(MOTA));     
            }
        } catch (Exception e) {
        }
        return Optional.of(sanPham); 
    }

  
    public int insert(SanPham t) {
        try {
            String queryInsert= "Insert into "+TABLE_NAME+" values(?,?,?)";
            PreparedStatement ps= conn.prepareStatement(queryInsert);
            ps.setString(1, t.getMaSanPham());
            ps.setString(2, t.getTenSanPham());
            ps.setString(3, t.getMoTa());
            int k=ps.executeUpdate();
            if(k>0)
                return 1;
            else
                return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

   
    public int update(SanPham t) {
        try {
            String queryUpdate= "update "+TABLE_NAME+" set tensanpham=?,mota=? where "+MASP+"=?";
            PreparedStatement ps= conn.prepareStatement(queryUpdate);
            ps.setString(3, t.getMaSanPham());
            ps.setString(1, t.getTenSanPham());
            ps.setString(2, t.getMoTa());
            int k=ps.executeUpdate();
            if(k>0)
                return 1;
            else
                return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;    }

    
    public int delete(SanPham t) {
            try {
            String queryUpdate= "delete from "+TABLE_NAME+" where "+MASP+"=?";
            PreparedStatement ps= conn.prepareStatement(queryUpdate);
            ps.setString(1, t.getMaSanPham());
            int k=ps.executeUpdate();
            if(k>0)
                return 1;
            else
                return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;     }

   
    public List<SanPham> find(SanPham t) {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql_select = "SELECT * FROM "+TABLE_NAME+" where masanpham = '"+t.getMaSanPham()+"' or tensanpham like '%"+t.getMaSanPham()+"%'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {                    
                String maSP = rs.getString(MASP);
                String tenSP = rs.getString(TENSP);
                String mota= rs.getString(MOTA);
                list.add(new SanPham(maSP,tenSP,mota));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list; 
    }
//    public static void main(String[] args) {
//        SanPhamController controller=new SanPhamController();
//        List<SanPham> list=controller.getAll();
//        for (SanPham sp : list) {
//            System.out.println(sp.getTenSanPham());
//        }
//
//    }
    
}

