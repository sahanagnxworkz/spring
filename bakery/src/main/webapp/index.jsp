<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="bakery">
		<div class="form-group">
			<label for="formGroupExampleInput">name</label> <input type="text"
				class="form-control" id="formGroupExampleInput"
				placeholder="enter name here" name="name">
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput">Owner Name</label> <input
				type="text" class="form-control" id="formGroupExampleInput"
				placeholder="enter owner name here" name="ownerName">
		</div>

		<div class="form-group">
			<label for="formGroupExampleInput">wife name</label> <input
				type="text" class="form-control" id="formGroupExampleInput"
				placeholder="enter wife name here" name="ownerWifeName">
		</div>

		<div class="form-group">
			<label for="formGroupExampleInput">married</label> Yes<input
				type="radio" class="form-control" id="formGroupExampleInput"
				name="married" value="yes"> No<input type="radio"
				class="form-control" id="formGroupExampleInput" name="married"
				value="no">
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput">famous for</label>
			<textarea type="text" class="form-control" id="formGroupExampleInput"
				placeholder="enter famous for" name="ownerWifeName"></textarea>
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput">Since</label> <input type="number"
				class="form-control" id="formGroupExampleInput"
				placeholder="enter since " name="since">
		</div>

		<input type="submit" value="send" class="btn-btn-succes">
	</form>
</body>
</html>