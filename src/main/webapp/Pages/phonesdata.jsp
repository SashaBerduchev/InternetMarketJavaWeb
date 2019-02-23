<%--
  Created by IntelliJ IDEA.
  User: sasha
  Date: 23.02.2019
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PhonesData</title>

    <style type="text\css">
        <%@ include file="/css/HTMLDataStyle.css" %>
    </style>
</head>
<body>
<h1>Phone Details</h1>

<table class="tg">
<tr>
    <th width="80">ID</th>
    <th width="120">Title</th>
    <th width="120">Author</th>
    <th width="120">Price</th>
</tr>
<tr>
    <td>${phones.id}</td>
    <td>${phones.bookTitle}</td>
    <td>${phones.bookAuthor}</td>
    <td>${phones.cost}</td>
</tr>
</table>
</body>
</html>
