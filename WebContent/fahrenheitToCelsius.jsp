<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit Converter</title>
</head>
<body>
<h1>Fanhrenheit Converter</h1>
<form action="fahrenheitToCelsiusServlet" method="post">
Enter the temperature in Fahrenheit to convert to Celsius:
<input type="text" name="fahrenheitTemperature" size="10">
<input type="submit" value="Calculate Fahrenheit to Celsius" />
</form>
<a href="index.jsp">Home</a>
<a href="celsiusToFahrenheit.jsp">Celsius to Fahrenheit Converter</a>
<a href="fahrenheitToCelsius.jsp">Fahrenheit to Celsius Converter</a>
</body>
</html>