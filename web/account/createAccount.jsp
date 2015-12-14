<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 12/13/2015
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new Bookington account</title>
</head>
<body>
<div style="color: #FF0000;">${errorMessage}</div>
Please enter your user information.
  <form action="/createaccount" method="post">
    <table>
      <tr><td>First name: <input type="text" name="firstName">
      <tr><td>Last name: <input type="text" name="lastName">
      <tr><td>User Name: <input type="text" name="userAlias">
      <tr><td>Password: <input type="text" name="userPassword">
      <tr><td>Email: <input type="text" name="userEmail">
      <tr><td>Submit: <input type="submit" value="create account">
    </table>
  </form>
</body>
</html>
