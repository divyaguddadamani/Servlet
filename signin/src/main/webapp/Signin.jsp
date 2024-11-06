<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>

<h1>Signin page</h1>


<span style="color:green"> ${hi} ${id} ${success}

<span style="color:red">${info} ${failure}

<form action="signin" method="post">
<br>
UserId<input type="text" name="id" value=${dto.id}>
<br>
Email<input  type="email" name="email" value=${dto.email}>
<br>
Password<input type="password" name="password">
<br>
Confirm Password <input type="password" name="confirm">
<br>

<input type="submit" value="Signup">


</form>

</body>
</html>