<jsp:directive.include file="../includes/headerPages.jsp" />

<script>
    $(document).ready(
            function() {
                setInterval(function() {
                    alert($('#i').val());
                	var randomnumber = Math.floor(Math.random() * 100);
                    $('.show').text(randomnumber);
                }, 3000);
            });
</script>
<div class="container">
	<h3>Alert Details -  </h3>
		<table border=1 class="table">
		    <tbody>
		    <tr>
		         <td class="active">Product Name</td>
		         <td>Product ID</td>
		         <td>More Than</td>
		           <td>Less Than</td>
		             <td>Set Price</td>
		               <td>Current Price</td>
		              
		      </tr>
		      <% int i=0; %>
		      <s:iterator value="viewTradeAlertList">	
		         <tr>
		            <td><s:property value="productName"/></td>
		            <td><s:property value="productId"/></td>
		            <td><s:property value="moreThan"/></td>
		             <td><s:property value="lessThan"/></td>
		              <td><s:property value="price"/></td>
		              <td><b class="show"></b></td>
		           </tr>
		      </s:iterator>
		    <s:hidden id="i" value="<%=i%>">
		    </s:hidden>
		    </tbody>
		      	
	  	 </table>
		
</div>

<jsp:directive.include file="../includes/footer.jsp" />