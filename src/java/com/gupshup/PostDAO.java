package com.gupshup;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreyash
 */
public class PostDAO {
    private static JsonObjectBuilder builder;
    private static JsonObject rsToJson;
    public static JsonObject getPost(){
        PreparedStatement ps;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "Select * from posts";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // Result set to JSON OBject
            builder = Json.createObjectBuilder();
            JsonArrayBuilder arrBuilder = Json.createArrayBuilder();
            ResultSetMetaData rsmeta = rs.getMetaData();
            while(rs.next()){
                arrBuilder.add(builder.add(rsmeta.getColumnName(2),rs.getString(2)).add(rsmeta.getColumnName(3),rs.getString(3))
                .add(rsmeta.getColumnName(4),rs.getString(4)));
            }
            JsonArray arr = arrBuilder.build();
            rsToJson = builder.add("post",arr).build();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rsToJson;
    }
}
