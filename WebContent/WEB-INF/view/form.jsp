<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body style="background-color: black; color: white; font-family: sans-serif; font-size: 15px; font-style: italic;">
	
	<h1 style="text-align: center; color: white; font-style: italic;">Cadastro Nova Empresa Filiada</h1>
	
	<form action="/gerenciador/entry?action=add" method="post">
		Name = <input style="padding: 10px; border-radius: 7px; background-color: gris;" type="text" name="name"><br>
		Age  = <input style="padding: 10px; border-radius: 7px; background-color: gris;" type="text" name="age"><br>
		
		Submit = <input style="padding: 10px; margin-left: 7px; border-radius: 20px; background-color: white; color: black; 
		text-align: center; box-sizing: 70px; font-style: italic;"  type="submit" value="Done">
	</form>

</body>
</html>