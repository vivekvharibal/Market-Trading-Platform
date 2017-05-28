<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
setTimeout(function(){ calfunc(); }, 5000);
function calfunc()
{
	var url="${pageContext.request.contextPath}/getCurrentValue";
	window.location=url;
	}


    $(document).ready(
            function() {
                setInterval(function() {
                	
                    var randomnumber =( 3100 + Math.floor(Math.random() * 10));
                    $('#show').text(
                            randomnumber);
                }, 5000);
            });
</script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/tablestyle.css" />
<title>Login Page</title>

</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><b>MoneyControl Market
						Trading Platform</b></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a
						href="${pageContext.request.contextPath}/jsp/createTradeAlert.jsp">Create
							Trade Alert</a></li>
					<s:url var="view" action="viewTradeAlert" namespace="/"></s:url>

					<li><s:a href="%{#view}">View Trade Alert</s:a></li>
					<s:url var="viewOpenPosition" action="viewOpenPosition"
						namespace="/"></s:url>

					<li><s:a href="%{#viewOpenPosition}">View Open Position</s:a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Account Details<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<s:url var="viewCashBalance" action="viewCashBalance"
								namespace="/"></s:url>
							<li><s:a href="%{#viewCashBalance}">View Cash Balance</s:a></li>
							<s:url var="viewAccountValuation" action="viewAccountValuation"
								namespace="/"></s:url>
							<li><s:a href="%{#viewAccountValuation}">View Profit/Loss</s:a></li>
							<s:url var="viewAccountValuation" action="viewAccountValuation"
								namespace="/"></s:url>
							<li><s:a href="%{#viewAccountValuation}">View Account Valuation</s:a></li>
						</ul></li>

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<s:url action="logout.action" var="logoutURL" />

					<li><s:a href="%{logoutURL}">Logout</s:a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>