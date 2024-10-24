<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<h1>Registration successfully submitted..<h2>${name}</h2></h1>
<h3>
<span style="color:green">${success}</span>
<span style="color:red">${failure}</span>
</h3>

<form action="register" method="post">
<pre>
<pre>
Name<input type="text" name="name">
Email<input type="email" name="email">
Age<input type="number" name="age">
City<select name="city">
<option>select</option>
<option>Bangalore</option>
<option>Belagavi</option>
<option>Gokak</option>
<option>Hasan</option>
<option>Huballi</option>
<option>Athani</option>
</select>

State<select name="state">
<option>select</option>
<option >Karnataka</option>
<option >Andhra Pradesh</option>
<option >Telangana</option>
<option >Tamil Nadu</option>
<option >Maharashtra</option>
<option >Gujarat</option>
<option >Rajasthan</option>
<option >Uttar Pradesh</option>
</select>

Country<select name="country">
<option>select</option>
<option >United States</option>
<option >Canada</option>
<option >United Kingdom</option>
<option >Australia</option>
<option >Germany</option>
<option >France</option>
<option >India</option>
<option >Japan</option>
<option >China</option>
<option >Brazil</option></select>

<input type ="submit" value="register">
</pre>
</pre>
</form>
</body>
</html>