<!DOCTYPE html>
<%@ page import ="java.io.*,java.util.*,java.sql.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review and Confirm</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script type="text/javascript">
function myFunc()
{
var a = confirm("Do You Want To Go Back To Workspace?");

if(a==true)
	{
	window.location.href="Welcome.jsp";
	}
}
</script>
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
<body>
  <a href="index.jsp"><button type="button" name="button" style="float:right; background-color:red;">Log Out</button></a>
<h1 style="padding-left: 5%;">CONFIRM AND REVIEW DETAILS</h1><br><br>
<%
String debtorname=request.getParameter("debtorname");
String addrline1 = request.getParameter("debtoradd1");
String addrline2 = request.getParameter("debtoradd2");
String faxno = request.getParameter("faxno");
String phone = request.getParameter("phoneno");
String email = request.getParameter("email");

String bankname = request.getParameter("bankname");
String branchname = request.getParameter("branchname");
String ifsc = request.getParameter("IFSC");
String accno = request.getParameter("accno");
String currency = request.getParameter("currency");

%>

<form action="addDebtor" id="form">
<div class="form">
<h2><b>Debtor Details</b></h2>

	<label for="name">Debtor Name:</label>
		<%=debtorname %><br><br>

	<label for="address1">Address Line 1:</label>
		<%=addrline1 %><br><br>

	<label for="address2">Address Line 2:</label>
		<%=addrline2 %><br><br>

	<label for="faxno">Fax No:</label>
		<%=faxno %><br><br>

	<label for="phoneno">Phone No:</label>
	<%=phone %><br><br>

	<label for="email">Enter Email:</label>
		<%=email %><br><br>


<h3><b>Bank Details</b></h3>

	<label for="bankname">Bank Name:</label>
		<%=bankname %><br><br>

	<label for="branchname">Branch Name:</label>
	<%=branchname %><br><br>

	<label for="IFSC">IFSC Code:</label>
		<%=ifsc %><br><br>

	<label for="accno">Account No:</label>
		<%=accno %><br><br>

	<label for="currency">Currency Type:</label>
		<%=currency %><br><br>

		<button type="button" class="cancel" onclick="myFunc()">CANCEL </button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

         <input type="hidden" name="action" value="add_debtor">
         
         <input type="hidden" name="debtor_name" value=<%=debtorname %>>
         <input type="hidden" name="addrline1" value=<%=addrline1 %>>
         <input type="hidden" name="addrline2" value=<%=addrline2 %>>
         <input type="hidden" name="faxnum" value=<%=faxno %>>
         <input type="hidden" name="phonenum" value=<%=phone %>>
         <input type="hidden" name="email" value=<%=email %>>
         
         <input type="hidden" name="bank_name" value=<%=bankname %>>
         <input type="hidden" name="branch_name" value=<%=branchname %>>
         <input type="hidden" name="IFSC" value=<%=ifsc %>>
         <input type="hidden" name="accnum" value=<%=accno %>>
         <input type="hidden" name="currency" value=<%=currency %>>
         
         
		<button class="confirm" type="submit">CONFIRM</button>

		<button type="button" class="edit" onclick="history.back()">EDIT</button>
		</form>
</div>


</body>
</html>
