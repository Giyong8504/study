<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--
<a href="<%=request.getContextPath()%>/exam02/ex11.jsp">이동</a>
--%>

<a href="${pageContext.request.contextPath}/exam02/ex11.jsp">이동</a>
<br>
<a href="<c:url value="/exam02/ex11.jsp"/>">이동</a><br>

<c:url var="link1" value="/exam02/ex11.jsp" />
<a href="${link1}">이동</a>