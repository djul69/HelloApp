<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulaire utilisateur</title>
</head>
<body>
<div>
<form action="simple-hello" method=POST>
<label>Votre nom</label><br><input name="name" type="text"><br>
<label>Votre prénom</label><br><input name="surname" type="text"><br>
<label>Heure de la journée</label><br><input name="hour" type="text"/><br>
<input type="submit" value="Envoyer le formumlaire">
</form>
</div>
</body>
</html>