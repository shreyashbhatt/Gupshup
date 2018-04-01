/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupshup;

import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shreyash
 */
public class DBConnection {
    private static Connection con;
    private static DBConnection instance;
    static Connection getConnection(){
        if(instance == null){
            DBConnection db = new DBConnection();
            db.openConnection();
        }
        return con;
    }
    static Connection openConnection(){
        try {
            Class.forName("com.jdbc.mysql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
}
