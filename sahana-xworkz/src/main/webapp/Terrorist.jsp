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
				width="200" height="100" /></a> <a href="TerroristSearch.jsp">
				Terrorist Search</a>
		</div>

	</nav>
	<form action="terrorist" method="post">
		<pre>
		Name <input type="text" name="name" />
		
		Country <input type="text" name="country" />
		
		Age <input type="number" name="age" />
		
		Punishment <input type="number" name="punishment" />
		
		<input type="submit" value="save" class="btn btn-success" />

</pre>
	</form>

</body>
</html>