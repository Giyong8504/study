<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forTokens var="item" items="Apple_Orange#Melon?Banana_Pear" delims="_#?">
    ${item}<br>
</c:forTokens>