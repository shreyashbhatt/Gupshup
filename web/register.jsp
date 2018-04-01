<%-- 
    Document   : register
    Created on : 2 Apr, 2018, 12:20:46 AM
    Author     : shreyash
--%>

<%@page import="com.gupshup.UserBean"%>
<%@page import="com.gupshup.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserBean user = new UserBean();
    user.setUserName(request.getParameter("uname"));
    user.setUserEmail(request.getParameter("uemail"));
    user.setUserPassword(request.getParameter("upwd"));
    UserDAO.Insert(user);
    out.print("<script>alert('User registered succesfully!!');</script>");
%>
