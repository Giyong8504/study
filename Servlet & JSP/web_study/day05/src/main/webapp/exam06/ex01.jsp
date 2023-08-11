<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key1", "value1");
    response.addCookie(cookie);

    Cookie cookie2 = new Cookie("key2", "value2");
    cookie2.setPath(request.getContextPath());
    cookie2.setHttpOnly(true);
    response.addCookie(cookie2);


    Cookie cookie3 = new Cookie("key3", "value3");
    cookie3.setMaxAge(60 * 60 * 24 * 7);
    response.addCookie(cookie3);
%>