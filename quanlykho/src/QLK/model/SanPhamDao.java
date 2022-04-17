/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import QLK.connect.MyConnection;

/**
 *
 * @author ADMIN
 */
public class SanPhamDao {
    Connection conn=MyConnection.getInstance().getConnection();
    public List<SanPham> getList() {
       List list=new ArrayList<>();
       SanPham sp=null;
        try 
        {
            String query="Select * from sanpham";
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 sp=new SanPham();
                 sp.setMaSanPham(rs.getString("maSanPham"));
                 sp.setTenSanPham(rs.getString("tenSanPham"));
                 sp.setMoTa(rs.getString("moTa"));
                 list.add(sp);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
     public String getName(int maSP) {
       SanPham sp=null;
        try 
        {
            String query="Select * from sanpham where maSanPham=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1, maSP);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 sp=new SanPham();
                 sp.setTenSanPham(rs.getString("tenSanPham"));
                 
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return sp.getTenSanPham();
    }
    

    

}
