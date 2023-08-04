<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:set var="num1" value="100" />
<c:set var="num2" value="200" />

<util:box>
    <h1>안녕하세요</h1>
    <h2>반갑습니다</h2>
    <h3>${num1+num2}</h3>
    <c:forEach var="i" begin="1" end="10">
    ${i}<br>
    </c:forEach>
</util:box>