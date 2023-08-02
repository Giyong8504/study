<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="num1" value="10000.12" />
<fmt:formatNumber value="10000000" groupingUsed="false" /></br>
# <fmt:formatNumber value="${num1}" pattern="#,###.####" /></br>
0 <fmt:formatNumber value="${num1}" pattern="0,000.0000" />