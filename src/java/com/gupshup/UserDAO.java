/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupshup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shreyash
 */
public class UserDAO {
    public static void Insert(UserBean user){
        PreparedStatement ps;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "Insert into user (user_name,user_email,user_pwd)values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserEmail());
            ps.setString(3, user.getUserPassword());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
