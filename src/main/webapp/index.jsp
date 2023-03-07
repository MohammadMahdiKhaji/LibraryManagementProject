<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%--    <meta http-equiv="refresh" content="5">--%>
</head>
<body>
<h1 id="message"></h1>
<%--<h1><c:out value="${sessionScope.message}"></c:out></h1>--%>

<%=request.getSession().getId()%>
<button onclick="message()">Get Letters</button>
<script >

    var webSocket = new WebSocket("ws://localhost:80/messagendpoint")

    webSocket.onopen = function (message) {
        console.log("Open")
    };
    webSocket.onclose = function (message) {
        console.log("Close")
    };
    webSocket.onmessage = function (message) {
        console.log("Message");
        document.getElementById("message").innerHTML = message.data;
    };
    webSocket.onerror = function (message) {
        console.log("Error")
    };

</script>
</body>
</html>