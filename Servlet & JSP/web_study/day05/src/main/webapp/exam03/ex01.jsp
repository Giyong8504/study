<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />

<fmt:formatDate value="${date}" type="date" /><br>
<fmt:formatDate value="${date}" type="time" /><br>
<fmt:formatDate value="${date}" type="both" /><br>

<h1>full</h1>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h1>long</h1>
<fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="long" />

<h1>short</h1>
<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short" />

<h1>pattern</h1>
<fmt:formatDate value="${date}" type="both" pattern="yyyy.MM.dd a hh:mm" />