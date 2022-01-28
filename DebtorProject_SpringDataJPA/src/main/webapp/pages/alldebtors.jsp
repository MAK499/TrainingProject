<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./deboters.css">
<body>
 <sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/trproject" user="root" password="0000" />
 
<sql:query dataSource="${dbsource}" var="result">
select debtor_id,debtor_name,transaction_status,transaction_date,transaction_info from debtor_details natural join transaction_details ;</sql:query>

<form>

 <table class="styled-table">
                <h1>CREATED DEBTORS</h1>
                <thead>
                <tr>
                    <th>DEBTOR ID</th>
                    <th>DEBTOR NAME</th>
                    <th>TRANSACTION STATUS</th>
                    <th>DATE OF ADDITION/MODIFICATION</th>
                    <th>TRANSACTION INFO</th>
                    <th></th>
                   
                </tr>
                </thead>
                <tbody>
                <c:forEach var="row" items="${result.rows}">
                <tr class="active-row">
                        <td><c:out value="${row.debtor_id}"/></td>
                        <td><c:out value="${row.debtor_name}"/></td>
                        <td><c:out value="${row.transaction_status}"/></td>                       
                        <td><c:out value="${row.transaction_date}"/> </td>
                        <td><c:out value="${row.transaction_info }"></c:out>
                      
                       <!--  <td><a href="auth.jsp?debtor_id=${row.debtor_id}">View More</a></td> -->
                        
                         
                    </tr>
                </c:forEach>
                </tbody>
            </table>
</form>
<a href="debtordetailstable.jsp"><button class="btn-success" style="margin-left: 600px;">SEE PENDING DEBTORS</button></a>
<a href="Welcomeadmin.jsp"><button class="btn-danger" style="margin-left: 1185px;">BACK TO WORK SPACE</button></a>
</body>
</html>