<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 12/19/2015
  Time: 11:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Logout</title>

  <c:import url="webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>
<div class="container">
  <h1>You have been logged out successfully</h1>
  <p>Now go read a book...</p>

</body>
</html>
