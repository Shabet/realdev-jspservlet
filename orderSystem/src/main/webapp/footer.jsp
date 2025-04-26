<%@ page import="java.util.GregorianCalendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<p>
    <a href="/index.jsp">홈으로</a>
</p>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(GregorianCalendar.YEAR);
%>
<p>&copy; 저작권 <%= currentYear%> 우리 회사 &amp; Inc.</p>