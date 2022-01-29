<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
          <link rel="stylesheet" href="corporatelogin.css">
    <title>LoginFrom</title>
    <!-- <link rel="stylesheet" href="./corporatelogin.css"> -->
</head>
<body >
    <div class="loginbox" >
    
        <img src="Images/user.png" alt="Image Coming Soon..." class="user" >
        <h1 id="h12">CORPORATE LOGIN</h1>
        
        <form action="LoginController" method="post"  >
              Email 
            <input type="text" name="email" placeholder="Enter Email" required><br>
            Password 
            <input type="password" name="password" placeholder="Enter Password" required>
            <input type="submit" value="LOG IN"><br> <br>
           <input type="hidden"  name="action" value="corporate_login">

           
        </form>

    </div>

</body>
</html>
