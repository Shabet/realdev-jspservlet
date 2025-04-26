<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>고객 등록 정보</title>
</head>
<body>
<jsp:useBean id="customer" class="com.mycompany.ordersystem.domain.Customer" scope="page"/>
<jsp:setProperty name="customer" property="name" value="김일"/>
<jsp:setProperty name="customer" property="address"/>
<jsp:setProperty name="customer" property="email"/>
<%
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
    List<String> list = new ArrayList<>();
%>
<h1>고객 등록 정보</h1>
이름: <%= customer.getName() %><br>
주소: <jsp:getProperty name="customer" property="address"/><br>
이메일: <%= customer.getEmail() %><br>
<%@ include file="/footer.jsp"%>
<%--<jsp:include page="footer.jsp"/>--%>
<jsp:forward page="new.jsp"/>
</body>
</html>
