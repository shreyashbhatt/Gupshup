<%-- 
    Document   : login
    Created on : 4 Apr, 2018, 2:03:41 PM
    Author     : shreyash
--%>

<%@page import="com.gupshup.UserBean"%>
<%@page import="com.gupshup.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserBean user = new UserBean();
    user.setUserName(request.getParameter("uname"));
    user.setUserPassword(request.getParameter("upwd"));
    user = UserDAO.Login(user);
    if(user.getUserName() == null){
        out.print("Invalid usename or Passsword");
    }
    else{
        session.setAttribute("uname", user.getUserName());
        response.sendRedirect("home.jsp");
    }
    
%>
