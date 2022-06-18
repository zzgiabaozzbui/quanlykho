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
public class ThongTinKhoDao {
    Connection conn=MyConnection.getInstance().getConnection();
    public List<Nhap> getList() {
       List list=new ArrayList<>();
       ThongTinKho tt=null;
        try 
        {
            String query="Select * from thongtinkho";
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 tt=new ThongTinKho();
                 tt.setMaKho(rs.getInt("maKho"));
                 tt.setMaNCC(rs.getInt("maNCC"));
                 tt.setMaSP(rs.getString("maSanPham"));
                 tt.setSoLuong(rs.getInt("soLuong"));
                 tt.setGiaXuat(rs.getFloat("giaXuat"));
                 list.add(tt);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }

    public int insert(ThongTinKho ttk) {
        try 
        {
             String query="Insert into thongtinkho values(?,?,?,?,?)";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1, ttk.getMaKho());
             ps.setInt(2, ttk.getMaNCC());
             ps.setString(3, ttk.getMaSP());
             ps.setInt(4, ttk.getSoLuong());
             ps.setFloat(5, ttk.getGiaXuat());
            
             int k=ps.executeUpdate();
             if(k>0)
             {
                 JOptionPane.showMessageDialog(null,"Bạn đã thêm thành công !");
                 return 1;
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Thao tác thất bại !");
                 return 0;
             }
             
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return 0;
    }

    public int check(ThongTinKho t) {
        int count=0;
        try
        {
            String query="Select * from thongtinkho where maKho=? and maNCC=? and giaXuat=? and maSanPham=?";
             
             PreparedStatement ps = conn.prepareStatement(query);
    
             ps.setInt(2, t.getMaNCC());
             ps.setString(4, t.getMaSP());
             
             ps.setFloat(3, t.getGiaXuat());
             ps.setInt(1, t.getMaKho());
          
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 count++;
             }
    
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        System.out.println(count);
        return count;
    }
    public int update(ThongTinKho t) {
        try
        {
             String query="Update thongtinkho set soLuong=soLuong+? where maKho=? and maNCC=? and giaXuat=? and maSanPham=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
             ps.setInt(3, t.getMaNCC());
             ps.setString(5, t.getMaSP());
             ps.setFloat(4, t.getGiaXuat());
             ps.setInt(2, t.getMaKho());
             ps.setInt(1, t.getSoLuong());
             
             int k=ps.executeUpdate();
             if(k>0)
             {
                 JOptionPane.showMessageDialog(null,"Bạn đã cập nhật thành công !");
                 return 1;
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Thao tác thất bại !");
                 return 0;
             }
             
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return 0;
    }

    
}
