<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 10/4/2015
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Untitled Book App</title>
  </head>
  <body>
    Hola!
    <a href="helloworld">Click Here </a>

    <form action="helloworld" method="post">
      <input type="text" name="bla">
      <input type="submit" value="helloworld">
      <span class="error">${error}</span>
    </form>
    <form action="helloworld" method="post">
      <input type="text" name="book search">
      <input type="submit" value="book">
      <span class="error">${error}</span>
    </form>
  </body>
</html>
