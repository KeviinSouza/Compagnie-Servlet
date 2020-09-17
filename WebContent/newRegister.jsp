<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<core:if test="${not empty name && age}">
		<h1> Hello New Compagnie !! Welcome to Show !! </h1><br>		
		<p>
			Mr's  ${name}, age of your Compagnie is: ${age} years.
		</p>	
	</core:if test="${empty name && age}">
		<p>
			Form not complite !! Please return.
		</p>
		
</body>
</html>