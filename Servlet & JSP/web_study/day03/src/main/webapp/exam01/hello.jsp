<%@ page contentType="text/html; charset=UTF-8" %>
<h1>안녕하세요!<h1>
<h2>반갑습니다.<h2>
<%
    String name = request.getParameter("name");
    System.out.println(name);
    int result = add(num1,num2);
%>
<%=result%>

<%!
    int num1 = 30;
    int num2 = 40;
    int add(int num1, int num2){
        return num1 + num2;
    }
%>