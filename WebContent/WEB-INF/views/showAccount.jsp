<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account Details</title>
</head>
<body>
<h2>Account Detail:</h2>

<%-- <p> Account #: ${param.accountNo}</p>
<p> Account Holder Name: ${param.accountHolderName}</p>
<p> Account Balance: ${param.balance}</p>  --%>

<p> <spring:message code="lbl.accountNO"></spring:message>: ${account.accountNo}</p>
<p> <spring:message code="lbl.accountHolderName"></spring:message>: ${account.accountHolderName}</p>
<p> <spring:message code="lbl.accountBalance"></spring:message>: ${account.accountBalance}</p>
</body>
</html>