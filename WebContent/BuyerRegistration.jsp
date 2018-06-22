<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-image: url("images/img_buyers.jpg");
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
  <form name="Buyer Registration Form" method="post" action="BuyerLogin.jsp">
  
<table cellpadding="2" width="20%"  align="center"

  cellspacing="2">

<tr>

  <td colspan=2>

  <center><font size=4><b>Buyer Registration Form</b></font></center>

  </td>

  </tr>
  <tr>



  <td>Id</td>

  <td><input type=text name=textid="textid" size="30"></td>

  </tr>

<tr>

  <td>Name</td>

  <td><input type=text name=textnames id="textname" size="30"></td>

  </tr>
  <tr>

  <td>EmailId</td>

  <td><input type="text" name="emailid" id="emailid" size="30"></td>

  </tr>

<tr>

  <td>Password</td>

  <td><input type="text" name="password" id="password"

  size="30"></td>

  </tr>

  <tr>

  <td>phone number</td>

  <td><input type="text" name="phone numbers" id="phone number" size="30"></td>

  </tr>
  <tr>
  <td>house_no</td>

  <td><input type="text" name="house_no"id="house_no"size="30"></td>

  </tr>
  
  <tr>

  <td>colony</td>

  <td><input type="text" name="colony"id="colony" size="30"></td>

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

  <td><input type="hidden" name="action" value=buyerRegister></td>

</tr>

   




  <tr>

  <td><input type="reset"></td>

  
  <td><input type="submit" onclick="return check(this.form)" value="Submit"></td>

  </tr>

  </table>

  </form>
</body>
</html>