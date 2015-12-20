<%--
  Created by IntelliJ IDEA.
  User: paulawaite
  Date: 9/18/15
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bookington Admin</title>

  <c:import url="/webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="/webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>

  This is the admin page where fancy admin-only stuff happens.
  <ul>
    <li><a href="display.jsp">Take me to the Display Page</a></li>
    <li><a href="index.jsp">Take me Home</a></li>
  </ul>
</body>
</html>
