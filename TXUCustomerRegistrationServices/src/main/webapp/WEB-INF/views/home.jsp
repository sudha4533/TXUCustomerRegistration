<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
body {
	margin-left: 200px;
	margin-top: 100px;
	font-style: italic;
	font-weight: bold;
}

h1, p {
	color: maroon;
}
</style>
</head>
<body>
	<h1>Available Services</h1>

	<br>
	<P>${soapServices}</P>
	<br>
	<P>${restServices}</P>

</body>
</html>
