<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Proselyte</title>
</head>
<body>
<b> Hellow World</b>
<b> Berduchev </b>
<style type="text\css">
    <%@ include file="/css/HTMLStyle.css" %>
</style>
<br>
<h3>Proselyte presents</h3>
<br/>
<a href="<c:url value="/Pages/phones.jsp"/>" target="_blank">Phones list</a>
<a href="<c:url value="/Pages/computers.jsp"/>" target="_blank">Computers list</a>
<br/>
</body>
</html>
