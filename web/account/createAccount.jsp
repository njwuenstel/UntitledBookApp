<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 12/13/2015
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Create a new Bookington account</title>

  <c:import url="/webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="/webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>

<div class="container">
  <h1>Please enter your user information</h1>
  <div style="color: #FF0000;">${errorMessage}</div>
  <form role="form" action="/createaccount" method="post">
    <div class="form-group">
      <label for="userAlias">User Name:</label>
      <input type="text" class="form-control" id="userAlias" name="userAlias" required="required">
    </div>
    <div class="form-group">
      <label for="userPassword">Password:</label>
      <input type="password" class="form-control" id="userPassword" name="userPassword" required="required">
    </div>
    <p>Personal Information</p>
    <div class="form-group">
      <label for="firstName">First Name:</label>
      <input type="text" class="form-control" id="firstName" name="firstName" required="required">
    </div>
    <div class="form-group">
      <label for="lastName">Last Name:</label>
      <input type="text" class="form-control" id="lastName" name="lastName" required="required">
    </div>
    <div class="form-group">
      <label for="userEmail">Email:</label>
      <input type="email" class="form-control" id="userEmail" name="userEmail" required="required">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
</body>
</html>
