<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="html" value="<h1>출력</h1>" />
${html}
<c:out value="${html}" />
<br>
<c:out value="${html}" escapeXml="false" />
<br>
<c:out value="${name}" default="이름 없음..." />