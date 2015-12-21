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

    <jsp:useBean id="user"  class="entity.UserBean" scope="session" />
    <c:set var="booksRead" scope="session" value="${user.haveReads}" />

  <div class="container">

      <h2>Bookington: ${user.userAlias} style</h2>
      <form role="form" action="booksearch" method="post">
          <div class="form-group">
              <label for="search">Search book by Title Author or ISBN:</label>
              <input type="text" class="form-control" id="search" name="search" required="required">
          </div>
          <button type="submit" class="btn btn-default">Go</button>
      </form>

    <h2>Books you have read:</h2>
      <table class="table">
          <thead>
          <tr>
              <th>Cover</th>
              <th>Title</th>
              <th>Author</th>
              <th>ISBN</th>
          </tr>
          </thead>
          <tbody>
          <c:forEach var="work" items="${booksRead}">
              <jsp:useBean id="work"  class="entity.WorkBean" scope="page" />

              <%-- image of book cover --%>
              <tr>
                  <td style="padding:15px 0px 15px 0px;">
                      <a>
                          <img src="${work.imageUrl}" class="img-responsive voc_list_preview_img" alt="" title="">
                      </a>
                  </td>

                  </td>
                  <td>${work.title}</td>
                  <td>${work.author}</td>
                  <td>${work.isbn}</td>
              </tr>
          </c:forEach>
          </tbody>
      </table>
  </div>

  </body>
</html>
