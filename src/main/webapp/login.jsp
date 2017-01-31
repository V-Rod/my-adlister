<%--
  Created by IntelliJ IDEA.
  User: V-Rod
  Date: 1/30/17
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test='${param.username.equalsIgnoreCase("admin") && param.password.equalsIgnoreCase("password")}'>
    <c:redirect url="profile.jsp"/>
    </c:if>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please login"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<form action="/login.jsp" method="post">
    <label>Username</label>
    <input type="text" name="username">
    <label>Password</label>
    <input type="password" name="password">
    <input type="submit" value="Login">
</form>

</body>
</html>
