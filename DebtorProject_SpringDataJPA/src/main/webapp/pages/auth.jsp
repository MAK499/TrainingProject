<!DOCTYPE html>

<%@ page import ="java.io.*,java.util.*,java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autharization</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
        <script type="text/javascript">
    {
   function auth()
   {
	  alert("Debtor Approved!");
 }
   function reject()
   {
	    var a = prompt("Enter Reject Reason");
	    if(a=="")
	    	{
	    	alert("Please Enter a Valid Reject Reason");
	    	}
	    else
	    	{
	    	document.getElementById("rjreason").value = a;
		    alert("Debtor Rejected!");
	    	}
	    
   }
   
		
	}
   
    
    </script>
    <style>
    body
{
    background-image: url("Images/background.jpg");
    color:white;
}
        .main{
            position: relative;
            
            text-align: center;
        }
        .star{
            color: red;
           font-size: 17px; 
            top:-2px;
        }
        .a{
            position: relative;
            left: 100px;
            
        }
        .b{
            position: relative;
            left: 100px;
        }
        
        .form
        {
        background-color: white;
        color:black;
        margin: auto;
  width: 50%;
  border: 1px solid black;
  padding: 10px;
        }
    </style>
</head>
<body>
<sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/trproject" user="root" password="0000" />
 
 
 <%--DATA SOURCE FOR DEBTOR DETAILS TABLE --%>
 
 <sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/trproject" user="root" password="0000"/>
 <sql:query var="result" dataSource="${dbsource}">select * from debtor_details where debtor_id=?;
<sql:param value="${param.debtor_id}" />
 </sql:query>


 <h3 class="text-center text-uppercase  pb-2 pt-2"><u>DEBTOR <br>AUTHORIZATION & REJECTION</u></h3> <br>
 <section class="main">
 <div class="form">
<form action="authorize">
<input type="hidden" name="debtor_id" value="${param.debtor_id}">
     
      <c:forEach var="row" items="${result.rows}"> 
        <h3><u>DEBTOR DETAILS</u></h3><br>
         <span>DEBTOR NAME<sub class="star">*</sub><c:out value="${row.debtor_name}"></c:out><br><br></span>
        <span>DEBTOR ID<sub class="star">*</sub>: <c:out value="${row.debtor_id}"></c:out><br><br></span>
        <span>ADDRESS LINE1<sub class="star">*</sub>: <c:out value="${row.addrline1}"></c:out><br><br></span>
        <label>ADDRESS LINE2 :</label>  
        <c:out value="${row.addrline2}"></c:out><br><br> 
        <label>FAX NUMBER:</label>
		<c:out value="${row.fax_num}"></c:out><br><br>

		<label>PHONE NUMBER:</label>
		<c:out value="${row.phone_num}"></c:out><br><br>

		<label>EMAIL ID:</label>
		<c:out value="${row.email}"></c:out><br><br>
		
		<a href="Welcomeadmin.jsp"><button class="btn btn-dark" >CLOSE</button></a>
        <button class=" a btn btn-success" id="AuthBtn" onclick="auth()" name="action" value="authorize">AUTHORIZE</button>
        <button class=" b btn btn-danger" id="RejectBtn" onclick="reject()" name="action" value="reject">REJECT</button> <br> <br>
		
        <input type="hidden" id="rjreason" name="rjreason">
        </c:forEach>
       </form>  
       
        </div>
        

 </section>

</body>
</html>