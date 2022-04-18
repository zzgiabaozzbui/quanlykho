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
    public List<khachHang1> getList() {
       List list=new ArrayList<>();
       khachHang1 kh=null;
        try 
        {
            String query="Select * from khachhang";
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 kh=new khachHang1();
                 kh.setMaKh(rs.getInt("maKh"));
                 kh.setTenKH(rs.getString("tenKH"));
                 kh.setDiaChi(rs.getString("diaChi"));
                 kh.setSdt(rs.getString("sdt"));
                 kh.setCmnd(rs.getString("cmnd"));
 
                 list.add(kh);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    public String getName(int maKh) {
       khachHang1 kh=null;
        try 
        {
            String query="Select * from khachhang where maKh=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1, maKh);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 kh=new khachHang1();
                 kh.setMaKh(rs.getInt("maKh"));
                 kh.setTenKH(rs.getString("tenKH"));
                 kh.setDiaChi(rs.getString("diaChi"));
                 kh.setSdt(rs.getString("sdt"));
                 kh.setCmnd(rs.getString("cmnd"));
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return kh.getTenKH();
    }
}
