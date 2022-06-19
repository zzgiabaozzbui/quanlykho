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
public class chiTietXuatDao {

        Connection conn = MyConnection.getInstance().getConnection();


    public List<chiTietXuat> getList(int maXuat) {
        List list = new ArrayList<>();
        chiTietXuat xuat = null;
        try {
            String query = "Select * from chitietxuat where maXuat=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, maXuat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                xuat = new chiTietXuat();
                xuat.setMaCTXuat(rs.getInt("maCTXuat"));
                xuat.setMaXuat(rs.getInt("maXuat"));
                xuat.setMaSanPham(rs.getString("maSanPham"));
                xuat.setSoLuong(rs.getInt("soLuong"));
                xuat.setGiaXuat(rs.getFloat("giaXuat"));
                list.add(xuat);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int insert(chiTietXuat xuat) {
        try {
            String query = "Insert into chitietxuat values(null,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, xuat.getMaXuat());
            ps.setString(2, xuat.getMaSanPham());
            ps.setInt(3, xuat.getSoLuong());
            ps.setFloat(4, xuat.getGiaXuat());

            int k = ps.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công !");
                return 1;

            } else {
                JOptionPane.showMessageDialog(null, "Thao tác thất bại !");
                return -1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(chiTietXuat t) {
        try {
            String query = "Update chitietxuat set maSanPham=?,soLuong=?,giaXuat=? where maXuat=?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, t.getMaSanPham());
            ps.setInt(2, t.getSoLuong());
            ps.setFloat(3, t.getGiaXuat());
            ps.setInt(4, t.getMaCTXuat());
            System.out.println(query);
            int k = ps.executeUpdate();

            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Bạn đã cập nhật thành công !");
                return 1;

            } else {
                JOptionPane.showMessageDialog(null, "Thao tác thất bại !");
                return 0;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(int t) {
        try {
            String query = "Delete from chitietxuat where maCTXuat=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, t);
            int k = ps.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công !");
                return 1;

            } else {
                JOptionPane.showMessageDialog(null, "Thao tác thất bại !");
                return 0;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete2(int t) {
        try {
            String query = "Delete from chitietxuat where maXuat=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, t);
            int k = ps.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công !");
                return 1;

            } else {
                JOptionPane.showMessageDialog(null, "Thao tác thất bại !");
                return 0;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
     public List<SP> getChart() {
       List list=new ArrayList<>();
       SP sp=null;
        try 
        {
            String query="SELECT sanpham.tenSanPham, SUM(chitietxuat.soLuong) as soLuong FROM sanpham,chitietxuat WHERE sanpham.maSanPham=chitietxuat.maSanPham GROUP BY sanpham.maSanPham";
             PreparedStatement ps = conn.prepareStatement(query);

             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 sp=new SP();
                 sp.setMaSP(rs.getString("tenSanPham"));
     
                 sp.setsLNhap(rs.getInt("soLuong"));
                 
                 list.add(sp);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
}
