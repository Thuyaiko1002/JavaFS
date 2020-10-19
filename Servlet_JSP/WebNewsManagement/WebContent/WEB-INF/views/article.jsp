<%@page import="java.util.List"%>
<%@page import="com.vn.entities.Article"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<div align="left">
		<h2>News List</h2>

		<%
			@SuppressWarnings(value = "unchecked")
		List<Article> list = (List<Article>) request.getAttribute("name");

		for (Article article : list) {
			out.print("<p> Id: " + article.getId());
			out.print("<p> Name: " + article.getName());
			out.print("<p> Summary: " + article.getSummary());
			out.print("<p> Content: " + article.getContent());
			out.print("<p> Create Time: " + article.getCreateTime());
			out.print("<p> ---------------------------------------------------");
		}

		request.setAttribute("msgList", list);
		%>

	</div>
</body>
</html>