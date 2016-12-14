<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <title>BHAA Registration List</title>
    </head>

    <body>
    Menu:: <jsp:include page="/WEB-INF/jsp/menu.jsp" />

    <div>List Page</div>

    <h1><spring:message code="user.list" /></h1>
    <ul>
        <c:forEach items="${runners}" var="runner">
            <li>
                <c:out value="${runner.getId()}"/> <c:out value="${runner.getFirstName()}"/> <c:out value="${runner.getLastName()}"/>
            </li>
        </c:forEach>
    </ul>

    </body>
</html>