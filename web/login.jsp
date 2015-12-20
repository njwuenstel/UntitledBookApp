<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 9/27/2015
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bookington Login</title>
  <c:import url="webresources/jsp/head.jsp" />
</head>

<body>
  <c:import url="webresources/jsp/banner.jsp" />
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
    <div>
      <li><a href="account/createAccount.jsp">Create a new account</a></li>
    </div>
  </div>
  </BODY>
</HTML>
