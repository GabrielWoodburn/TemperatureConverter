<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius Converter</title>
</head>
<body>
<h1>Celsius Converter</h1>
<form action="celsiusToFahrenheitServlet" method="post">
Enter the temperature in Celsius to convert to Fahrenheit:
<input type="text" name="celsiusTemperature" size="10">
<input type="submit" value="Calculate Celsius to Fahrenheit" />
</form>
 <a href="index.jsp">Home</a>
 <a href="celsiusToFahrenheit.jsp">Celsius to Fahrenheit Converter</a>
 <a href="fahrenheitToCelsius.jsp">Fahrenheit to Celsius Converter</a>
</body>
</html>