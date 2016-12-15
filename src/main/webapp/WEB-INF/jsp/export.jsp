<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <title>BHAA Registration List</title>
        <jsp:include page="/WEB-INF/jsp/header.jsp" />
    </head>

    <body>

    <div class="container">
    <jsp:include page="/WEB-INF/jsp/menu.jsp" />
    <h2>Export Page</h2>

    <ul>
        <c:forEach items="${runners}" var="runner">
            <li>
                <c:out value="${runner.getId()}"/> <c:out value="${runner.getFirstName()}"/> <c:out value="${runner.getLastName()}"/>
            </li>
        </c:forEach>
    </ul>
    </div>

    <script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>