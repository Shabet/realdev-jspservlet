<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>고객 정보 입력</title>
</head>
<body>
<h1>고객 정보 입력</h1>
<fieldset>
    <form method="post" action="/result.jsp">
        <label for="name">이름: </label>
        <input type="text" name="name"/><br>
        <label for="address">주소: </label>
        <input type="text" name="address"/><br>
        <label for="email">이메일: </label>
        <input type="text" name="email"/><br>
        <input type="submit" value="저장"/>
    </form>
</fieldset>
</body>
</html>
