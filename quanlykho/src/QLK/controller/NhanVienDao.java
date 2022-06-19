/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import Dao.Dao;
import QLK.connect.MyConnection;
import QLK.model.Kho;
import QLK.model.staff;
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
public class NhanVienDao implements Dao<staff> {

    private static final String TABLE_NAME = "nhanvien";
    private static final String maNV_FIELD = "maNV";
    private static final String tenNV_FIELD = "tenNV";
    private static final String email_FIELD = "email";
    private static final String diaChi_FIELD = "diachi";
    private static final String SDT_FIELD = "sdt";
    private static final String CMND_FIELD = "cmnd";
    private static final String chucVu_FIELD = "chucvu";
    private static final String maKho_FIELD = "makho";

    Connection conn = MyConnection.getInstance().getConnection();

    @Override
    public List<staff> getAll() {
        List<staff> list = new ArrayList<>();
        try {
            String sql_select = "CALL Proc_GetALL_NhanVien()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {
                String maNV = rs.getString(maNV_FIELD);
                String tenNV = rs.getString(tenNV_FIELD);
                String email = rs.getString(email_FIELD);
                String diaChi = rs.getString(diaChi_FIELD);

                String SDT = rs.getString(SDT_FIELD);
                String CMND = rs.getString(CMND_FIELD);
                String chucVu = rs.getString(chucVu_FIELD);
                String maKho = rs.getString(maKho_FIELD);

                list.add(new staff(maNV, tenNV, email, diaChi, SDT, CMND, chucVu, maKho));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<staff> getListIDNhanVien() {
        List<staff> list = new ArrayList<>();
        try {

            String sql_select = "CALL Proc_GetALL_Id_NhanVien()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {
                String IDNV = rs.getString(maNV_FIELD);
                list.add(new staff(IDNV));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<Kho> getListIDMaKho() {
        List<Kho> list = new ArrayList<>();
        try {

            String sql_select = "CALL Proc_GetALL_Id_Kho()";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery(sql_select);
            while (rs.next()) {
                int IDKho = rs.getInt("maKho");
                list.add(new Kho(IDKho));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int CoutNhanVien() {
        int dem = 0;
        try {

            String sql_select = "SELECT COUNT(*)  AS dem FROM nhanvien n";
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
    public Optional<staff> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<staff> get(String maNV) {
        staff nhanvien = new staff();
        try {
            String sql_select_by_id = "CALL Proc_GetId_NhanVien(?)";
            PreparedStatement ps = conn.prepareStatement(sql_select_by_id);
            ps.setString(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nhanvien.setMaNV(rs.getString(maNV_FIELD));
                nhanvien.setTenNV(rs.getString(tenNV_FIELD));
                nhanvien.setEmail(rs.getString(email_FIELD));
                nhanvien.setDiaChi(rs.getString(diaChi_FIELD));
                nhanvien.setCmnd(rs.getString(CMND_FIELD));
                nhanvien.setSdt(rs.getString(SDT_FIELD));
                nhanvien.setChucVu(rs.getString(chucVu_FIELD));
                nhanvien.setMaKho(rs.getString(maKho_FIELD));
            }
        } catch (Exception e) {
        }
        return Optional.of(nhanvien);
    }

    @Override
    public int insert(staff t) {
        try {
            String sql_insert = "CALL Proc_Insert_NhanVien(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getMaNV());
            ps.setString(2, t.getTenNV());

            ps.setString(3, t.getEmail());
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getSdt());
            ps.setString(6, t.getCmnd());    
              ps.setInt(7,Integer.parseInt(t.getChucVu()) );
            ps.setInt(8,Integer.parseInt(t.getMaKho()) );

            System.out.println(sql_insert);
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
    public int update(staff t) {
        try {
            String sql_update = "CALL Proc_Update_NhanVien(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_update);
            ps.setString(1, t.getMaNV());
            ps.setString(2, t.getTenNV());

            ps.setString(3, t.getEmail());
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getSdt());
            ps.setString(6, t.getCmnd());

            ps.setString(7, t.getChucVu());
            ps.setString(8, t.getMaKho());

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
    public int delete(staff t) {
        try {
            String sql_delete = "CALL Proc_Delete_NhanVien(?)";
            PreparedStatement ps = conn.prepareStatement(sql_delete);
            ps.setString(1, t.getMaNV());
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
    public List<staff> find(staff t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<staff> find(String data) {
        List listDP = new ArrayList<>();
        try {
            String query;
            if (data.equals("")) {
                query = "SELECT * FROM nhanvien n";
            } else {
                query = "SELECT * FROM nhanvien n where maNV like '%" + data + "%' "
                        + "OR  tenNV like '%" + data + "%' OR  email like '%" + data + 
                        "%' OR diachi like '%" + data + 
                        "%' OR  sdt like '%" + data + 
                        "%' OR  cmnd like '%" + data + 
                        "%' OR  chucvu like '%" + data + 
                        "%' OR  maKho like '%" + data + "%'";
            }

            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            staff nv;
            while (rs.next()) {
                nv = new staff();
                nv.setMaNV(rs.getString(maNV_FIELD));
                nv.setTenNV(rs.getString(tenNV_FIELD));
                nv.setEmail(rs.getString(email_FIELD));
                nv.setDiaChi(rs.getString(diaChi_FIELD));
                nv.setSdt(rs.getString(SDT_FIELD));
                nv.setCmnd(rs.getString(CMND_FIELD));
                nv.setChucVu(rs.getString(chucVu_FIELD));
                nv.setMaKho(rs.getString(maKho_FIELD));
                listDP.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDP;
    }
    public static void main(String[] args) {
        
        NhanVienDao n = new NhanVienDao();
  
    n.update(new staff("NV04","a","a","a","a","a","1","2"));
    }
    
    public int getNVbyID(String maNV) {
        int IDKho=-1;
        try {
            
          
            String sql_select_by_id = "select * from nhanvien where maNV=?";
            PreparedStatement ps = conn.prepareStatement(sql_select_by_id);
            ps.setString(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 IDKho = rs.getInt("maKho");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IDKho;
    }
    
    

}
