<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Book Details</title>
</head>
<body>

<form action="addBook" method="POST">

<h1>Insert a New Book</h1>

Enter Book Name <input type="text" name="bname" >
Enter Author Name <input type="text" name="aname">

<input type="submit" value="insert data">
</form>
<br><br>

<a href="index.jsp"> Show Books </a>

</body>
</html>