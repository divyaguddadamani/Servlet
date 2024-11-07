<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

<title>x-workz</title>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<h1>book ticket</h1>
<span style="color:green">${success}<br> ${name}</span>
<span style="color:red">${failure} <br>${valid} <br>${dto1}</span>

<form action="book" method="post">
<pre>
<label for="StadiumName" class="form-lable">StadiumName</label><select name="StdiumName" class="form-control" id="StadiumName">
<option>select</option>
<option>Narendra Modi Stadium</option>
<option>M. Chinnaswamy Stadium</option>
<option>Jawaharlal Nehru Stadium</option>
<option>Rajiv Gandhi International Cricket Stadium</option>
<option>Sardar Vallabhbhai Patel Stadium</option>
</select>
<label for="ticket" class="form-lable">NoOfTicket</label>
<input type="number" name="ticket" value=${dto.noOfTicket} class="form-control" id="ticket">

<label for="number" class="form-lable">PrimaryContact</label>
<input type ="number" name="number" value=${dto.contact} class="form-control" id="number">

<label for="email" class="form-lable">Email</label>
<input type ="email" name="email" value=${dto.email} class="form-control" id="email">

<label for="submit" class="form-lable"></label>
<input type="submit" value="book" class="form-control" id="submit">

</pre>
</form>

<span style="color:red">${dto}</span>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>