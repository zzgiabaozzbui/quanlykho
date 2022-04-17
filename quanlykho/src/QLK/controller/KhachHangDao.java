/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;


import Dao.Dao;
import QLK.connect.MyConnection;
import QLK.model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author nguye
 */
public class KhachHangDao implements Dao<KhachHang>  {

    private static final String TABLE_NAME = "khachhang";
    private static final String maKH_FIELD = "maKH";
    private static final String tenKH_FIELD = "tenKH";
    private static final String diaChi_FIELD = "diaChi";
    private static final String SDT_FIELD = "SDT";
    private static final String CMND_FIELD = "CMND";
   
      Connection conn = MyConnection.getInstance().getConnection();

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> list = new ArrayList<>();
        try {
            String sql_select = "CALL Proc_GetALL_KhachHang()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {                    
                String maKH = rs.getString(maKH_FIELD);
                
                String tenKH = rs.getString(tenKH_FIELD);
                String diaChi = rs.getString(diaChi_FIELD);
                String SDT = rs.getString(SDT_FIELD);
                String CMND = rs.getString(CMND_FIELD);
                
                list.add(new KhachHang(maKH, tenKH, diaChi, SDT, CMND));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;   
    }
     public List<KhachHang> getListIDKhachHang() {
       List<KhachHang> list = new ArrayList<>();
        try {
            
            String sql_select = "CALL Proc_GetAll_Id_KhachHang()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {
                String IDKhachHang = rs.getString(maKH_FIELD);
                list.add(new KhachHang(IDKhachHang));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
      public int CoutKhachHang() {
        int dem = 0;
        try {

            String sql_select = "SELECT COUNT(*)  AS dem FROM khachhang k";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {

                dem = rs.getInt("dem");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dem;
    }

    @Override
    public Optional<KhachHang> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<KhachHang> get(String maKH) {
       KhachHang khachhanng = new KhachHang();
        try {
            String sql_select_by_id = "CALL Proc_GetId_KhachHang(?)";
            PreparedStatement ps = conn.prepareStatement(sql_select_by_id);
            ps.setString(1, maKH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {    
                khachhanng.setMaKH(rs.getString(maKH_FIELD));
                khachhanng.setTenKH(rs.getString(tenKH_FIELD));
                khachhanng.setDiaChi(rs.getString(diaChi_FIELD));
                khachhanng.setSDT(rs.getString(SDT_FIELD));
                khachhanng.setCMND(rs.getString(CMND_FIELD));
   
            }
        } catch (Exception e) {
        }
        return Optional.of(khachhanng);
    }

    @Override
    public int insert(KhachHang t) {
        try {
            String sql_insert = "CALL Proc_Insert_KhachHang(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getMaKH());
            ps.setString(2, t.getTenKH());
            ps.setString(3, t.getDiaChi());
             ps.setString(4, t.getSDT());
              ps.setString(5, t.getCMND());
           
            int k = ps.executeUpdate();
            if (k > 0) {
                ResultSet rsKey = ps.getGeneratedKeys();
                if (rsKey.next()) {
                    return rsKey.getInt(1);
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(KhachHang t) {
        try {
            String sql_update = "CALL Proc_Update_KhachHang(? , ? , ? , ? , ?)";
            PreparedStatement ps = conn.prepareStatement(sql_update);
            ps.setString(1, t.getMaKH());
            ps.setString(2, t.getTenKH());
            
            ps.setString(3, t.getDiaChi());
            ps.setString(4, t.getSDT());
            ps.setString(5, t.getCMND());
             
             
            int k = ps.executeUpdate();
            if (k > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(KhachHang t) {
       try {
            String sql_delete = "CALL Proc_Delete_KhachHang(?)";
            PreparedStatement ps = conn.prepareStatement(sql_delete);
            ps.setString(1, t.getMaKH());
            int k = ps.executeUpdate();
            if (k > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
     public List<KhachHang> find(String data, String colName) {
        List listDP=new ArrayList<>();
        try 
        {   
            String query;
            if(colName.equals("")){
            query="SELECT * FROM nkhachhang k";
            }
            else {
           query ="SELECT * FROM khachhang k where  "+colName +" like '%"+data+"%'";
            }
          
        
             PreparedStatement ps = conn.prepareStatement(query);
            
             
             ResultSet rs=ps.executeQuery();
             KhachHang kh;
             while(rs.next())
             {
                 kh =new KhachHang();
                 kh.setMaKH(rs.getString(maKH_FIELD));
                 kh.setTenKH(rs.getString(tenKH_FIELD));
                  kh.setDiaChi(rs.getString(diaChi_FIELD));
                  kh.setSDT(rs.getString(SDT_FIELD));
                 kh.setCMND(rs.getString(CMND_FIELD));  
                 listDP.add(kh);
             }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return listDP;
    }

    @Override
    public List<KhachHang> find(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        KhachHangDao d = new KhachHangDao();
   
        System.out.println( d.find("KH00","maKH"));
       
    }
    
}
