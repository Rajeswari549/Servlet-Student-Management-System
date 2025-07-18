<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>welcome to results page</h1>
<%


out.println("Math: "+request.getParameter("maths"));
out.println("<br>");
out.println("pyh: "+request.getParameter("physics"));
out.println("<br>");
out.println("che: "+request.getParameter("chemistry"));
out.println("<br>");

out.println(request.getAttribute("percentage"));
out.println("<br>");
out.println(request.getAttribute("grade"));

%>
</body>
</html>