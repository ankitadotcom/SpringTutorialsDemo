<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

    <form action="/display" method="post">
    	 <div class="center">
            UserName: <br>
            <input type="text" name="username" />
            <br> <br>
        </div>

        <div class="center">
            Password: <br>
            <input type="text" name="password" />
            <br> <br>
        </div>

        <div class="center">
            <input type="submit" value="Submit">
        </div>
    </form>

</body>
</html>