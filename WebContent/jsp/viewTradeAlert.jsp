
<jsp:directive.include file="../includes/headerPagesTable.jsp" />


<div class="container">
	<h3>Alert Details -</h3>
	<table border=1 class="table">
		<tr class="success">
			<td>Product Name</td>
			<td>More Than</td>
			<td>Less Than</td>
			<td>Set Price</td>
			

		</tr>
		<s:iterator value="viewTradeAlertList">
			<tr>
				<td class="danger"><s:property value="productName" /></td>
				<td><s:property value="moreThan" /></td>
				<td><s:property value="lessThan" /></td>
				<td><s:property value="price" /></td>
				
			</tr>
		</s:iterator>
	</table>
	<table border=1 class="table">
	<tr>
	<td>current value</td>
		</tr>
			<s:iterator value="currentValueList">
		<tr>
			<td><s:property value="openingPrice" /></td>
		</tr>
		</s:iterator>	
	</table>

	<s:url var="set" action="createTradeAlert" namespace="/"></s:url>
	<p class="bg-info">
		<a href="${pageContext.request.contextPath}/jsp/createTradeAlert.jsp">Set
			an Alert Now</a><br></br>
	</p>
</div>

<jsp:directive.include file="../includes/footer.jsp" />