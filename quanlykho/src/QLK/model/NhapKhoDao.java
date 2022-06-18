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
import javax.swing.JOptionPane;
import QLK.model.Nhap;


/**
 *
 * @author ADMIN
 */
public class NhapKhoDao {
    Connection conn=MyConnection.getInstance().getConnection();
    public List<Nhap> getList(String maNV) {
       List list=new ArrayList<>();
       Nhap nhap=null;
        try 
        {
            String query="Select * from nhap where maNV=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             ResultSet rs=ps.executeQuery();
             System.out.println(query);
             while(rs.next())
             {
                 nhap=new Nhap();
                 nhap.setMaNhap(rs.getInt("maNhap"));
                 nhap.setMaNCC(rs.getInt("maNCC"));
                 nhap.setMaNV(rs.getString("maNV"));
                 nhap.setThoiGian(rs.getTimestamp("thoiGian"));
                 nhap.setThanhTien(rs.getFloat("thanhTien"));
                 nhap.setTrangThai(rs.getInt("trangThai"));
                 list.add(nhap);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    public List<Nhap> getListNot(String maNV) {
       List list=new ArrayList<>();
       Nhap nhap=null;
        try 
        {
            String query="Select * from nhap where maNV=? and trangThai=0";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             System.out.println(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 nhap=new Nhap();
                 nhap.setMaNhap(rs.getInt("maNhap"));
                 nhap.setMaNCC(rs.getInt("maNCC"));
                 nhap.setMaNV(rs.getString("maNV"));
                 nhap.setThoiGian(rs.getTimestamp("thoiGian"));
                 nhap.setThanhTien(rs.getFloat("thanhTien"));
                 nhap.setTrangThai(rs.getInt("trangThai"));
                 list.add(nhap);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }

    public int insert(Nhap nhap) {
        int key=0;
        try 
        {
            
             String query="Insert into nhap values(null,?,?,DEFAULT,0,0)";
             PreparedStatement ps = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, nhap.getMaNCC());
             ps.setString(2, nhap.getMaNV());
             int k=ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             if (rs.next())
             {
                key=rs.getInt(1);
             } 
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return key;
    }

    public int update(Nhap t) {
        try
        {
             String query="Update nhap set thanhTien=thanhTien+?,trangThai=? where maNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
             
             ps.setFloat(1, t.getThanhTien());
             ps.setInt(2, t.getTrangThai());
             ps.setInt(3, t.getMaNhap());
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
    public int update2(Nhap t) {
        try
        {
             String query="Update nhap set thanhTien=thanhTien-? where maNhap=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
             
             ps.setFloat(1, t.getThanhTien());
             
             ps.setInt(2, t.getMaNhap());
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
             String query="Delete from nhap where maNhap=?";
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
    public List<Nhap> getListBy(int x,String maNV) {
       List list=new ArrayList<>();
       Nhap nhap=null;
        try 
        {
            String by="";
            if(x==1)
            {
                by="order by maNCC desc";
            }
            else if(x==2)
            {
                by="order by thoiGian desc";
            }
            else if(x==3)
            {
                by="order by thanhTien desc";
            }
            else if(x==4)
            {
                by="order by trangThai desc";
            }
                    
            String query="Select * from nhap where maNV=? "+by;
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 nhap=new Nhap();
                 nhap.setMaNhap(rs.getInt("maNhap"));
                 nhap.setMaNCC(rs.getInt("maNCC"));
                 nhap.setMaNV(rs.getString("maNV"));
                 nhap.setThoiGian(rs.getTimestamp("thoiGian"));
                 nhap.setThanhTien(rs.getFloat("thanhTien"));
                 nhap.setTrangThai(rs.getInt("trangThai"));
                 list.add(nhap);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    
}
