<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				width="200" height="100" /></a> <a href="index.jsp">Home</a>

		</div>
	</nav>
	<form action="search" method="get">

		Search By Id<input type="number" name="id" /> <input type="submit"
			value="Search" class="btn btn-success" />

<pre>
Company: ${dto.getCompany()}
Id: ${dto.getId()}
Name: ${dto.getName()}
Cost: ${dto.getCost()}
country: ${dto.getCountry()}
type : ${dto.getType()}				
				</pre>

	</form>
</body>
</html>