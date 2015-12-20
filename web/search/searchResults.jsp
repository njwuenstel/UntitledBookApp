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

  <c:import url="/webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="/webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>

<jsp:useBean id="user"  class="entity.UserBean" scope="session" />
<c:set var="results" scope="request" value="${searchResults}" />/>

<div class="container">

  <h2>Search results for: ${search}</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>
  <table class="table">
    <thead>
    <tr>
      <th>Cover</th>
      <th>Title</th>
      <th>Author</th>
      <th>Info</th>
      <th>Add</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="work" items="${results}">
      <jsp:useBean id="work"  class="entity.WorkBean" scope="page" />
      <tr class='clickable-row' data-href='url://'>

<%--      jQuery(document).ready(function($) {
        $(".clickable-row").click(function() {
        window.document.location = $(this).data("href");
        });
      });--%>

      <tr>
        <td style="padding:15px 0px 15px 0px;">
          <a>
            <img src="${work.imageUrl}" class="img-responsive voc_list_preview_img" alt="" title="">
          </a>
      </td>
  <%--        <div class="col-xs-6 col-md-3">
            <a href="#" class="thumbnail"> <!-- class thumbnail , no 2 -->
              <img src="${work.imageUrl}" alt="work thumbnail">
            </a>
          </div>--%>
        </td>
        <td>${work.title}</td>
        <td>${work.author}</td>
        <td><button type="button" id="bookinfo" class="btn btn-link">Info</button></td>
        <td><button type="button" id="haveread" class="btn btn-link">Have Read</button></td>

      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

<%--$(function(){
  $('#bookinfo').on('click', function (e) {
  alert('Hello!');
  });
});--%>

</body>
</html>
