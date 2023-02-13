<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categories</title>
<link rel="stylesheet" href=
"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js">
    </script>
    <script src=
"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js">
    </script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">CATEGORIES</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Category</div>
    </div>
    <div class="panel-body">
     <form:form action="saveAdlist" cssClass="form-horizontal"
      method="post" modelAttribute="adlist">
      <!-- need to associate this data with customer id -->
      <div class="form-group">
       <label for="id" class="col-md-3 control-label">
        ID</label>
       <div class="col-md-9">
        <form:input path="id" cssClass="form-control" />
       </div>
      </div>


      <div class="form-group">
       <label for="a_name" class="col-md-3 control-label">
        Name</label>
       <div class="col-md-9">
        <form:input path="a_name" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="phoneNo" class="col-md-3 control-label">Phone
        Number</label>
       <div class="col-md-9">
        <form:input path="phoneNo" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="flatNo" class="col-md-3 control-label">Flat No</label>
       <div class="col-md-9">
        <form:input path="flatNo" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="street" class="col-md-3 control-label">Street</label>
       <div class="col-md-9">
        <form:input path="street" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="city" class="col-md-3 control-label">city</label>
       <div class="col-md-9">
        <form:input path="city" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="state" class="col-md-3 control-label">State</label>
       <div class="col-md-9">
        <form:input path="state" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="country" class="col-md-3 control-label">Country</label>
       <div class="col-md-9">
        <form:input path="country" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="pincode" class="col-md-3 control-label">Pincode</label>
       <div class="col-md-9">
        <form:input path="pincode" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="category" class="col-md-3 control-label">Category</label>
       <br>
            <select name="Category" id="Category">
            <option value="Resturant" selected>Resturant</option>
            <option value="Dental Hospital">Dental Hospital</option>
            <option value="Medicals">Medicals</option>
            <option value="Online Reservation">Online Reservation</option>
            </select>
       <div class="col-md-9">
       </div>
      </div>

      <div class="form-group">
       <label for="sub category" class="col-md-3 control-label">Sub category</label>
       <br>
            <select name="Sub Category" id="Sub Category">
            <option value="SouthFood" selected>SouthFood</option>
            <option value="Dentists">Dentists</option>
            <option value="Chemists">Chemists</option>
            <option value="Bus">Bus</option>
            </select>
       <div class="col-md-9">
       </div>
      </div>
      <div class="form-group">
       <label for="open_time" class="col-md-3 control-label">Open_time</label>
       <div class="col-md-9">
        <form:input path="open_time" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="close_time" class="col-md-3 control-label">Close_time</label>
       <div class="col-md-9">
        <form:input path="close_time" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="ratings" class="col-md-3 control-label">Ratings</label>
       <div class="col-md-9">
        <form:input path="ratings" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>