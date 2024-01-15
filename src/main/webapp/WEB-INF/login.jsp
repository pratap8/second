<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/login/logger">
	<input placeholder="Username" name="firstname"/>
	<input placeholder="Password" name="passc"> 
	<button value="submit">Submit</button>
</form>
<form action="/register">
	<button value="Register">Register</button>
</form>
</body>
</html>