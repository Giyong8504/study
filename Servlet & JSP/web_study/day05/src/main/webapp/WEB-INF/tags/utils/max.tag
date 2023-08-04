<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="num1" type="java.lang.Integer" required="true" %>
<%@ attribute name="num2" type="java.lang.Integer" required="true" %>
<%@ variable name-given="max" variable-class="java.lang.Integer" scope="AT_END" %>
<%
    int max = num1 > num2 ? num1 : num2;
%>
<c:set var="max" value="<%=max%>" />