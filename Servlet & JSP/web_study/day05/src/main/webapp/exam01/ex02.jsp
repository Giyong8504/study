<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.Book" %>
<%
    Book book = new Book("책1", "제목1", "출판사1");
    pageContext.setAttribute("book",book);
%>
<%--
책 제목 : ${book.getTitle()}
--%>
책 제목 : ${book.title} <%-- ${book.getTitle()} --%>
책 저자 : ${book.author}<br>
출판사 : ${book.publisher}<br>
${10 ne 11}<br>
${10 != 11}<br>
