<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Insert Details</h1>
<br/>
${msg}
</br>
<form action ="insert" method ="post" >
	Id : <input type = "text" id = "id" name ="id"/>
	Name : <input type = "text" id = "name" name ="name"/>
	<input type="submit">
	<input type ="reset">
</form>
</br>
</br>
<a href =""><button type = "button" height ="100px" width="30px" style="float:left;">Home</button></a>
<a href ="display"><button type = "button" height ="100px" width="30px" style="float:right;">Display Record</button></a>
</body>
</html>