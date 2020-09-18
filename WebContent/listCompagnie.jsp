<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compagnie's</title>
</head>
<body>
	<core:if test="${not empty name && not empty age}">
		<h1 style="text-align: center;">Hello New Compagnie !! Welcome to
			Show !!</h1>
		<br>
		<p
			style="text-align: center; font-size: 20px; font-style: italic; color: black;">
			Mr's ${name}, age of your Compagnie is: ${age} years.</p>
	</core:if>
	<core:if test="${empty name && empty age}">
		<p style="text-align: center; font-size: 20px; color: red;">Form
			not complite !! Please return.</p>
	</core:if>
	<br>
	<h1>List Compagnie's</h1>
	<ul>
		<core:forEach items="${compagnie}" var="c">
			<li>${c.name}- ${c.age}</li>
			<a href="/gerenciador/remove?id=${c.id}">Remove</a> - <a
				href="/gerenciador/sherchid?id=${c.id}">Edit</a>
		</core:forEach>
	</ul>

</body>
</html>