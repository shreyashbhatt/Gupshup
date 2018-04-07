<%-- 
    Document   : loadpost
    Created on : 4 Apr, 2018, 6:16:15 PM
    Author     : shreyash
--%>

<%@page import="javax.json.JsonObject"%>
<%@page import="com.gupshup.PostDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JsonObject obj = PostDAO.getPost();
    out.print(obj.toString());
%>
