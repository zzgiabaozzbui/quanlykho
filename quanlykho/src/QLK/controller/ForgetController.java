/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.controller;

import QLK.connect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admins
 */
public class ForgetController {

    Connection conn = MyConnection.getInstance().getConnection();

    public ForgetController() {
    }
    
   
    
    public boolean updatePass(String username, String password){
        try {
            String sql_update = "UPDATE taikhoan  SET matkhau = '"+password+"' WHERE taikhoan = '"+username+"'";
            PreparedStatement ps = conn.prepareStatement(sql_update);
            
            int k = ps.executeUpdate();
            if (k > 0) {    
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
