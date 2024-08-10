<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="PADDY"></c:out>

<c:set var="name" scope="session" value="sova"></c:set>
<c:out value="${name}"></c:out>

<% pageContext.setAttribute("number", 6); %>

<c:if test="${number%2==0}"><c:out value="EVEN"></c:out></c:if>

</body>
</html>