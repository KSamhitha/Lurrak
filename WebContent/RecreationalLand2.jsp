<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
* {
    box-sizing: border-box;
}
body {
    background-image: url("img_sw.jpg");
    background-color: #ccffe6;
}
.btn {
    border: none;
    background-color: inherit;
    padding: 14px 28px;
    font-size: 16px;
    cursor: pointer;
    display: inline-block;
}

.btn:hover {background: #eee;}

.success {color: green;}
.info {color: dodgerblue;}
.warning {color: orange;}
.danger {color: red;}
.default {color: black;}

body {
    margin: 0;
    font-family: Arial;

}


.column {
    float: left;
    width: 25%;
    padding: 10px;
}


.column img {
    opacity: 0.8; 
    cursor: pointer; 
}

.column img:hover {
    opacity: 1;
}


.row:after {
    content: "";
    display: table;
    clear: both;
}


.container {
    position: relative;
    display: none;
}


#imgtext {
    position: absolute;
    bottom: 15px;
    left: 15px;
    color: white;
    font-size: 20px;
}


.closebtn {
    position: absolute;
    top: 10px;
    right: 15px;
    color: white;
    font-size: 35px;
    cursor: pointer;
}
</style>
</head>
<body>

&nbsp; &nbsp; 
<h2><font size = "8">Criteria</font></h2>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
 <a href="RecreationalLand1.jsp"><button class="btn Fixed Rate">Fixed Rate</button></a><br>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<a href="RecreationalLand2.jsp"><button class="btn Lease">Lease    </button></a><br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
 <a href="RecreationalLand3.jsp"><button class="btn Biddings">Biddings </button></a><br>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<a href="RecreationalLand4.jsp"><button class="btn offers">offers   </button></a><br>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<a href="RecreationalLand5.jsp"><button class="btn loans">loans    </button></a><br>
 

<div style="text-align:center">
  
 
</div>

<div class="row1">


  <div class="column">
    <a href="Lease3.jsp"><img src="images/land3/1.jpg" style="width:100%"></a>
  </div>
  
  
  <div class="column">
    <a href="Lease3.jsp"><img src="images/land3/2.jpg" style="width:100%"></a>
  </div>
  
  </div>
  <div class="row2">
  <div class="column">
    <a href="Lease3.jsp"><img src="images/land3/27.jpg" style="width:100%"></a>
  </div>
  
  
  <div class="column">
  <a href="Lease3.jsp"><img src="images/land3/26.jpg" style="width:100%"></a>
      </div>
  </div>

<script>

</script>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<a href="Home.jsp"><button class="btn Logout">Logout   </button></a>

</body>
</html>