<%--
  Created by IntelliJ IDEA.
  User: Дима
  Date: 16.07.2025
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create book</title>
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
    <form action="/book/create" method="POST">
        <tr>
            <td><input type="text" name="author" placeholder="Author name"></td>
            <td><input type="text" name="title" placeholder="Title"></td>
            <td><input type="text" name="cost" placeholder="Cost"></td>
            <td><input type="submit" name="Create"></td>
            ${pageContext.request.contextPath}
        </tr>

    </form>
    </tbody>
</table>
</body>
</html>
