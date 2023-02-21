<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
				width="200" height="100" /></a>
		</div>
	</nav>
	<h1>
		<span style="color: green;">welcome to BigBasket Buy whatever
			you want</span>
	</h1>
	<c:forEach items="${errors}" var="e">
	<span style="color: red;">${e.message}</span>
	
	</c:forEach>
	<form action="bigbasket" method="post">

		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" name="email" value="${email}" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp"
				placeholder="Enter email">

		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" name="password" class="form-control"
				id="exampleInputPassword1" placeholder="Password">
		</div>

		Location:<select name="location" class="form-control" />
		<option value="">Select</option>
		<c:forEach items="${location}" var="listOfLocation">
			<option value="${listOfLocation}">${listOfLocation}</option>
		</c:forEach>
		</select> Items:<select name="itemName" class="form-control" />
		<option value="">Select</option>
		<c:forEach items="${itemsList}" var="listOfItems">
			<option value="${listOfItems}">${listOfItems}</option>ss
		</c:forEach>
		</select>

		<div class="form-group">
			<label for="exampleFormControlInput1">Item Price</label> <input
				type="text" name="itemPrice" class="form-control"
				id="exampleFormControlInput1" placeholder="enter price">
		</div>

		<div class="form-group">
			<label for="exampleFormControlInput1">Brand name</label> <input
				type="text" name="itemBrandName" class="form-control"
				id="exampleFormControlInput1" placeholder="enter itemBrandName">
		</div>

		<div class="form-group">
			<label for="exampleFormControlInput1">Since</label> <input
				type="number" name="since" class="form-control"
				id="exampleFormControlInput1" placeholder="enter since">
		</div>

		<div class="form-group">
			<label for="exampleFormControlInput1">Branch number</label> <input
				type="number" name="noOfbranchs" class="form-control"
				id="exampleFormControlInput1" placeholder="enter noOfbranchs">
		</div>

		<div class="form-group">
			<label for="exampleFormControlInput1">Manf Date</label> <input
				type="date" name="manfDate" class="form-control"
				id="exampleFormControlInput1" placeholder="enter manfDate">
		</div>

		<div class="form-group">
			<label for="exampleFormControlInput1">EXP Date</label> <input
				type="number" name="expDate" class="form-control"
				id="exampleFormControlInput1" placeholder="enter expDate">
		</div>
		<input type="submit" value="send" class="btn btn-success">

	</form>

</body>
</html>