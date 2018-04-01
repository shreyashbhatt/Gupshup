/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupshup;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author shreyash
 */
public class DBConnection {
    private static Connection con = null;
    private static DBConnection instance = null;
    private static String url = "jdbc:mysql://localhost:3306/gupshup";
    private static String uname = "root";
    private static String pwd = "shreyash@123";
    
    
//    static DBConnection getInstance(){
//        if(instance == null){
//            instance = new DBConnection();
//        }
//        return instance;
//    }
    static Connection getConnection(){
        if(con == null){
            return openConnection();
        }
        return con;
    }
    static Connection openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,uname,pwd);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
    static void closeConnection(){
        try{
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
