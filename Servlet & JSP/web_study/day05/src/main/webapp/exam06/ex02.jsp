<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        String name = cookie.getName();
        String value = cookie.getValue();
        out.write("name:" + name + ", value:" + value + "<br>");
    }
%>