<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib  prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date() %>" />

<h1>Asia/Seoul</h1>
<fmt:setTimeZone value="Asia/Seoul"/>
<fmt:formatDate value="${date}" type="both" />

<h1>America/New_York</h1>
<fmt:setTimeZone value="America/New_York" />
<fmt:formatDate value="${date}" type="both" />

<h1>Asia/Jakarta</h1>
<fmt:setTimeZone value="Asia/Jakarta" />
<fmt:formatDate value="${date}" type="both" />