<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 9/27/2015
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Create a new Bookington account</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  </head>
  <BODY>
  <img style="width:100%;" id="image" src="webresources/image/bookington_banner.jpg">
  <div class="container">
    <h1>Login to Bookington</h1>
    <div style="color: #FF0000;">${errorMessage}</div>
    <form role="form" action="j_security_check" method="post">
      <div class="form-group">
        <label for="j_username">User Name:</label>
        <input type="text" class="form-control" id="j_username" name="j_username" required="required">
      </div>
      <div class="form-group">
        <label for="j_password">Password:</label>
        <input type="password" class="form-control" id="j_password" name="j_password" required="required">
      </div>
      <button type="submit" class="btn btn-default">Log in</button>
    </form>
    <li><a href="index.jsp">Take me Home</a></li>
  </div>
  </BODY>
</HTML>
