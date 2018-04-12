<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lbl.title"></spring:message></title>
</head>
<body>
<h1> </h1>
<h1>Create a new account</h1>
<form:form  action="save" >
	 <table>
		<tr>
			<td><spring:message code="lbl.accountNO"></spring:message>:</td>
			<td><form:input path="accountNo" size="30"/></td>
		</tr>
		<tr>
			<td><spring:message code="lbl.accountHolderName"></spring:message>:</td>
			<td><form:input path="accountHolderName" size="30"/></td>
		</tr>
		<tr>
			<td><spring:message code="lbl.accountBalance"></spring:message>:</td>
			<td><form:input  path="accountBalance" size="30"/></td>
		</tr>
		<tr>
			<td colspan = 2 align="center">
				<spring:message code="lbl.btnCreateAccount" var="createAccount"></spring:message>
				<input type="submit" name="btnSubmit" value="${createAccount}">
			</td>
		</tr>
	</table> 
</form:form>
</body>
</html>

<!-- <div>
		<label>Account# :</label>
		<input type="text" name="accountNo">
	</div>
	
	<div>
		<label>Account Holder Name: </label>
		<input type="text" name="accountHolderName">
	</div>
	
	<div>
		<label>Account Balance: </label>
		<input type="text" name="balance">
	</div>
	</div>
		<input type="submit" name="btnSubmit" value="Create Account">
	<div> -->