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
        <%@ include file="/WEB-INF/css/HTMLDataStyle.css" %>
    </style>
</head>
<body>
<h1>Phone Details</h1>

<table class="tg">
<tr>
    <th width="80">ID</th>
    <th width="120">Firm</th>
    <th width="120">Model</th>
    <th width="120">Quantity</th>
    <th width="120">Processor</th>
    <th width="120">RAM</th>
    <th width="120">Battery</th>
    <th width="120">Battery</th>
</tr>
<tr>
    <td><c:out value="${phones.id}"/></td>
    <td><c:out value="${phones.Firm}"/></td>
    <td><c:out value="${phones.Model}"/></td>
    <td><c:out value="${phones.Quantity}"/></td>
    <td><c:out value="${phones.Processor}"/></td>
    <td><c:out value="${phones.RAM}"/></td>
    <td><c:out value="${phones.Battery}"/></td>
    <td><c:out value="${phones.Cost}"/></td>
</tr>
</table>
</body>
</html>
