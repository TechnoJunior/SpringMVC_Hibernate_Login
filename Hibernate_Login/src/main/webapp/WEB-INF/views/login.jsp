<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="login" modelAttribute="user">
		UserName : <form:input path="name"/><br>
		Password : <form:input path="password"/><br>
		<input type="submit" value="Login" name="submit">
	</form:form>
</body>
</html>