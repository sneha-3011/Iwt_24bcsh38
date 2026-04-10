<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Looping</title>
</head>
<body>
<%! int i=1; %> 
<% while (i<=3) { %>
 <font color="red" size= "<%= i %>">
 Welcome to loop
 </font><br>
 <%i++;} %>
 <% for (i=1;i<=3;i++) { %>
 <font color="red" size= "<%= i %>">
 Welcome to loop
 </font><br>
 <%}%>
</body>
</html>