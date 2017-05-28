<jsp:directive.include file="../includes/headerPages.jsp" />

<div class="container">
<script>
function validateForm() {
    var productName = document.forms["form-signin"]["product.productName"].value;
    if (productName == null || productName == "--select--") {
        alert("First name must be filled out");
        return false;
    }
}
</script>
<h3 class="bg-info">Welcome   <s:property value="#session.userName"/>,   </h3>	
<s:form name= "form" cssClass="form-signin" action="createTradeAlert" >
	<h2 class="form-signin-heading">Set Your Alert</h2>
		<label for="inputEmail" class="sr-only">Company Name:</label>
		
		 <s:select 
		    list="{'Larsen & Toubro Ltd','Cap Gemini S.A.','Axis Bank Ltd','Infosys Ltd','Bharat Heavy Electricals Limited','COLGATE-PALMOLIVE (INDIA) LTD','IGATE GLOBAL','Lakshmi Machine Works Limited','Oil & Natural Gas Corporation Ltd','Reliance Industries Limited','Tata Consultancy Services Limited','Suzlon Energy Ltd','Siemens Ltd','Bosch Ltd','ATOS ORIGIN SA ORD','Toyota Motor Corporation','Aditya Birla Nuvo Ltd','HDFC Bank Limited','Canara Bank','Hindustan Unilever Ltd'}"
		   	headerKey="--select--" headerValue="--select--" name="product.productName">
		   </s:select>
		
		 <s:radio label="Condition" name="tradeAlert.moreThan" list="{'More Than'}" />
		 <s:radio name="tradeAlert.lessThan" list="{'Less Than'}" />
		
		 <s:textfield label="Price" name="tradeAlert.price" placeholder="Price" cssClass="form-control">
		 </s:textfield>
	<br>
		  <s:submit value="Set Alert" cssClass="btn btn-lg btn-primary btn-block"></s:submit>
		
		 </s:form>
		 <h3 class="bg-info"></h3>	
</div>

<jsp:directive.include file="../includes/footer.jsp" />