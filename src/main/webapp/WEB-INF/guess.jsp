<%--
  Created by IntelliJ IDEA.
  User: cliffordgardner
  Date: 11/3/23
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="guess" method="post">
    <label>Select a number Between 1 and 3
        <select name="guess">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </label>
    <button type="submit">HI</button>
</form>
</body>
</html>
