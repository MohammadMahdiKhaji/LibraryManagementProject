<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>panel</title>
</head>
<body>
<div>
    <table>
        <thead>
        <tr>
            <td>book</td>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${bookList}" var="book">
                <tr>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                    <td>${book.rackNo}</td>
                    <td>${book.status}</td>
                    <td>${book.edition}</td>
                    <td>${book.dateOfPurchase}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<div>
<%--&lt;%&ndash;<c:if test="${sessionScope.role}" >&ndash;%&gt;--%>
<%--&lt;%&ndash;    <c:when test="Manager">&ndash;%&gt;--%>
<%--        <div>--%>
<%--            <form action="/message" method="get">--%>
<%--                <input type="text" name="message">--%>
<%--                <input type="submit">--%>
<%--            </form>--%>
<%--        </div>--%>
<%--&lt;%&ndash;    </c:when>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <c:otherwise>&ndash;%&gt;--%>
<%--        <div>--%>
<%--            <button onclick="message()">Get Messages</button>--%>
<%--            <input type="text" id="message">--%>
<%--        </div>--%>
<%--&lt;%&ndash;    </c:otherwise>&ndash;%&gt;--%>
<%--&lt;%&ndash;</c:if>&ndash;%&gt;--%>
</div>
</body>
<%--<script >--%>

<%--    var webSocket = new WebSocket("ws://localhost:80/messagendpoint")--%>

<%--    webSocket.onopen = function (message) {--%>
<%--        console.log("Open")--%>
<%--    };--%>
<%--    webSocket.onclose = function (message) {--%>
<%--        console.log("Close")--%>
<%--    };--%>
<%--    webSocket.onmessage = function (message) {--%>
<%--        console.log("Message");--%>
<%--        document.getElementById("message").innerHTML = message.data;--%>
<%--    };--%>
<%--    webSocket.onerror = function (message) {--%>
<%--        console.log("Error")--%>
<%--    };--%>

<%--</script>--%>
</html>
