package QLK.controller;


import QLK.connect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import QLK.model.staff;
import QLK.model.taikhoan;
import QLK.model.user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zzgia
 */
public class taikhoancontroller {
    private static final String TABLE_NAME = "taikhoan";
    private static final String USERNAME_FIELD = "taikhoan";
    private static final String PASSWORD_FIELD = "matkhau";
    private static final String MANV_FIELD = "maNV";
    private static final String TRANGTHAI_FIELD = "trangthai";
    private static final String QUUYEN_FIELD = "quyen";
    Connection conn = MyConnection.getInstance().getConnection();
    
   
    
    public boolean checkLogin(String username, String password){
        try {
            String sql_select = "SELECT * FROM "+TABLE_NAME+" WHERE "+USERNAME_FIELD+" = ? AND "+PASSWORD_FIELD+" = ?";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {    
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

   public int PQ(String ma) {
        int so = 0;
        try {
            String sql_select = "SELECT PhanQuyen FROM dangnhap WHERE MaNV = '"+ma+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = rs.getInt("PhanQuyen");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return so;
    }
    
    public String doiPQ(int pq){
        if (pq == 1) {
            return "Quản trị";
        }else if(pq ==2){
            return "Quản lý";
        } else{
            return "Nhân viên";
        }
        
    }
    public boolean checkt(String username){
        try {
            String sql_select = "SELECT * FROM "+TABLE_NAME+" WHERE "+USERNAME_FIELD+" = ? ";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {    
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public int khoa(String t) {
        try {
            String sql_update = "UPDATE "+TABLE_NAME+" SET  "+TRANGTHAI_FIELD+"  = 0 WHERE MaNV = ? ";
            PreparedStatement ps = conn.prepareStatement(sql_update);
            
            ps.setString(1, t);
            int k = ps.executeUpdate();
            if (k > 0) {
                return 1;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public String getKhoa(String ma) {
        String so = "";
        try {
            String sql_select = "SELECT TrangThai FROM dangnhap WHERE MaNV = '"+ma+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = String.valueOf(rs.getInt("TrangThai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return so;
    }
    public String doiTT(int tt){
        if (tt ==0) {
            return "Khóa";
        }else {
            return "mở";
        }
    }
    public int getCount(String tk) {
        int so = 0;
        try {
            String sql_select = "SELECT COUNT(PhanQuyen) AS dem FROM dangnhap WHERE PhanQuyen = '"+tk+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = rs.getInt("dem");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return so;
    }
    public String getmaNV(String tk) {
        String so = "";
        try {
            String sql_select = "SELECT MaNV FROM dangnhap WHERE TaiKhoan = '"+tk+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = rs.getString("MaNV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return so;
    }
    
    public String getQuyen(String ma) {
        int so = 0 ;
        String c ="";
        try {
            String sql_select = "SELECT PhanQuyen FROM dangnhap WHERE MaNV = '"+ma+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = rs.getInt("PhanQuyen");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        c = doiPQ(so)+" :";
        return c;
    }
    public int getTong() {
        int so = 0;
        try {
            String sql_select = "SELECT COUNT(PhanQuyen) AS dem FROM dangnhap ";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {     
                so = rs.getInt("dem");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return so;
    }
    public staff getStaff(String maNV) {
        staff st = new staff();
        try {
            String sql_select ="SELECT * from nhanvien where maNV = '"+maNV+"'";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String manv = rs.getString("maNV");
                String tenNV= rs.getString("tenNV");
                String email = rs.getString("email");
                String diaChi = rs.getString("diaChi");
                String sdt = rs.getString("sdt");
                String cmnd = rs.getString("cmnd");
                String chucVu = rs.getString("chucVu");
                String maKho = rs.getString("maKho");
                st.setMaNV(manv);
                st.setTenNV(tenNV);
                st.setEmail(email);
                st.setDiaChi(diaChi);
                st.setSdt(sdt);
                st.setCmnd(cmnd);
                st.setChucVu(chucVu);
                st.setMaKho(maKho);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public List<staff> getAllStaff() {
        List<staff> list = new ArrayList<>();
        try {
            String sql_select ="SELECT maNV,tenNV FROM nhanvien WHERE maNV NOT IN (SELECT nhanvien.maNV\n" +
                                " FROM taikhoan\n" +
                                " INNER JOIN nhanvien\n" +
                                " ON nhanvien.maNV = taikhoan.maNV);";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                list.add(new staff(maNV, tenNV ,"", "", "", "", "",""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<staff> getStaff() {
        List<staff> list = new ArrayList<>();
        try {
            String sql_select ="SELECT maNV,tenNV FROM nhanvien WHERE maNV NOT IN (SELECT maNV\n" +
                                " FROM taikhoan);";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                list.add(new staff(maNV, tenNV ,"", "", "", "", "",""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public user getUser(String maNV) {
            user st = new user();
            try {
                String sql_select ="SELECT taikhoan.taikhoan,taikhoan.matkhau,nhanvien.maNV,nhanvien.tennv,nhanvien.email,nhanvien.sdt,taikhoan.trangthai,taikhoan.quyen\n" +
                                    " FROM taikhoan\n" +
                                    " INNER JOIN nhanvien\n" +
                                    " ON nhanvien.maNV = taikhoan.maNV;";
                PreparedStatement ps = conn.prepareStatement(sql_select);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    String tk = rs.getString("taikhoan");
                    String makhau = rs.getString("matkhau");
                    String manv = rs.getString("maNV");
                    String tennv = rs.getString("tenNV");
                    String email = rs.getString("email");
                    String sdt  = rs.getString("sdt");
                    int trangthai  = rs.getInt("trangthai");
                    int quyen  = rs.getInt("quyen");
                    System.out.println(quyen);
                    st.setTaikhoan(tk);
                    st.setMatkhau(makhau);
                    st.setMaNV(manv);
                    st.setTenNV(tennv);
                    st.setEmail(email);
                    st.setSdt(sdt);
                    st.setTrangthai(trangthai);
                    st.setQuyen(quyen);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return st;
        }
    
    public List<user> getAll() {
        List<user> list = new ArrayList<>();
        try {
            String sql_select ="SELECT taikhoan.taikhoan,taikhoan.matkhau,nhanvien.maNV,nhanvien.tennv,nhanvien.email,nhanvien.sdt,taikhoan.trangthai,taikhoan.quyen\n" +
                                " FROM taikhoan\n" +
                                " INNER JOIN nhanvien\n" +
                                " ON nhanvien.maNV = taikhoan.maNV;";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String tk = rs.getString("taikhoan");
                String makhau = rs.getString("matkhau");
                String maNV = rs.getString("maNV");
                String tennv = rs.getString("tenNV");
                String email = rs.getString("email");
                String sdt  = rs.getString("sdt");
                int trangthai  = rs.getInt("trangthai");
                int quyen  = rs.getInt("quyen");
                System.out.println(quyen+"");
                list.add(new user(tk, makhau ,maNV, tennv, email, sdt, trangthai,quyen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int insert(taikhoan t) {
        try {
            String sql_insert = "insert into taikhoan values(?, ?, ?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql_insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getTaikhoan());
            ps.setString(2, t.getMatkhau());
            ps.setString(3, t.getMaNV());
            ps.setInt(4, t.getTrangthai());
            ps.setInt(5, t.getQuyen());
            int k = ps.executeUpdate();
            if (k > 0) {
                ResultSet rsKey = ps.getGeneratedKeys();  
                if (rsKey.next()) {
                    return rsKey.getInt(1);
                }else{
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


    public int delete(String t) {
        try {
            String sql_delete = "DELETE FROM "+TABLE_NAME+" WHERE "+USERNAME_FIELD+" = ?";
            PreparedStatement ps = conn.prepareStatement(sql_delete);
            ps.setString(1, t);
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
    public int update(taikhoan t) {
        try {
            String sql_update = "UPDATE taikhoan SET  matkhau = '"+t.getMatkhau()+"',maNV = '"+t.getMaNV()+"', trangthai  = "+t.getTrangthai()+", quyen  = "+t.getQuyen()+" WHERE taikhoan = '"+t.getTaikhoan()+"' ";
            System.out.println(sql_update);
            PreparedStatement ps = conn.prepareStatement(sql_update);
            
            int k = ps.executeUpdate();
            if (k > 0) {
                return 1;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public List<user> getAll(String key) {
        List<user> list = new ArrayList<>();
        try {
            String sql_select ="SELECT taikhoan.taikhoan,taikhoan.matkhau,nhanvien.maNV,nhanvien.tennv,nhanvien.email,nhanvien.sdt,taikhoan.trangthai,taikhoan.quyen\n" +
                                " FROM taikhoan\n" +
                                " INNER JOIN nhanvien\n" +
                                " ON nhanvien.maNV = taikhoan.maNV where taikhoan like '%"+key+"%';";
            PreparedStatement ps = conn.prepareStatement(sql_select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String tk = rs.getString("taikhoan");
                String makhau = rs.getString("matkhau");
                String maNV = rs.getString("maNV");
                String tennv = rs.getString("tenNV");
                String email = rs.getString("email");
                String sdt  = rs.getString("sdt");
                int trangthai  = rs.getInt("trangthai");
                int quyen  = rs.getInt("quyen");
                System.out.println(quyen+"");
                list.add(new user(tk, makhau ,maNV, tennv, email, sdt, trangthai,quyen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
