<%--
  Created by IntelliJ IDEA.
  User: Дима
  Date: 22.07.2025
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Author name</th>
        <th>Title</th>
        <th>Cost</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.author}</td>
            <td>${book.title}</td>
            <td>${book.cost}</td>
        </tr>
    </c:forEach>
    </tbody>
    <a href="/index.jsp" class="c">Create</a>
</table>
</body>
</html>
