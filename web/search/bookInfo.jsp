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

  <jsp:useBean id="isbnBean"  class="entity.WorkBean" scope="request" />
  <c:set var="booksRead" scope="session" value="${user.haveReads}" />

  <title>Bookington - ${isbnBean.title} Details</title>

  <c:import url="../webresources/jsp/head.jsp" />

</head>

<body>

<c:import url="../webresources/jsp/banner.jsp" />

<div style="color: #FF0000;">${errorMessage}</div>

<div class="container">

  <div class="row">
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="${isbnBean.imageUrl}" alt="">
      </div>

      <div class = "caption">
        <h3>${isbnBean.title}</h3>
        <p>
        <form role="form" action="bookdisplay" method="post">
          <input type="hidden" value="${isbnBean.isbn}" id="isbnEntry" name="isbnEntry" required="required">
          <button type="submit" class="btn btn-default" name="isbnFormSubmit" value="addToHaveReads">Add to Have Reads</button>
        </form>

          <a href="/bookington.jsp" class="btn btn-primary" role="button">
            Back Home
          </a>
        </p>
      </div>

    </div>

    <div class="col-sm-8"> <%-- second column--%>

      <dl class="dl-horizontal">
        <dt>Title:</dt>
        <dd>${isbnBean.title}</dd>

        <dt>Author:</dt>
        <dd>${isbnBean.author}</dd>

        <dt>isbn:</dt>
        <dd>${isbn}</dd>

        <dt>Year First Published:</dt>
        <dd>${isbnBean.yearFirstPublished}</dd>

        <dt>Number of Pages:</dt>
        <dd>${isbnBean.numberOfPages}</dd>

        <dt>Description:</dt>
        <dd>${isbnBean.description}</dd>
      </dl>

    </div>
  </div>  <%--row--%>
</div>

</body>
</html>
