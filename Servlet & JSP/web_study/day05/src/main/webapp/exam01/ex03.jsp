<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("num1",10);
    pageContext.setAttribute("num2",null);
%>
${num1 == 10 ? '10이다' : '10이 아니다'}<br>
${!empty num2}