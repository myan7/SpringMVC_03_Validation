<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lbl.title"></spring:message></title>
</head>
<body>
	<h1>Test</h1>

	<form action="new" method="post">
		<input type="submit" name="btnSubmit" value="Route to Create Account">
	</form>


</body>
</html>