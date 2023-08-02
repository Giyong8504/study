<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.util.Map" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ tag dynamic-attributes="attrs" %>
<div style="color : ${attrs.color}">
    <c:forEach begin="1" end="${attrs.size}">-</c:forEach>
</div>

<%--
<%
    Map<String, String> attrs = (Map<String,String>)jspContext.getAttribute("attrs");
    String color = attrs.get("color");
    String size = attrs.get("size");
%>
color : ${attrs.color}, size : ${attrs.size}
color : <%=color%>, size : <%=size%><br>
--%>