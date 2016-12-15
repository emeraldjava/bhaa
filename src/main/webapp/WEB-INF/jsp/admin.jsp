<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <jsp:include page="/WEB-INF/jsp/header.jsp" />
    </head>

    <body>

    <div class="container">
        <jsp:include page="/WEB-INF/jsp/menu.jsp" />
        <h2>Admin Page</h2>
        <div>File ${file}</div>
        <div><a href="${pageContext.request.contextPath}/admin/loadFile">Load File</a></div>
        <div><a href="${pageContext.request.contextPath}/admin/clearallfiles">Clear All Files</a></div>
    </div>
    <script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>