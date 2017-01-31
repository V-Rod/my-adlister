<%--
  Created by IntelliJ IDEA.
  User: V-Rod
  Date: 1/30/17
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Guestbook</title>
    <style>
        body {
            background-color: salmon;
        }
    </style>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<h1>Welcome to the guestbook</h1>

<p><%= request.getAttribute("lastPost") %></p>

<form action="/guestbook" method="POST">
    <label for="comment">Leave a comment:</label>
    <textarea name="comment" id="comment" cols="30" rows="10">

        </textarea>
    <button type="submit">Comment!</button>
</form>

<%@ include file="partials/head.jsp" %>

</body>
</html>