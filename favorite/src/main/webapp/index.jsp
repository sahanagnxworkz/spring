<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="favorite" method="post">
		<pre>
First Name<input type="text" name="fname" />
Last Name<input type="text" name="lname" />
Gender   male<input type="radio" name="ott" value="male" />
        female<input type="radio" name="ott" value="female" />  
Reason <textarea rows="6 " cols="5" name="reason"></textarea>
Address <textarea rows="6 " cols="5" name="address"></textarea>

<input type="submit" value="send">

		</pre>
	</form>
</body>
</html>