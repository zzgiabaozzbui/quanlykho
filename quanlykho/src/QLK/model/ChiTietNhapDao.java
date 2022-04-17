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
public class ChiTietNhapDao {
    Connection conn=MyConnection.getInstance().getConnection();
    public List<ChiTietNhap> getList(int maNhap) {
       List list=new ArrayList<>();
       ChiTietNhap nhap=null;
        try 
        {
            String query="Select * from chitietnhap where maNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1,maNhap);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 nhap=new ChiTietNhap();
                 nhap.setMaCTNhap(rs.getInt("maCTNhap"));
                 nhap.setMaNhap(rs.getInt("maNhap"));
                 nhap.setMaSanPham(rs.getInt("maSanPham"));
                 nhap.setSoLuong(rs.getInt("soLuong"));
                 nhap.setGiaNhap(rs.getFloat("giaNhap"));
                 list.add(nhap);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }

    public int insert(ChiTietNhap nhap) {
        try 
        {
             String query="Insert into chitietnhap values(null,?,?,?,?)";
             PreparedStatement ps = conn.prepareStatement(query);
          
             ps.setInt(1, nhap.getMaNhap());
             ps.setInt(2, nhap.getMaSanPham());
             ps.setInt(3, nhap.getSoLuong());
             ps.setFloat(4, nhap.getGiaNhap());
          
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

    public int update(ChiTietNhap t) {
        try
        {
             String query="Update chitietnhap set maSanPham=?,soLuong=?,giaNhap=? where maCTNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
            
             ps.setInt(1, t.getMaSanPham());
             ps.setInt(2, t.getSoLuong());
             ps.setFloat(3, t.getGiaNhap());
             ps.setInt(4, t.getMaCTNhap());
            
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

    public int delete(int t) {
        try
        {
             String query="Delete from chitietnhap where maCTNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1,t);
             int k=ps.executeUpdate();
             if(k>0)
             {
                 JOptionPane.showMessageDialog(null,"Bạn đã xóa thành công !");
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
     public int delete2(int t) {
        try
        {
             String query="Delete from chitietnhap where maNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1,t);
             int k=ps.executeUpdate();
             if(k>0)
             {
                 JOptionPane.showMessageDialog(null,"Bạn đã xóa thành công !");
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
