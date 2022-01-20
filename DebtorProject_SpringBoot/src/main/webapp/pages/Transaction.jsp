<!DOCTYPE html>
<%@ page import ="java.io.*,java.util.*,java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript">
alert("Debtor Successfully Created");
</script>
<style>
input[type=submit]
{
  width: 300px;
  background-color:tomato;
  color:white;
  padding:7px;
  margin:8px;
 font-size:16px;
}
input[type=reset]
{
  width: 100px;
  background-color:red;
  color:white;
  padding:7px;
  margin:8px;
  font-size:16px;
}

.form
{
margin: auto;
  width: 99%;
  border: 2px solid black;
  padding: 10px;
  background-color: white;
  color:black;

}
body
{
    background-image: url("Images/background.jpg");
    color:white;
}
</style>
</head>
<body >


<%--DATA SOURCE FOR TRANSACTION  TABLE --%>

<sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/trproject" user="root" password="0000"/>
 
 <sql:query var="result" dataSource="${dbsource}">select * from transaction_details where debtor_id=(select max(debtor_id) from transaction_details);</sql:query>
<c:forEach var="row" items="${result.rows}">

<center><h1><u>TRANSACTION INFORMATION</u></h1></center>

<center><h2>CONTACT ADMIN FOR APPROVAL</h2></center>

<div class="form">
<form>
<label for="transaction Ref">Transaction Reference Number:</label>
	<c:out value="${row.transaction_no}"></c:out><br><br>

	<label for="transdate">Transaction Date and Time:</label>
		<c:out value="${row.transaction_date}"></c:out><br><br>

	<label for="transstatus">Transaction Status:</label>
		<c:out value="${row.transaction_status}"></c:out><br><br>

	<label for="transinfo">Transaction Info:</label>
		<c:out value="${row.transaction_info}"></c:out><br><br>
</c:forEach>
</form>
</div>
<center><a href="Welcome.jsp"><input type="submit" value="GO BACK TO WORKSPACE"></a>
<a href="index.jsp"><input type="reset" value="LOGOUT"></a></center>
</body>
</html>
