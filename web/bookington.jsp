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
<img style="width:100%;" id="image" src="webresources/image/bookington_banner.jpg">
<div class="navbar navbar-inverse" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.html">Home</a></li>
        <li><a href="content.html">Divisions</a></li>
        <li><a href="#projects">Projects</a></li>
        <li><a href="#faqs">FAQs</a></li>
        <li><a href="#resources">Resources</a></li>
        <li><a href="#contact">Contact Us</a></li>
      </ul>
    </div><!--/.nav-collapse -->
  </div>
</div>

<%--${pageContext.request.userPrincipal.name}
<!-- or -->
${pageContext.request.remoteUser}--%>

<%--${sessionContext.response.user.toString()}--%>

<jsp:useBean
        id="user"
        class="entity.UserBean"
        scope="session" />

blabla ${sessionScope[user.firstName]}



First Name: <jsp:getProperty name="user" property="firstName" />


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
