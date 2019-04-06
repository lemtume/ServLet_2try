<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.03.2019
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #error {
            color: red;
        }

        .task {
            color: gray;
            font-size: small;
        }
    </style>


</head>


<p id="error"> ${error} </p>

<form action="LoginServlet" method="POST">
    Name: <input type="text" name="name"/>
    </br>
    Password: <input type="password" name="password">
    <input type="submit">

</form>

<hr>
<div class="task">
    <P><font> <b>1. Самостоятельное задание теги JSP:</b></font></P>
    <p>1. <%= new java.util.Date ()%>
    </p>
    <p>2. Проверяем сегодня ли 31-12-2019? <u>Ответ: <% if (new java.util.Date () == new Date ( 2019, 12, 31 )) {%> С
        новым 2020 годом!!! <% } else { %> Новый год еще не наступил <% } %></u></p>

    <p><b>2. Самостоятельное задание теги JSTL </b></p>

    <p> 1) 2+2*2= <c:out value="${2+2*2}"/></p>
    <p> 2) Информация API нацбанка по курсу USD <c:import var="data" url="http://www.nbrb.by/API/ExRates/Rates/840?ParamMode=1"/>
        <br><c:out value="${data}"/></p>

    <p><b>3. Самостоятельное задание фильтры: </b></p>
    <p> http://localhost:8080/ServLet_2try_war_exploded/GroupServlet</p>
    <p> LogFilter записывает время и путь запроса в консоли IDEA</p>
    <p> кодировка UTF-8</p>

</div>
<hr>

</body>
</html>
