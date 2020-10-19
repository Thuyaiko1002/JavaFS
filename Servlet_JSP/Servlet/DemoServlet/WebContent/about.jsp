<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Servlet</title>
</head>
<body>
	Hello ${param.name}
	<%=5 * 6%>

	<%!String a = "5";%>

	<%
		String a = "6";
	out.print(a);
	%>

	<%
		String b = (String) request.getAttribute("message");
	if (b != null && b != "") {
	%>

	<h1 style="color: red;">
		<%
			out.print(b);
		%>
	</h1>

	<%
		}
	%>

</body>
</html>