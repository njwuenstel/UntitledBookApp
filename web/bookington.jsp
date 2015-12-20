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

    ${pageContext.request.userPrincipal.name}
    ${pageContext.request.remoteUser}


    <jsp:useBean id="user"  class="entity.UserBean" scope="session" />

    <c:set var="booksRead" scope="session" value="${user.haveReads}" />/>



    First Name: <jsp:getProperty name="user" property="firstName" />
    First Name: ${user.firstName}



      <div class="container">

          <form role="form" action="booksearch" method="post">
              <div class="form-group">
                  <label for="search">Search book by Title Author or ISBN:</label>
                  <input type="text" class="form-control" id="search" name="search" required="required">
              </div>
              <button type="submit" class="btn btn-default">Go</button>
          </form>

        <h2>Books you have read:</h2>
        <p>Bookington is on your side.</p>
        <table class="table">
          <thead>
          <tr>
            <th>Title</th>
            <th>Author</th>
          </tr>
          </thead>
          <tbody>
          <c:forEach var="book" items="${booksRead}">
            <tr>
              <td>${book.title}</td>
              <td>${book.author}</td>
            </tr>
          </c:forEach>
          </tbody>
        </table>
      </div>


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
