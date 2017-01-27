<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <jsp:include page="/WEB-INF/jsp/menu.jsp" />
            <div class="jumbotron">
                <h2>List Page</h2>
                <div>
                    <ul>
                        <c:forEach items="${registeredRunners}" var="runner">
                            <li>
                                <c:out value="${runner.getId()}"/> <c:out value="${runner.getRacenumber()}"/> <c:out value="${runner.getLastname()}"/>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>