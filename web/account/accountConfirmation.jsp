<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 12/14/2015
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Welcome to Bookington</title>

  <c:import url="/webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="/webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>

  Welcome to Bookington ${firstName}.
  Your account has been created successfully.
  <a href="bookington">Onward... To Bookington</a>


</body>
</html>
