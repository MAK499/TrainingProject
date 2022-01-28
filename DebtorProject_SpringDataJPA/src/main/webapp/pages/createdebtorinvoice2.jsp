<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NEW DEBTOR INVOICE</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" 
    integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <style type="text/css">
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
      .item:hover p, .item:hover i, .question:hover p, .question label:hover, input:hover::placeholder, a {
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
      input[type=checkbox]  {
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
      input[type=checkbox]:checked + .check:before {
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
      input[type=checkbox]:checked + label:after {
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
      font-size: large;
      font-weight: bold;
      }
      button:hover {
      background: #098417;
      }
    </style>
</head>
<body>

<div class="btn-block">
        <a href="/logout"><button type="button" style="float: right; font-size: small;">Log Out</button></a> <br> <br>
    </div>
    <div class="testbox">
      <form action="Confirm&Review2.jsp" style="width: 50%; ">
        
        <div class="banner blue">
          <h1>NEW DEBTOR INVOICE</h1>
        </div>
        <h2>DEBTOR DETAILS</h2>
        <div class="item">
            <p>DEBTOR NAME<span style="color:red; font-size: 20px;">*</span></p>
            <input type="text" name="debtorname" required="required"/>
        </div>

        <div class="item">
            <p>Address Line1<span style="color:red; font-size: 20px;">*</span></p>
            <input type="text" name="debtoradd1" required="required"/>
        </div>

        <div class="item">
            <p>Address Line2</p>
            <input type="text" name="debtoradd2" />
        </div>

        <div class="item">
            <p>Fax Number</p>
            <input type="text" name="faxno" minlength="11" maxlength="11"/>
          </div>
        
        <div class="item">
          <p>Phone Number</p>
          <input type="text" name="phoneno"  minlength="10"  maxlength="10"/>
        </div>
        
        <div class="item">
          <p>Email ID</p>
          <input type="text" name="email"/>
        </div>
        
       
        <h2>Bank Details</h2>
        <div class="item">
          <p>BANK NAME<span style="color:red; font-size: 20px;">*</span></p>
          <input type="text" name="bankname" required="required"/>
        </div>

        <div class="item">
          <p>BRANCH NAME<span style="color:red; font-size: 20px;">*</span></p>
          <input type="text" name="branchname" required="required"/>
        </div>

        <div class="item">
            <p>IFSC<span style="color:red; font-size: 20px;">*</span></p>
            <input type="text" name="IFSC" maxlength="11" required="required"/>
        </div>

        <div class="item">
            <p>ACCOUNT NUMBER<span style="color:red; font-size: 20px;">*</span></p>
            <input type="text" name="accno" required="required" maxlength="15"/>
        </div>

        <div class="item">
            <p>ACCOUNT CURRENCY<span style="color:red; font-size: 20px;">*</span></p>
            <select name="currency" id="currency">
              <option value="INR">INR </option>
              <option value="USD">USD </option>
              <option value="EUR">EUR </option>
              <option value="GBP">GBP </option>
            </select>
        </div>
        <div class="btn-block">

         <a href="Welcome.jsp"><button type="button" style="float: left;">Cancel</button></a>


         <input type="hidden"  name="action" value="add_debtor"> 
          <button type="submit">Submit</button>
          <button type="reset" style="float: right;">Clear</button>
        </div>
      </form>
    </div>
 
</body>
</html>
