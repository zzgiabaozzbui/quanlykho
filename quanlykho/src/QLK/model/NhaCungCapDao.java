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
import QLK.connect.MyConnection;

/**
 *
 * @author ADMIN
 */
public class NhaCungCapDao {
    Connection conn=MyConnection.getInstance().getConnection();
    public List<NhaCungCap> getList() {
       List list=new ArrayList<>();
       NhaCungCap ncc=null;
        try 
        {
            String query="Select * from nhacungcap";
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 ncc=new NhaCungCap();
                 ncc.setMaNCC(rs.getString("maNCC"));
                 ncc.setTenNCC(rs.getString("tenNCC"));
                 ncc.setsdtNCC(rs.getString("sdtNCC"));
                 ncc.setDiaChi(rs.getString("diaChi"));
 
                 list.add(ncc);
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return list;
    }
    public String getName(String maNCC) {
       NhaCungCap ncc=null;
        try 
        {
            String query="Select * from nhacungcap where maNCC=?";
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1, maNCC);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 ncc=new NhaCungCap();
                 ncc.setMaNCC(rs.getString("maNCC"));
                 ncc.setTenNCC(rs.getString("tenNCC"));
                 ncc.setsdtNCC(rs.getString("sdtNCC"));
                 ncc.setDiaChi(rs.getString("diaChi"));
             }
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return ncc.getTenNCC();
    }

    
}
