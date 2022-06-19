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

/**
 *
 * @author ADMIN
 */
public class xuatDao {
        Connection conn = MyConnection.getInstance().getConnection();

    public List<xuat> getList(String maNV) {
       List list=new ArrayList<>();
       xuat xuat=null;
        try 
        {
            String query="Select * from xuat where maNV=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 xuat=new xuat();
                 xuat.setMaXuat(rs.getInt("maXuat"));
                 xuat.setMaKH(rs.getString("maKH"));
                 xuat.setMaNV(rs.getString("maNV"));
                 xuat.setThoiGian(rs.getTimestamp("thoiGian"));
                 xuat.setThanhTien(rs.getFloat("thanhTien"));
                 xuat.setTrangThai(rs.getInt("trangThai"));
                 list.add(xuat);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    public List<xuat> getListNot(String maNV) {
       List list=new ArrayList<>();
       xuat xuat=null;
        try 
        {
            String query="Select * from xuat where maNV=? and trangThai=0";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 xuat=new xuat();
                 xuat.setMaXuat(rs.getInt("maXuat"));
                 xuat.setMaKH(rs.getString("maKH"));
                 xuat.setMaNV(rs.getString("maNV"));
                 xuat.setThoiGian(rs.getTimestamp("thoiGian"));
                 xuat.setThanhTien(rs.getFloat("thanhTien"));
                 xuat.setTrangThai(rs.getInt("trangThai"));
                 list.add(xuat);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }

    public int insert(xuat xuat) {
        int key=0;
        try 
        {
            
             String query="Insert into xuat values(null,?,?,DEFAULT,?,0)";
             PreparedStatement ps = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, xuat.getMaKH());
             ps.setString(2, xuat.getMaNV());
             ps.setFloat(3, xuat.getThanhTien());
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

    public int update(xuat t) {
        try
        {
             String query="Update xuat set thanhTien=thanhTien+?,trangThai=? where maXuat=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
             
             ps.setFloat(1, t.getThanhTien());
             ps.setInt(2, t.getTrangThai());
             ps.setInt(3, t.getMaXuat());
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
    public int update2(xuat t) {
        try
        {
             String query="Update xuat set thanhTien=thanhTien-? where maXuat=?";
             PreparedStatement ps = conn.prepareStatement(query);
    
             
             ps.setFloat(1, t.getThanhTien());
             
             ps.setInt(2, t.getMaXuat());
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
             String query="Delete from xuat where maXuat=?";
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
    public List<xuat> getListBy(int x,String maNV) {
       List list=new ArrayList<>();
       xuat xuat=null;
        try 
        {
            String by="";
            if(x==1)
            {
                by="order by maKh desc";
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
                    
            String query="Select * from xuat where maNV=? "+by;
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,maNV);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 xuat=new xuat();
                 xuat.setMaXuat(rs.getInt("maXuat"));
                 xuat.setMaKH(rs.getString("maKH"));
                 xuat.setMaNV(rs.getString("maNV"));
                 xuat.setThoiGian(rs.getTimestamp("thoiGian"));
                 xuat.setThanhTien(rs.getFloat("thanhTien"));
                 xuat.setTrangThai(rs.getInt("trangThai"));
                 list.add(xuat);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
}
