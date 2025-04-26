<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ tagliab prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    List<String> list = new ArrayList<>();
%>
<h1>고객 등록 정보</h1>
이름: <%= name %><br>
주소: <%= address %><br>
이메일: <%= email %><br>
<%@ include file="/footer.jsp"%>
<%--<jsp:include page="footer.jsp"/>--%>
</body>
</html>
