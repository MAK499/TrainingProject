<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
body
{
    background-image: url("Images/background.jpg");
    color:white;
}


*{
box-sizing:border-box;

}

.square
{

color:white;
float:left;
background-color:red;
width:255px;
height:200px;
border-radius:30px;
padding:50px;
margin:80px;
text-align:center;
margin-left:450px;
font-size:25px;


}
</style>

</head>
<a href="/logout"><button type="button" name="button" style="float:right; background-color:red;">Log Out</button></a>
<body ><br><br>
<center><h1><u>WELCOME  CORPORATE USER  </u></h1></center>

<br><br><br><br>

<div class="box">
<div class="square"><a href="./createdebtorinvoice2.jsp" style="text-decoration: none;color: white;"><b>CREATE DEBTOR INVOICE</b></a></div>
<!-- <div class="square"><a href="./checkstatus.jsp" style="text-decoration: none;color: white;"><b>CHECK STATUS</b></a></div> -->
<div class="square"><a href="./createddebtors.jsp" style="text-decoration: none;color: white;"><b>SEE CREATED DEBTORS</b></a></div>
</div>

</body>
</html>
