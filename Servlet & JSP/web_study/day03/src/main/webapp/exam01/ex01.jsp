<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.ArrayList, java.time.*" %>
<%@ page info="서블릿 정보 확인!!"%>
<%
    ArrayList<String> names = new ArrayList<>();
    String info = getServletInfo();

    out.write(info);
    System.out.println(this);
%>