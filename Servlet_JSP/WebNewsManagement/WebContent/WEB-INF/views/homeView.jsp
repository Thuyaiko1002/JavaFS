<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>

	<h3>Home Page</h3>

	This is demo Simple web news management using jsp,servlet &amp; hibernate.
	<br>
	<br>
	<b>It includes the following functions:</b>
	<ul>
		<li>News List</li>
		<li>Create News</li>
		<li>Edit News</li>
		<li>Delete News</li>
	</ul>

	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>