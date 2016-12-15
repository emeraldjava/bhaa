<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <title>Hello BHAA App</title>
        <jsp:include page="/WEB-INF/jsp/header.jsp" />
    </head>

    <body>
    <div class="container">
    Menu:: <jsp:include page="/WEB-INF/jsp/menu.jsp" />

    <div>
        Message: ${message}

        <c:url value="/xresources/text.txt" var="url"/>
        <spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
        Spring URL: ${springUrl} at ${time}
        <br>
        JSTL URL: ${url}
        <br>

    </div>
    </div>
    <%--<img src="<c:url value="/images/bhaa-logo.jpg" />" />--%>

    <!-- http://javacodingsamples.blogspot.ie/2015/04/utilizing-webjars-in-spring-mvc_7.html -->
    <script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>