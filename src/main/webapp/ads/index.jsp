<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cliffordgardner
  Date: 11/3/23
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All the ads</h1>
<c:forEach var="ad" items="${viewlist}">
    <div class="ad">
        <h2>${ad.getTitle()}</h2>
        <h2>${ad.getDescription()}</h2>
    </div>
</c:forEach>
</body>
</html>
