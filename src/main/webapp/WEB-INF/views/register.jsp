<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: #F5DEB3;
}
p {
	color: green;
	font-size: 20px;
	font-family: Georgia;
}
input[type=text] {
	font-size: 15px;
	width: 10%;
	padding: 1px 1px;
	font-family: Georgia;
}
input[type=submit] {
	color:black;
	width: 10%;
	padding: 1px 1px;
	background-color: green;
	font-size: 25px;
}
h1 {
	color:green;
	font-family: Georgia;
}
h3 { font-family: Georgia;
}
input[type=checkbox] {
	width: 10%;
}
input[type=password] {
	font-size: 25px;
	width: 10%;
	
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" href="css/style2.css" rel="stylesheet">
</head>
<body>
	<h1>Welcome to the rewards registration page</h1>
	<h3>Please enter in your information to get in on all the cool
		reward offerings!</h3>
	<form action="username">
		<p>First Name: </p><input type="text" name="firstName">
		<p>Last Name: </p><input type="text" name="lastName">
		<p>Email: </p> <input type="text" name="email">
		<p>Phone Number:</p> <input type="text" name="pNum">
		<p>Password: </p><input type="password" name="password">
		<p>Click to receive our weekly newsletter:</p><input type="checkbox" name="false">
		<br>
		<br>
		<input type="submit" value="Submit">

	</form>
	
</body>
</html>