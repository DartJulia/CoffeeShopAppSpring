<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	text-align: center;
	background-color: #F5DEB3;
}

img {
	opacity: 0.3;
}

h1 {
	color: green;
	font-family: Georgia;
}

p {
	color: green;
	font-size: 20px;
	font-family: Georgia;
}
 table.center {
    margin-left:auto; 
    margin-right:auto;
    border-collapse: collapse;
    font-size: 20px;
    width: 50%;
    background-color:#BDB76B;
    border: 4px solid black;
    
  }
</style>

<meta charset="UTF-8">
<title>Coffee Home Page</title>

</head>
<body>
	<h1>Welcome to Java Beans Coffee Shop!</h1>

	<p>
		To Register: <a href="/register">Take me to registration</a>
	</p>
	<br>
	<p>Check out some items we stock!</p>
	<table class="center" border="1">
	<tr>
	<th>Coffee Type</th>
	<th>Description</th>
	<th>Quantity</th>
	<th>Price $</th>
	<tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<!--  left out contact title on purpose to demonstrate you don't have to use all variables -->
				<td>${item.name}</td>
				<td>${item.description}</td>
				<td>${item.quantity}</td>
				<td>${item.price}</td>

			</tr>
		</c:forEach>

	</table>
	
	${ temp }
</body>
</html>