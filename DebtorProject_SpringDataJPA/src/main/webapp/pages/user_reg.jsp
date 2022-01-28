<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NEW USER REGISTRATION</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<style type="text/css">
*{
box-sizing: border-box;

}

body
{
background-image: url("Images/background.jpg");
color:white;
}

.custom{
 text-align: center;;
margin: auto;
  width: 30%;
  border: 2px solid black;
  padding: 10px;
  background-color: white;
  color:black;

}

input[type=text], input[type=password],input[type=email] {
  width: 50%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

.signup{
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin:8px 0;
	border:none;
	width:50%

}
</style>
<script type="text/javascript">
        function Validate() {
            var password = document.getElementById("psw").value;
            var confirmPassword = document.getElementById("psw-repeat").value;
            if (password != confirmPassword) 
            {
                alert("Your Password is Not Matching");
                return false;
            }
           else
            	{
            	document.getElementById("reg").submit();
            	}
            
            
        }
    </script>
</head>

<body>

<h1 style="text-align:center;">NEW USER REGISTRATION</h1><br>

<div style="text-align: center;">
<img alt="newuser icon" src="Images/new user.png" width="256" height="256">
</div><br>

<div class="custom">
<form action="newUser" method="post">

  <label for="name"><b>Enter Name: </b></label>
		<input type="text" placeholder="Enter Name" name="name" id="name" required><br>

	<label for="email"><b>Enter Email: </b></label>
		<input type="email" placeholder="Enter Email" name="email" id="email" required><br>


	<label for="psw"><b>Create Password: </b></label>
		<input type="password" placeholder="Enter Password" name="password" id="psw" required><br>


	<label for="psw-repeat"><b>Confirm Password: </b></label>
    	<input type="password" placeholder="Re-enter Password" name="psw-repeat" id="psw-repeat" required><br>



    <div class="select">
     	<label for="type"><b>Select User Type: </b></label>
   	 		<select name="utype" id="type">
    			<option value="Corporate">Corporate</option>
    			<!-- <option value="Admin">Admin</option> -->
    		</select>
   </div>
    	<br><br>

     <input type="hidden" name="action" value="add_user">
    <button  class="signup" onclick="return Validate()" id="reg">REGISTER</button>

</form>
</div>
</body>
</html>
