<html>
<head>
<title>Jsp first display</title>

</head>

<body>

<h1>Add a Todo </h1>

<form method = "post">
User: <input type = "text" name = "userId" /><br/>
Todo Description: <input type = "text" name = "desc"/><br/>
Date: <input type ="date" name = "targetDate"/><br/>
IsDone: <input type ="text" name = "isComplete" />
<input type="submit">

</form>
<p>Welcome! List of Todos:  ${todo}!!!</p><br/>
<a href="/add-todo">Add a Todo</a><br/><br/>
Your name is: ${name}

</body>


</html>