<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="200" height="100" /></a> <a href="index.jsp">Home</a> <a
				href="RocketSearch.jsp">Search</a>
		</div>
	</nav>
	<h1>Rocket data</h1>
	<c:forEach items="${errors}" var="e">
	<span style="color: red;">${e.message}</span>
	
	</c:forEach>
	<form action="rocket" method="post">
	<pre>
	
Company	<input type="text" name="company"/>

Name   <input type="text" name="name"/>

Cost <input type="text" name="cost"/>

Type  <select name="type">
	<option value="">SELECT</option>
	<c:forEach items="${types}" var="p"> 
	<option value="${p}">${p}</option>
	</c:forEach>	
	</select>

Country:<select name="country">
	<option value="">SELECT</option>
	<c:forEach items="${countrys}" var="p"> 
	<option value="${p}">${p}</option>
	</c:forEach>	
	</select>
	
	<input type="submit" value="send" class="btn btn-success"/>
	</pre>
	</form>
</body>
</html>