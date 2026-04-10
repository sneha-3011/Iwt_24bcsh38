<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int a=6; %>
<% if(a%2==0) { %>
<p> number is even </p>
<% }else { %> 
<p> number is odd</p>
<% } %>
<%! int day=3; %>
<%
switch(day)
{
case 1:
out.println("the day is sunday");
break;
case 2:
out.println("the day is monday");
break;
case 3:
out.println("the day is tuesday");
break;
case 4:out.println("the day is wednesday");
break;
case 5:
out.println("the day is thursday");
break;
case 6:
out.println("the day is friday");
break;
case 7:
out.println("the day is saturday");
break;
default:
out.println("wrong choice");
}%>
</body>
</html>