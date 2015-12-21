<%--
  Created by IntelliJ IDEA.
  User: Sun Prairie PC
  Date: 10/4/2015
  Time: 10:59 PM
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

  <a name="about"></a>
  <div class="intro-header">
    <div class="container">

      <div class="row">
        <div class="col-lg-12">
          <div class="intro-message">
            <h1>Welcome to Bookington</h1>
            <h3>Go read a book...</h3>
            <hr class="intro-divider">
            <ul class="list-inline intro-social-buttons">
              <li>
                <a href="bookington" class="btn btn-default btn-lg"> <span class="network-name">Login to Bookington</span></a>
              </li>
              <li>
                <a href="account/createAccount.jsp" class="btn btn-default btn-lg"> <span class="network-name">Create an account</span></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>

  </body>
</html>
