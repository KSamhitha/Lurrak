<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>

body {

background-image: url("images/typesofland.jpg");


}
</style>
<body>
<h1 style="color:black;"><p align="center"><font size="20">Types of Lands</font></p></h1>

</body>
<style>
.btn-group button {
    position: left
    background-color: #4CAF50; /* Pink background */
    border: 10px solid pink; /* White border */
    color: black; /* Black text */
    padding: 10px 24px; /* Some padding */
    cursor: pointer; /* Pointer/hand icon */
    width: 250px;
    height:80px;/* Set a width if needed */
    display: block; /* Make the buttons appear below each other */
}

.btn-group button:not(:last-child) {
    border-bottom: none; /* Prevent double borders */
}

/* Add a background color on hover */
.btn-group button:hover {
    background-color: white;
}
</style>
<div class="btn-group">
<p style="line-height: 70px; text-align: center;"> <a href="AgriculturalLand.jsp"><button type="submit" class="btn">Agricultural lands</button></p>
<p style="line-height: 70px; text-align: center;"> <a href="CommercialLand.jsp"><button type="submit" class="btn">Commercial lands</button></p>
<p style="line-height: 70px; text-align: center;"> <a href="RecreationalLand.jsp"><button type="submit" class="btn">Recreational lands</button></p>
 <p style="line-height: 70px; text-align: center;"> <a href="ResidentialLand.jsp"><button type="submit" class="btn">Residential lands</button></p>
</div>
</body>
</html>