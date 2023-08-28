<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:url var="action" value="/member/join" />
<spring:message var="agree" code="member.agree" />
<%--
<spring:message code="login.msg" arguments="사용자01,user01" />
--%>

<form:form method="POST" action="${action}" modelAttribute="joinForm">
    <dl>
        <dt>
            <spring:message code="member.type" />
        </dt>
        <dd>
            <form:select path="type">
                <option value="">- 선택하세요 -</option>
                <form:options items="${types}" itemLabel="label" itemValue="_value" />
            </form:select>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.userId" />
        </dt>
        <dd>
            <form:input path="userId" cssClass="on" cssStyle="border: 1px solid red;" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.userPw" />
        </dt>
        <dd>
            <form:password path="userPw" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.userPwRe" />
        </dt>
        <dd>
            <form:password path="userPwRe" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.userNm" />
        </dt>
        <dd>
            <form:input path="userNm" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.email" />
        </dt>
        <dd>
            <form:input path="email" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.mobile" />
        </dt>
        <dd>
            <form:input path="mobile" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.hobby" />
        </dt>
        <dd>
            <form:checkboxes path="hobby" items="${hobbies}" itemLabel="label" itemValue="_value" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="member.intro" />
        </dt>
        <dd>
            <form:textarea path="intro" rows="10" cols="40" />
        </dd>
    </dl>
    <div>
        <form:checkbox path="agree" value="true" label="${agree}" />
    </div>
    <button type="submit">
        <spring:message code="join" />
    </button>
</form:form>