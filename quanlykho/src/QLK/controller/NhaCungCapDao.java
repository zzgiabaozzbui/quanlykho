/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;


import Dao.Dao;
import QLK.connect.MyConnection;
import QLK.model.NhaCungCap;
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
public class NhaCungCapDao implements Dao<NhaCungCap>{
 private static final String TABLE_NAME = "nhacungcap";
    private static final String maNCC_FIELD = "maNCC";
    private static final String tenNCC_FIELD = "tenNCC";
    private static final String diaChi_FIELD = "diaChi";
    private static final String SDT_FIELD = "sdtNCC";
    Connection conn = MyConnection.getInstance().getConnection();
    @Override
    public List<NhaCungCap> getAll() {
       List<NhaCungCap> list = new ArrayList<>();
        try {
            String sql_select = "CALL Proc_GetALL_NhaCungCap()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {                    
                String maNCC = rs.getString(maNCC_FIELD);
                
                String tenNCC = rs.getString(tenNCC_FIELD);
                String diaChi = rs.getString(diaChi_FIELD);
                String SDT = rs.getString(SDT_FIELD);
                
                list.add(new NhaCungCap(maNCC, tenNCC, diaChi, SDT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;   
    }
     public List<NhaCungCap> getListIDNhaCungCap() {
       List<NhaCungCap> list = new ArrayList<>();
        try {
            
            String sql_select = "CALL Proc_GetAll_Id_NhaCungCap()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {
                String IDNCC = rs.getString(maNCC_FIELD);
                list.add(new NhaCungCap(IDNCC));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
      public int CoutNhaCungCap() {
        int dem = 0;
        try {

            String sql_select = "SELECT COUNT(*)  AS dem FROM nhacungcap n";
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
      
      public List<NhaCungCap> find(String data, String colName) {
        List listDP=new ArrayList<>();
        try 
        {   
            String query;
            if(colName.equals("")){
            query="SELECT * FROM nhacungcap n";
            }
            else {
           query ="SELECT * FROM nhacungcap n where  "+colName +" like '%"+data+"%'";
            }
          
        
             PreparedStatement ps = conn.prepareStatement(query);
            
             
             ResultSet rs=ps.executeQuery();
             NhaCungCap ncc;
             while(rs.next())
             {
                 ncc =new NhaCungCap();
                 ncc.setMaNCC(rs.getString(maNCC_FIELD));
                 ncc.setTenNCC(rs.getString(tenNCC_FIELD));
                  ncc.setDiaChi(rs.getString(diaChi_FIELD));
                 ncc.setsdtNCC(rs.getString(SDT_FIELD));  
                 listDP.add(ncc);
             }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       return listDP;
    }

    @Override
    public Optional<NhaCungCap> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<NhaCungCap> get(String maNCC) {
        NhaCungCap nhacungcap = new NhaCungCap();
        try {
            String sql_select_by_id = "CALL Proc_GetId_NhaCungCap(?)";
            PreparedStatement ps = conn.prepareStatement(sql_select_by_id);
            ps.setString(1, maNCC);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {    
                nhacungcap.setMaNCC(rs.getString(maNCC_FIELD));
                nhacungcap.setTenNCC(rs.getString(tenNCC_FIELD));
                nhacungcap.setDiaChi(rs.getString(diaChi_FIELD));
                nhacungcap.setsdtNCC(rs.getString(SDT_FIELD));
               
   
            }
        } catch (Exception e) {
        }
        return Optional.of(nhacungcap);
    }

    @Override
    public int insert(NhaCungCap t) {
       try {
            String sql_insert = "CALL Proc_Insert_NhaCungCap(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getMaNCC());
            ps.setString(2, t.getTenNCC());
            ps.setString(3, t.getDiaChi());
             ps.setString(4, t.getsdtNCC());
           
           
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
    public int update(NhaCungCap t) {
       try {
            String sql_update = "CALL Proc_Update_NhaCungCap(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_update);
            ps.setString(1, t.getMaNCC());
            ps.setString(2, t.getTenNCC());
            ps.setString(3, t.getDiaChi());
            ps.setString(4, t.getsdtNCC());
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
    public int delete(NhaCungCap t) {
        try {
            String sql_delete = "CALL Proc_Delete_NhaCungCap(?)";
            PreparedStatement ps = conn.prepareStatement(sql_delete);
            ps.setString(1, t.getMaNCC());
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
    public List<NhaCungCap> find(NhaCungCap t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        NhaCungCapDao n = new NhaCungCapDao();
        System.out.println(n.find("NC","maNCC"));
        n.getAll();
       
        
   
    }
    
}
