<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>The form to store data in the h2 dataabse</h1>
	<form action="addpeople">
		<input type="text" name="pid"><br>
		<input type="text" name="pname"><br>
		<input type="submit"><br>
	</form>
	<h1>The form to retrive data from the h2 database</h1>
	<form action="getPeople">
		<input type="text" name="pid"><br>
		<input type="submit">
	</form>
</body>
</html>