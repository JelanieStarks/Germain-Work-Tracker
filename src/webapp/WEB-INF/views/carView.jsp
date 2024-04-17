<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Car Details</title>
</head>
<body>
    <h1>Car Details</h1>
    <h2>Make: <%= car.getMake() %></h2> <!-- Displays the car's make -->
    <h2>Model: <%= car.getModel() %></h2> <!-- Displays the car's model -->
    <h2>Year: <%= car.getYear() %></h2> <!-- Displays the car's year -->
</body>
</html>