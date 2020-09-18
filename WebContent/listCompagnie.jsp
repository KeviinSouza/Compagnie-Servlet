<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Compagnie's</title>
</head>
<body>
	<h1>List Compagnie's</h1>
	<ul>
		<core:forEach items="${compagnie}" var="c">
			<li>${c.name} - ${c.age}</li>
			<a href="/gerenciador/remove?id=${c.id}">Remove</a> - <a href="/gerenciador/EditCompagnie">Edit</a>
		</core:forEach>
	</ul>

</body>
</html>