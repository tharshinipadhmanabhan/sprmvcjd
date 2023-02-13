<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <center><div class="wrapper">
        <div class="container">
          <div class="col-left">
            <div class="login-text">
              <h2>Welcome</h2>
            
            </div>
          </div>
          <div class="col-right">
            <div class="login-form">
              <h2>Admin</h2>
              <form action="log" method="">
                <p>
                  <label>Name<span>*</span></label>
                  <input type="text" placeholder="Name" required>
                </p>
                <p>
                  <label>MobileNumber<span>*</span></label>
                  <input type="MobileNumber" placeholder="MobileNumber" required>
                </p>
                <p>
                  <input type="submit" value="Login" />
                </p>
               
              </form>
            </div>
          </div>
        </div>
      </div></center>
</body>
</html>
