<jsp:directive.include file="../includes/headerLogin.jsp" />


<div class="container">
	<s:form action="login" cssClass="form-signin">
		<h2 class="form-signin-heading">Please sign in</h2>
		<p class="bg-danger">Invalid Credentials</p>
		<label for="inputEmail" class="sr-only">Email address</label>
		<s:textfield name="user.userId" placeholder="User Name"
			cssClass="form-control"></s:textfield>
		<label for="inputPassword" class="sr-only">Password</label>
		<s:textfield name="user.password" placeholder="Password"
			cssClass="form-control" type="password"></s:textfield>
		<s:submit value="Login" cssClass="btn btn-lg btn-primary btn-block"></s:submit>
	</s:form>
</div>

<jsp:directive.include file="../includes/footer.jsp" />