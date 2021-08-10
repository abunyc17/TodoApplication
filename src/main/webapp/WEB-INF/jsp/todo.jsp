<html>
<head>
<title>Jsp first display</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<h1>Add a Todo</h1>

		Add Todo: ${name}


		<form method="post">
			<fieldset class ="form-group">
				<label>Description:</label> 
				<input type="text" name="desc" class ="form-control" required = "required"/>
			</fieldset>
			<button type="submit" class= "btn btn-success">Add </button>
		</form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>


</html>