<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%
    String[] fruits = {"Apple", "Orange", "Mango", "Melon"};
    pageContext.setAttribute("fruits", fruits);

%>
<c:set var="words" value="AB#ABC,DEF" />
${fn:join(fruits, ",")}<br>

<c:forEach var="item" items="${fn:split(words, '#')}">
${item}<br>
</c:forEach>