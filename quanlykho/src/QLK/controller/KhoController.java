/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import QLK.connect.MyConnection;
import QLK.model.Kho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pham Thang <Thangyb2706@gmail.com>
 */
public class KhoController {
    private static final String TABLE_NAME="kho";
    private static final String MAKHO="makho";
    private static final String TENKHO="tenkho";
 
  
  
    
    Connection conn=  MyConnection.getInstance().getConnection();

    public List<Kho> getAll() {
        List<Kho> list = new ArrayList<>();
        try {
            String sql_select = "SELECT * FROM "+TABLE_NAME;
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            
            while (rs.next()) {                    
                int maKho = rs.getInt(MAKHO);
                String tenKho = rs.getString(TENKHO); 
                list.add(new Kho(maKho,tenKho));             
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;   
    }


    public Optional<Kho> get(int id) {
        Kho kho = new Kho();
        try {
            String querySelect="SELECT * FROM "+TABLE_NAME+" where maKho=?";
            PreparedStatement ps = conn.prepareStatement(querySelect);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {    
                kho.setMaKho(rs.getInt(MAKHO));
                kho.setTenKho(rs.getString(TENKHO));    
            }
        } catch (Exception e) {
        }
        return Optional.of(kho); 
    }

  
    public Optional<Kho> get(String id) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public int insert(Kho t) {
        try {
            String queryInsert= "Insert into "+TABLE_NAME+" values(?,?)";
            PreparedStatement ps= conn.prepareStatement(queryInsert);
            ps.setString(2, t.getTenKho());
            ps.setInt(1, t.getMaKho());
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

   
    public int update(Kho t) {
        try {
            String queryUpdate= "update "+TABLE_NAME+" set tenKho=? where "+MAKHO+"=?";
            PreparedStatement ps= conn.prepareStatement(queryUpdate);
            ps.setInt(2, t.getMaKho());
            ps.setString(1, t.getTenKho());
  
            int k=ps.executeUpdate();
            if(k>0)
                return 1;
            else
                return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;    }

    
    public int delete(Kho t) {
            try {
            String queryUpdate= "delete from "+TABLE_NAME+" where "+MAKHO+"=?";
            PreparedStatement ps= conn.prepareStatement(queryUpdate);
            ps.setInt(1, t.getMaKho());
            int k=ps.executeUpdate();
            if(k>0)
                return 1;
            else
                return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;     }

   
    public List<Kho> find(Kho t) {
        List<Kho> list = new ArrayList<>();
        String sql_select="";
        try {
           
                sql_select = "SELECT * FROM "+TABLE_NAME+" where maKho = '"+t.getMaKho()+"' or tenKho like '%"+t.getMaKho()+"%'";
            
             
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {                    
                int maKho = rs.getInt(MAKHO);
                String tenKho = rs.getString(TENKHO); 
                list.add(new Kho(maKho,tenKho));   
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
