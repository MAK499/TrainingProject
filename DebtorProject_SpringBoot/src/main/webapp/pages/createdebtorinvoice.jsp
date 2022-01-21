<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review and Confirm</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
*{
box-sizing: border-box;

}
body
{
  text-align: center;
      background-image: url("Images/background.jpg");
      color:white;
}

input[type=text], input[type=password],input[type=email] {
  width: 25%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

.cancel{
	background-color: red;
	color: white;
	padding: 16px 20px;
	margin:8px 0;
	border:none;
	width:10%

}

.confirm{
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin:8px 0;
	border:none;
	width:10%


}

.edit {
	background-color: grey;
	color: white;
	position: right;
	padding: 16px 20px;
	margin:8px 0;
	border:none;
	width:10%

}

.form
{
margin: auto;
  width: 50%;
  border: 2px solid black;
  padding: 10px;
  background-color: white;
  color:black;
}

</style>
</head>
<body >
  <a href="index.jsp"><button type="button" name="button" style="float:right; background-color:red;">Log Out</button></a>
<h1 style="text-align:center;padding-left: 5%;">NEW DEBTOR INVOICE</h1><BR>



<div class="form">
<h2 style="text-decoration: underline;"><b>DEBTOR DETAILS</b></h2><br>
<form action="Confirm&Review.jsp">
	<label for="name">Debtor Name:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="debtorname" required><br>

	<!-- <label for="debtorid">Debtor Id:</label>
		<input type="text"  name="debtorid" id="debtorid" ><br> -->

	<label for="address1">Address Line 1:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="debtoradd1" id="add" required><br>

	<label for="address2">Address Line 2:</label>
		<input type="text"  name="debtoradd2" id="add2"><br>

	<label for="faxno">Fax No:</label>
		<input type="text"  name="faxno" id="faxno"><br>

	<label for="phoneno">Phone No:</label>
		<input type="text"  name="phoneno" id="phoneno" ><br>

	<label for="email">Enter Email:</label>
		<input type="email"  name="email" id="email" >
		
		<hr>


<h2 style="text-decoration: underline;"><b>BANK DETAILS</b></h2><br>

	<label for="bankname">Bank Name:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="bankname" id="bankname" required><br>

	<label for="branchname">Branch Name:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="branchname" id="branchname" required><br>

	<label for="IFSC">IFSC Code:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="IFSC" id="IFSC" required><br>

	<label for="accno">Account No:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="accno" id="accno" required><br>

	<label for="currency">Currency Type:<span style="color:red; font-size: 20px;">*</span></label>
		<input type="text"  name="currency" id="currency" required><br>

		<a href="Welcome.jsp"><button type="button" class="cancel" >CANCEL </button></a>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
          
          
          <input type="hidden"  name="action" value="add_debtor"> 
		<button type="submit" class="confirm">CONFIRM</button>
		<button type="reset" class="edit">CLEAR</button>
       </form>
		
		</div>



</body>
</html>
