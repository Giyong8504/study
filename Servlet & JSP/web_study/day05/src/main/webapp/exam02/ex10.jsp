<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>ex10.jsp - 상단</h1>

<c:import url="ex11.jsp" >
    <c:param name="key1" value="value1" />
    <c:param name="key2" value="value2" />
</c:import>

<c:import var="html" url="https://www.naver.com" />

<h1>ex10.jps - 하단</h1>
${html}
