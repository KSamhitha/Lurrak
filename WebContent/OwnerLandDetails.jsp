<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-image: url("img_sky.jpg");
    background-color: #ccffe6;
}
input.txt {
color: #00008B;
background-color: #E3F2F7;
border: 1px inset #00008B;
width: 200px;
}
input.btn {
color: #00008B;
background-color: #ADD8E6;
border: 1px outset #00008B;
}
form div {
clear: left;
margin: 0;
padding: 0;
padding-top: 5px;
}
form div label {
float: left;
width: 40%;
font: bold 0.9em Arial, Helvetica, sans-serif;
}
fieldset {
border: 1px dotted #61B5CF;
margin-top: 1.4em;
padding: 0.6em;
}
legend {
font: bold 0.8em Arial, Helvetica, sans-serif;
color: #00008B;
background-color: #FFFFFF;
}
</style>
</head>
<body>
<html>

  <head>

  <script type="text/javascript" src="validate.js"></script>

  </head>

  <body>

  <form action="#" name="" onSubmit="return(validate());">
  <form name="Types of Land" method="post" action="TypesOfLand.jsp">
  <form name="Logout" method="post" action="Home.jsp">
  


<table cellpadding="2" width="20%"  align="center"

  cellspacing="2">

<tr>

  <td colspan=2>

  
  <center><font size=4><b>Post your Land Details</b></font></center>
  </td>

  </tr>
  <tr>



  <td>sno</td>

  <td><input type=text name=textid="textid" size="30"></td>

  </tr>

<tr>

  <td>survey no</td>

  <td><input type=text name=textnames id="textname" size="30"></td>

  </tr>
  <tr>

  <td>area</td>

  <td><input type="text" name="area" id="area" size="30"></td>

  </tr>

<tr>

  <td>ceriteria</td>

  <td><input type="text" name="ceriteria" id="ceriteria"

  size="30"></td>

  </tr>

  <tr>

  <td>doc</td>

  <td><input type="text" name="doc" id="doc" size="30"></td>

  </tr>
  <tr>
  <td>price</td>

  <td><input type="text" name="price"id="price"size="30"></td>

  </tr>
 
<tr>

  <td>City</td>

  <td><select name="City">

  <option value="-1" selected>select..</option>

  <option value="New Delhi">NEW DELHI</option>

  <option value="Mumbai">HYDERABAD</option>

  <option value="Goa">GOA</option>

  <option value="Patna">PATNA</option>

  </select></td>

  </tr>

<tr>

  <td>PinCode</td>

  <td><input type="text" name="pincode" id="pincode" size="30"></td>

</tr>


<tr>

  <td>Land category</td>

  <td><select name="Land category">

  <option value="-1" selected>select..</option>

  <option value="agriculture lands">AGRICULTURE Lands</option>

  <option value="commerical lands">COMMERICAL Lands</option>

  <option value="recreational lands">RECREATIONAL Lands</option>

  <option value="residential lands">RESIDTIAL Lands</option>

  </select></td>

  </tr>

  <tr>

  <td>ownerid</td>

  <td><input type="text" name="ownerid" id="ownerid" size="30"></td>

</tr>

 


  <tr>

  <td><input type="reset"></td>

  
   <td><input type="submit" onclick="return check(this.form)" value="Submit"></td>
  <td><input type="submit" onclick="return check(this.form)" value="Types Of Land"></td>
  <td><input type="submit" onclick="return check(this.form)" value="Logout"></td>
  
  

  </tr>

  </table>

  </form>
  
  

</body>
</html>