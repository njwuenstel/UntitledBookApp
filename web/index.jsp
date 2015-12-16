<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 10/4/2015
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bookington - Go Read a Book</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
  <body>
    Hola!
    <a href="helloworld">Click Here </a>

    <form action="helloworld" method="post">
      <input type="text" name="bla">
      <input type="submit" value="click and see">
      <span class="error">${error}</span>
    </form>
    <form action="helloworld" method="post">
      <input type="text" name="search">
      <input type="submit" value="or click here">
      <span class="error">${error}</span>
    </form>
  </body>
</html>
