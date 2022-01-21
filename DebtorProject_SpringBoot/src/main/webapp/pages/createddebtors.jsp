<!DOCTYPE html>
<%@ page import ="java.io.*, java.util.*,java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="./deboters.css">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script type="text/javascript"></script>
</head>
<body>
  <a href="index.jsp"><button type="button" name="button" style="float:right; background-color:red;color:white;">Log Out</button></a>
  
  <sql:setDataSource var ="dbsource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/trproject" user="root" password="0000"/>
<sql:query var="result" dataSource="${dbsource }">SELECT debtor_id,debtor_name,transaction_status,transaction_date,transaction_info from debtor_details natural join transaction_details</sql:query>
  <h1>CREATED DEBTORS</h1>
  <table class="styled-table">
    <thead>
        <tr>
            <th>DEBTOR ID</th>
            <th>DEBTOR NAME</th>
            <th>TRANSACTION STATUS</th>
            <th>DATE OF ADDITION/MODIFICATION</th>
            <th>TRANSACTION INFO</th>

        </tr>
    </thead>
    <c:forEach var="row" items="${result.rows}">
    <tbody>
        <tr>
            <td>${row.debtor_id}</td>
            <td>${row.debtor_name}</td>
            <td>${row.transaction_status}</td>
            <td>${row.transaction_date}</td>
            <td>${row.transaction_info}</td>
            </tr>
    </tbody>
    </c:forEach>
</table><br>
<a href="Welcome.jsp"><button class="btn-success" style="margin-left: 1100px;">BACK TO WORK SPACE</button></a>
</body>
</html>
