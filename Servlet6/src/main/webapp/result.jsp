<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to result page</h1>

<%

out.println("welcome to jsp java");
String name=request.getParameter("tbname");
String num=request.getParameter("tbnum");
out.println(name);
out.println();
out.println(num);


%>
</body>
</html>