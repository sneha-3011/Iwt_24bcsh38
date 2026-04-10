<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>
<form action="Add.jsp" method="post">
Enter the first number: <input type="text" name="1st"><br>
Enter the second number: <input type="text" name="2nd"><br>
<input type="submit" value="add numbers"><br>
</form>
<%
String s1=request.getParameter("1st");
String s2=request.getParameter("2nd");
if(s1!=null && s2!=null){
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
out.println("Sum of two number="+(a+b));
}%>	

</body>
</html>