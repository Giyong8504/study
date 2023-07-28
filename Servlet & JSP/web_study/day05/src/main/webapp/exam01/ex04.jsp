<%@ page contentType="text/html; charset=UTF-8" %>

<%
    pageContext.setAttribute("num", 100);
    request.setAttribute("num",200);
    application.setAttribute("num",300);
%>
${num}<br>
page : ${pageScope.num}<br>
request : ${requestScope.num}<br>
application : ${applicationScope.num}<br>
