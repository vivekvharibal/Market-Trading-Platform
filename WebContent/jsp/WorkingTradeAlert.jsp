<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
    $(document).ready(
            function() {
                setInterval(function() {
                    var randomnumber = Math.floor(Math.random() * 100);
                    $('#show').text(
                            randomnumber);
                }, 3000);
            });
</script>
</head>
<body>
<h3>Alert Details -  </h3>
		<table border=1 width="50%" >
		      <tr>
		         <td>Product Name</td>
		         <td>Product ID</td>
		         <td>More Than</td>
		           <td>Less Than</td>
		             <td>Set Price</td>
		               <td>Current Price</td>
		              
		      </tr>
		      <s:iterator value="viewTradeAlertList">	
		         <tr>
		            <td><s:property value="productName"/></td>
		            <td><s:property value="productId"/></td>
		            <td><s:property value="moreThan"/></td>
		             <td><s:property value="lessThan"/></td>
		              <td><s:property value="price"/></td>
		              <td><b id="show"></b></td>
		           </tr>
		      </s:iterator>	
	  	 </table>
		

</body>
</html>