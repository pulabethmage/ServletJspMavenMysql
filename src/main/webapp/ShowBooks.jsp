<%@page import="co.urbanraw.web.model.Books"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Books</title>
</head>
<body>

<%

	Books books = (Books)request.getAttribute("booksdata");

	out.println(books);

%>

</body>
</html>