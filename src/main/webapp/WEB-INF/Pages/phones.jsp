<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sasha
  Date: 23.02.2019
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phones Page</title>
    <style type="text\css">
        <%@ include file="/WEB-INF/css/HTMLStyle.css" %>
    </style>
</head>
<body>
<a href="../../index.jsp"> Back to main meny</a>

<br/>
<br/>

<h1> Phones List</h1>

<c:if test="${!empty listPhones}">
    <table class="tg">
        <tr>
            <th width="80">id</th>
            <th width="120">Firm</th>
            <th width="120">Model</th>
            <th width="120">Quantity</th>
            <th width="60">Cost</th>
            <th width="60">Processor</th>
            <th width="60">RAM</th>
            <th width="60">Battery</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listPhones}" var="phones">
            <tr>
                <td>${phones.id}</td>
                <td><a href="/bookdata/${phones.id}" target="_blank">${book.bookTitle}</a></td>
                <td>${phones.Firm}</td>
                <td>${phones.Model}</td>
                <td>${phones.Quantity}</td>
                <td>${phones.Processor/100}</td>
                <td>${phones.RAM/100}</td>
                <td>${phones.Battery/100}</td>
                <td><a href="<c:url value='/edit/${phones.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${phones.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>
