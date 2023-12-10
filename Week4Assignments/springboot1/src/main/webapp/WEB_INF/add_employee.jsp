<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
</head>
<body>
	<center>
     <h1 style='color:red'>Welcome to HTML form</h1>
     
     <form action="http://localhost:8080/addemployee/employee" method="post">
		 EmployeeID: <input type="text" placeholder="username here" name=employee_id><br><br>
		 ENAME: <input type="text" placeholder="Name here" name=employee_name><br><br>
		 ESalary: <input type="Number" placeholder="salary here" name=employee_salary><br><br>
		 <button type="submit">submit</button>
	</form>
	</center>
</body>
</html>