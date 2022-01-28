<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<html>
<head>
<title>Review and Confirm</title>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
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
html, body {
	min-height: 100%;
}

body, div, form, input, select, p {
	padding: 0;
	margin: 0;
	outline: none;
	font-family: Roboto, Arial, sans-serif;
	font-size: 14px;
	color: #666;
	line-height: 22px;
}

h1 {
	position: absolute;
	margin: 0;
	font-size: 32px;
	color: #fff;
	z-index: 2;
}

h2 {
	font-weight: 400;
}

.testbox {
	display: flex;
	justify-content: center;
	align-items: center;
	height: inherit;
	padding: 20px;
}

form {
	width: 100%;
	padding: 20px;
	border-radius: 6px;
	background: #fff;
	box-shadow: 0 0 20px 0 #095484;
}

.banner {
	position: relative;
	height: 250px;
	background-image: url("Images/banner.jpg");
	background-size: cover;
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: left;
}

.banner::after {
	content: "";
	background-color: rgba(0, 0, 0, 0.4);
	position: absolute;
	width: 100%;
	height: 100%;
}

input, select {
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input {
	width: calc(100% - 10px);
	padding: 5px;
}

select {
	width: 100%;
	padding: 7px 0;
	background: transparent;
}

.item:hover p, .item:hover i, .question:hover p, .question label:hover,
	input:hover::placeholder, a {
	color: #095484;
}

.item input:hover, .item select:hover {
	border: 1px solid transparent;
	box-shadow: 0 0 6px 0 #095484;
	color: #095484;
}

.item {
	position: relative;
	margin: 10px 0;
}

input[type="date"]::-webkit-inner-spin-button {
	display: none;
}

.item i, input[type="date"]::-webkit-calendar-picker-indicator {
	position: absolute;
	font-size: 20px;
	color: #a9a9a9;
}

.item i {
	right: 2%;
	top: 30px;
	z-index: 1;
}

[type="date"]::-webkit-calendar-picker-indicator {
	right: 1%;
	z-index: 2;
	opacity: 0;
	cursor: pointer;
}

input[type=checkbox] {
	display: none;
}

label.check {
	position: relative;
	display: inline-block;
	margin: 5px 20px 10px 0;
	cursor: pointer;
}

.question span {
	margin-left: 30px;
}

span.required {
	margin-left: 0;
	color: red;
}

label.check:before {
	content: "";
	position: absolute;
	top: 2px;
	left: 0;
	width: 16px;
	height: 16px;
	border-radius: 2px;
	border: 1px solid #095484;
}

input[type=checkbox]:checked+.check:before {
	background: #095484;
}

label.check:after {
	content: "";
	position: absolute;
	top: 6px;
	left: 4px;
	width: 8px;
	height: 4px;
	border: 3px solid #fff;
	border-top: none;
	border-right: none;
	transform: rotate(-45deg);
	opacity: 0;
}

input[type=checkbox]:checked+label:after {
	opacity: 1;
}

.btn-block {
	margin-top: 10px;
	text-align: center;
}

button {
	width: 150px;
	padding: 10px;
	border: none;
	border-radius: 5px;
	background: #095484;
	font-size: 16px;
	color: #fff;
	cursor: pointer;
}

button:hover {
	background: #098417;
}
</style>
</head>
<body>
	<div class="btn-block">
		<a href="/logout"><button type="button"
				style="float: right; font-size: small;">Log Out</button></a> <br> <br>
	</div>
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
	<div class="testbox">
		<form action="addDebtor" id="form" style="width: 50%; ">

			<div class="banner">
				<h1>CONFIRM AND REVIEW DETAILS</h1>
			</div>

			<h2>DEBTOR DETAILS</h2>
			<div class="item">
				<p>DEBTOR NAME</p>
				<input type="text" placeholder="<%=debtorname %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>Address Line1</p>
				<input type="text" placeholder="<%=addrline1 %>" readonly="readonly" />

			</div>

			<div class="item">
				<p>Address Line2</p>
				<input type="text" placeholder="<%=addrline2 %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>Fax Number</p>
				<input type="text" placeholder=" <%=faxno %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>Phone Number</p>
				<input type="text" placeholder="<%=phone %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>Email ID</p>
				<input type="text" placeholder="<%=email %>" readonly="readonly"/>

			</div>


			<h2>Bank Details</h2>
			<div class="item">
				<p>BANK NAME</p>
				<input type="text" placeholder="<%=bankname %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>BRANCH NAME</p>
				<input type="text" placeholder="<%=branchname %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>IFSC</p>
				<input type="text" placeholder="<%=ifsc %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>ACCOUNT NUMBER</p>
				<input type="text" placeholder=" <%=accno %>" readonly="readonly"/>

			</div>

			<div class="item">
				<p>ACCOUNT CURRENCY</p>
				<input type="text" placeholder="<%=currency %>" readonly="readonly"/>


			</div>
			<div class="btn-block">

				<button type="button" class="cancel" onclick="myFunc()" style="float: left;">CANCEL
				</button>


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

				<button class="confirm" type="submit" >CONFIRM</button>
				<button type="button" class="edit" onclick="history.back()" style="float: right;">Edit</button>
			</div>
		</form>
	</div>
</body>
</html>