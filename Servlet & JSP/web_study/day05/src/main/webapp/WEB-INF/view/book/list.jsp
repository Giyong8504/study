<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<table border="1">
    <thead>
        <tr>
            <th>순번</th>
            <th>책제목</th>
            <th>저자</th>
            <th>출판사</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${books}" varStatus="status">
        <tr>
             <%-- <td>${status.index}</td> --%>
             <td>
                  ${status.count}
                 <div>
                   첫번째 : ${status.first}
                 </div>
                 <div>
                마지막 : ${status.last}
             </div>
             </td>
             <td>${item.title}</td>
             <td>${status.current.author}</td>
             <td>${item.publisher}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>