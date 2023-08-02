<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib  prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date() %>" />

<fmt:setLocale value="ko_kr" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<fmt:setLocale value="us_en" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<fmt:setLocale value="ja_jp" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
