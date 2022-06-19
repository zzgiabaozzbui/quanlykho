/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;


import QLK.connect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ADMIN
 */
public class khachHangDao {
    Connection conn = MyConnection.getInstance().getConnection();
    public List<KhachHang> getList() {
       List list=new ArrayList<>();
       KhachHang kh=null;
        try 
        {
            String query="Select * from khachhang";
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 kh=new KhachHang();
                 kh.setMaKH(rs.getString("maKH"));
                 kh.setTenKH(rs.getString("tenKH"));
                 kh.setDiaChi(rs.getString("diaChi"));
                 kh.setSDT(rs.getString("SDT"));
                 kh.setCMND(rs.getString("CMND"));
 
                 list.add(kh);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    public String getName(String maKH) {
       KhachHang kh=null;
        try 
        {
            String query="Select * from khachhang where maKh=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1, maKH);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 kh=new KhachHang();
                 kh.setMaKH(rs.getString("maKH"));
                 kh.setTenKH(rs.getString("tenKH"));
                 kh.setDiaChi(rs.getString("diaChi"));
                 kh.setSDT(rs.getString("SDT"));
                 kh.setCMND(rs.getString("CMND"));
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return kh.getTenKH();
    }
}
