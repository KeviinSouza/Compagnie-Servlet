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
	<h1>List Compagnie's</h1>
	<ul>
		<core:forEach items="${compagnie}" var="c">
			<li>${c.name} - ${c.age}</li>
		</core:forEach>
	
	
	</ul>

</body>
</html>