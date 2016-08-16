<!DOCTYPE html>
<html lang="en">
<head>
<title>Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	margin-left: 200px;
	margin-top: 100px;
}
</style>
</head>
<body>

	<h3>
		<%
			out.println(request.getAttribute("message").toString());
		%>
	</h3>
	<br>
	<h1 style="color: maroon;">TXU Energy</h1>
	<h2 style="color: maroon;">Customer Registration Form</h2>
	<h5 style="color: white;">All fields are mandatory</h5>
	<form method="POST" action="customer/add">
		First name <input type="text" name="firstname" required="required" />
		Last name<input type="text" name="lastname" required="required" />
		Phone<input type="text" name="phone" required="required" /> Email<input
			type="email" name="email" required="required" /><input type="submit"
			value="Register" name="register" />
	</form>
</body>
</html>