<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
  <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/>
<h1>Database:</h1>
<table border="1"  align="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			
		</tr>		
		<c:forEach items="${list}" var="stu">
		<tr>
			<td><c:out value="${stu.id}"/></td>
			<td><c:out value="${stu.name}"/></td>
			
				
		</tr>
		</c:forEach>
	</table>
	</br>
	</br>
	
	<div id ="con" align="center">
				<a href = "update?id=<c:out value="${stu.id}"/>"><button type ="button">Update</button></a>
				<a href = "delete?id=<c:out value="${stu.id}"/>"><button type = "button">Delete</button></a>	
				</div>
	</br>
	</br>
	<centre>
	<a href ="http://localhost:8080/web-spring-mvc/"><button type = "button" height ="100px" width="50px">HOME</button></a>
	<a href ="insert"><button type = "button" height ="100px" width="50px">INSERT</button></a></centre>
</body>
</html>