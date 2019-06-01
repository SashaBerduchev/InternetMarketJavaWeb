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
    <%@ include file="/WEB-INF/css/HTMLStyle.css" %>
</style>
<br>
<h3>Proselyte presents</h3>
<br/>
<div>
    <img src="Picture/IMG_20180629_103235.jpg"/>
    <img src="Picture/beautiful-cool-disney-princess-eyes-Favim.com-2071730.jpg"/>
</div>
<a href="<spring:url value="/WEB-INF/Pages/phones.jsp"/>" target="_blank">Phones list</a>
<a href="<spring:url value="/WEB-INF/Pages/computers.jsp"/>" target="_blank">Computers list</a>
<br/>

<button class="buttonPhone" >Phones</button>

<script src="JS/JSBttnPhone.js"></script>
</body>
</html>
