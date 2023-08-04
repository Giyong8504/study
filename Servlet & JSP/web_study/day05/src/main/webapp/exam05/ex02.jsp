<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<util:max num1="100" num2="200" />
${max}
<br>
<util:min var="num" num1="100" num2="200" />
${num}
<br>

<util:forEach var="i" begin="1" end="10">
${i}<br>
</util:forEach>