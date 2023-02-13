 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>User Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://examples.javacodegeeks.com/wp-content/litespeed/localres/aHR0cHM6Ly9tYXhjZG4uYm9vdHN0cmFwY2RuLmNvbS8=bootstrap/4.0.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">

            <br>
            <br>
            <h3 id="form_header" class="text-warning" align="center">Login</h3>
            <br>
            <br>
            <div> </div>
             <!-- User input form to validate a user  -->
            
            <form id="user_form" action="saveUserModel" method="post">
               <center> <div class="form-group">
                    <label for="name">username:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter username" name="username">
                </div>
                <br>
                <br>
                <div class="form-group">
                    <label for="pwd">password:</label>
                    <input type="text" class="form-control" id="pwd" placeholder="Enter password" name="password">
                </div>
                <br>
                <br>
                <button id="confirm_user" type="submit" class="btn btn-primary">Submit</button></center>
            </form>
            <!-- <input type="button" value="Add Customer" -->
            <!-- onclick="window.location.href='showForm'; return false;"
            class="btn btn-primary" /> -->
            <br/><br/>
        </div>
    </body>
</html> 
