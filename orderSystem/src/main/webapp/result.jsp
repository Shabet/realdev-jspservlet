<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>고객 등록 정보</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
%>
<h1>고객 등록 정보</h1>
이름: <%= name %><br>
주소: <%= address %><br>
이메일: <%= email %>
</body>
</html>
