<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Login_Form.jsp">
Username :<input type="text" name="user" /><br/><br/>
Password :<input type="password" name="pass" /><br/><br/>
<input type="submit" value="Login" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>

<%
try{
 String username = request.getParameter("user");
 String password = request.getParameter("pass");
Class.forName("com.mysql.jdbc.Driver"); // MySQL database connection
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anil?useSSL=false","root","12345");
PreparedStatement pst = conn.prepareStatement("Select user,pass from login where user=? and pass=?");
pst.setString(1, username);
pst.setString(2, password);
ResultSet rs = pst.executeQuery(); 
if(rs.next())
out.println("login successful");
 else
out.println("Invalid login credentials");
 }
catch(Exception e){
out.println("Something went wrong !! Please try again");
 }
%>
</form> 
</body>
</html>