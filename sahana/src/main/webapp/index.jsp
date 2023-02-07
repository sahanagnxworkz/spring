<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="30" height="30" alt="">
	</nav>
	
	<h1>welcome</h1>

	<form action="email" method="get">
		Email : ${email}<br> <input type="submit" value="click here" />
	</form>

	<form action="number" method="get">
		Mobile number : ${number}<br> <input type="submit"
			value="click here" />
	</form>

	<form action="aadhar" method="get">
		Addhar number : ${aadhar}<br> <input type="submit"
			value="click here" />
	</form>
	</div>
	<div style="display: flex;">
	<form action="age" method="get">
		Age number : ${age}<br> <input type="submit" value="click here" />
	</form>

	<form action="salary" method="get">
		Desired Salary : ${salary}<br> <input type="submit"
			value="click here" />
	</form>
	<form action="friends" method="get">
		list of friends<br> <input type="submit" value="click here" />
		<c:forEach items="${friends}" var="ref">
			<ul>
				<li>${ref}</li>
			</ul>
		</c:forEach>
	</form>
	</div>
	<div style="display: flex;">
	<form action="places" method="get">
		list of places<br> <input type="submit" value="click here" />
		<c:forEach items="${places}" var="ref">
			<ul>
				<li>${ref}</li>
			</ul>
		</c:forEach>
	</form>
	<form action="skills" method="get">
		list of skills<br> <input type="submit" value="click here" />
		<c:forEach items="${skill}" var="ref">
			<ul>
				<li>${ref}</li>
			</ul>
		</c:forEach>
	</form>

	<form action="education" method="get">
		education :
		<br> <input type="submit" value="click here" /><br>
studentName:	${studies.getStudentName()}<br>
studentLocation:	${studies.getStudentLocation()}<br>
qualification:	${studies.getQualification()}<br>
stream:	${studies.getStream()}<br>
schoolName:	${studies.getSchoolname()}<br>
schoolLocation:	${studies.getSchoolLocation()}<br>
studentAge:	${studies.getStudentAge()}<br>
number:	${studies.getNumber()}<br>
backlogs:	${studies.isBacklogs()}<br>
graduate:	${studies.isGraduate()}<br>
	</form>
	
<form action="family">
<input type="submit" value="family"/>

Name :${family.getName()}><br>
OwnerName :${family.getOwnerName()}><br>
HouseName :${family.getHouseName()}><br>
Location :${family.getLocation()}><br>
Total :${family.getTotal()}><br>
NoOfFloors :${family.getNoOfFloors()}><br>
Animals :${family.isAnimals()}><br>
Income :${family.getIncome()}><br>
JointFamily :${family.isJointFamily()}><br>
Sibling :${family.isSibling()}><br>

</form>
<form action="mobile">
 <input type="submit" value="click here" />
name:${phone.getName()}<br>
price:${phone.getPrice()}<br>
RAM:${phone.getRam()}<br>
Color:${phone.getColor()}<br>
good:${phone.isGood()}<br>

</form>
<form action="beverages">
 <input type="submit" value="click here" />
name:${drinks.getName()}<br>
type:${drinks.getType()}<br>
Location:${drinks.getLocation()}<br>
ShopOwner:${drinks.getShopOwner()}<br>
price:${drinks.getPrice()}<br>
Good:${drinks.isGood()}<br>
manfDate:${drinks.getManfDate()}<br>
expDate:${drinks.getExpDate()}<br>
</form>

<form action="chat">
 <input type="submit" value="click here" />
name:${snacks.getName()}<br>
type:${snacks.getType()}<br>
ShopName:${snacks.getName()}<br>
Location:${snacks.getLocation()}<br>
Area:${snacks.getAreaName()}<br>
Ingridients :${snacks.getIngridents()}<br>
price:${snacks.getPriceOnOne()}<br>
total:${snacks.getTotal()}<br>
Good:${snacks.isGood()}<br>
manfDate:${snacks.getManfDate()}<br>
expDate:${snacks.getExpDate()}<br>
</form>


</body>
</html>