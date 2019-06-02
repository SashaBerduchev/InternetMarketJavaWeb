<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
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
                <td><a href="/phonesdata/${phones.id}" target="_blank">${phones.phonesTitle}</a></td>
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

<h1>Add a Phones</h1>

<c:url var="addAction" value="/phone/add"/>

<form:form method="get" action="${addAction}" commandName="phone">
    <table>
        <c:if test="${!empty phone}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="phoneName">
                    <spring:message text="Title"/>
                </form:label>
            </td>
            <td>
                <form:input path="phoneModel"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="phoneQuantity">
                    <spring:message text="Author"/>
                </form:label>
            </td>
            <td>
                <form:input path="bookAuthor"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="price">
                    <spring:message text="Price"/>
                </form:label>
            </td>
            <td>
                <form:input path="price"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty phones.phoneName}">
                    <input type="submit"
                           value="<spring:message text="Edit Phone"/>"/>
                </c:if>
                <c:if test="${empty phones.phoneName}">
                    <input type="submit"
                           value="<spring:message text="Add Phone"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
