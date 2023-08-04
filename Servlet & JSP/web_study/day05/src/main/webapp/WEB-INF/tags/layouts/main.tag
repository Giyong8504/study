<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<%@ attribute name="title" %>

<layout:common title="${title}">
    <jsp:attribute name="header">
        <h1>메인쪽에서 교체된 HEADER</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
        <h1>메인쪽에서 교체된 FOOTER</h1>
    </jsp:attribute>
    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</layout:common>
