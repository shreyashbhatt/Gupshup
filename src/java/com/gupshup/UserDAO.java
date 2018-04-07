/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupshup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public static UserBean Login(UserBean user){
        PreparedStatement ps;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "Select * from user where user_name = ? and user_pwd = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setUserEmail(rs.getString("user_email"));
                user.setUserPassword(rs.getString("user_pwd"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
