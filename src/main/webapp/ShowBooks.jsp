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

<div style=" border: 3px solid green; display: flex; flex-direction: column;  justify-content: center;  align-items: center;  text-align: center;  min-height: 100vh;">

<%
	Books books = (Books)request.getAttribute("booksdata");

%>

Aurthor Name : <h1> <% out.println(books.getAname());%></h1> 
And the Book Name : <h1> <% out.println(books.getBname());%></h1>


</div>
</body>
</html>