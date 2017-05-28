<jsp:directive.include file="../includes/headerPages.jsp" />

<div class="container">
	<h3>Open Position Details -  </h3>
		<table border=1 width="50%" >
		      <tr>
		         <td>Product NAme</td>
		         <td>Product Id</td>
		         <td>Transaction Date</td>
		           <td>No of Shares</td>
		             <td>Transaction price</td>
		               <td>Transaction type</td>
		      </tr>
		      <s:iterator value="viewOpenPositionList">	
		         <tr>
		            <td><s:property value="productName"/></td>
		            <td><s:property value="productId"/></td>
		            <td><s:property value="transactionDate"/></td>
		             <td><s:property value="noOfShares"/></td>
		              <td><s:property value="transactionPrice"/></td>
		               <td><s:property value="transactionType"/></td>
		           </tr>
		      </s:iterator>	
	  	 </table>
		
</div>

<jsp:directive.include file="../includes/footer.jsp" />