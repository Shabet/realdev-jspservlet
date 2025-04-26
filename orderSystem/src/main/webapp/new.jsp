<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>새로운 페이지</title>
</head>
<body>
<h2>새로운 페이지</h2>
새로운 페이지로 이동했습니다.
<jsp:useBean id="time" class="java.util.Date" scope="page"/>
현재 시간: <%= time.toLocaleString() %>
</body>
</html>
