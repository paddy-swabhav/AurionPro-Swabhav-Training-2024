<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Insert.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>THIS IS JSP DEMO</h1>

<%-- This is Scriplet Tag --%>

<%
Date date = new Date();
out.print(date.getDate());
%>

<br>

<%-- EXPRESSION TAG --%>
<b><%= new java.util.Date() %></b>

<%-- DECLARATION TAG --%>
<%! String message = "Welcome";
	int a=10;
	int b=20;
	int add(){
		return a+b;
	}

%>

<h1><%= message %></h1>
<h3><%= add() %></h3>
</body>
</html>