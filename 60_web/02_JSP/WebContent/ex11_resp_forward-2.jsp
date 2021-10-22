<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ex11_resp_forward-2.jsp</title>
</head>
<body>


<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

%> 

	<h2>[ex11_resp_forward-2.jsp 페이지]</h2>
	<h3>ID : <%=id %></h3>
	<h3>PW : <%=pwd %></h3>

</body>
</html>