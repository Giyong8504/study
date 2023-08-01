<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="100" />
<c:set var="num2" value="50" />

<%--
<c:if test="${num2 >= num1}" >
    num2가 num1보다 크거나 같다.
</c:if>
<c:if test="${num2 < num1}" >
    num2가 num1보다 작다.
</c:if>
--%>

${num2 >= num1 ? "num2 가 num1 보다 크거나 같다" : 'num2가 num1보다 작다'}