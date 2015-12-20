<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 12/12/2015
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bookington - Go Read a Book</title>

  <c:import url="webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>
  <pre>
    Does this work: ${bla}
    How about this: ${search}
  </pre>
</body>
</html>
