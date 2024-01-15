<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>Please Register</H1>
<form action="/register/formfilled" method="post">
	<input placeholder="Phone Number" name="phone"/>
	<input placeholder="First Name" name="firstname"/>
	<input placeholder="Last Name" name="lastname"/>
	<input placeholder="Set Passcode" name="passc"/>
	<button value="submit">Submit</button>
</form>
<form action="/login">
	<button value="Login Page">Login</button>
</form>
</body>
</html>