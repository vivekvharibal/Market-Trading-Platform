<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
alert set!!!
<s:url var="view" action="viewTradeAlert" namespace="/"></s:url>
					<s:a href= "%{#view}">View Trade Alert</s:a> <br></br>
<s:url var="viewOpenPosition" action="viewOpenPosition" namespace="/"></s:url>
					<s:a href= "%{#viewOpenPosition}">View Open Position</s:a> <br></br>
</body>
</html>