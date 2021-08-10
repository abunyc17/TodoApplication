<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Jsp first display</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" 
	rel="stylesheet">
</head>

<body>
<div class="container">
<h1>Your Todo's</h1>
<table class = "table table-striped">
<caption>Your Todos are</caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
<th>Is it Done?</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<c:forEach items= "${todo}" var="todo">
<tr>
<td>${todo.desc}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
<td><a type="button" class="btn btn-warning" href = "/delete-todo?id=${todo.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<%-- <p>Welcome! List of Todos:  ${todo}!!!</p><br/> --%>
<div>
<a class="button" href="/add-todo">Add a Todo</a><br/><br/>
</div>
<%-- Your name is: ${name} --%>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>


</html>