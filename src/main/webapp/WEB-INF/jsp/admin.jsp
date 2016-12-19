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

        <c:url value="/j_spring_security_logout" var="logoutUrl" />

        <!-- csrt support -->
        <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden"
                   name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
        </form>

        <script>
            function formSubmit() {
                document.getElementById("logoutForm").submit();
            }
        </script>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>
                Welcome : ${pageContext.request.userPrincipal.name} | <a
                    href="javascript:formSubmit()"> Logout</a>
            </h2>
        </c:if>

        <form th:action="@{/logout}" method="post">
            <input type="submit" value="Sign Out"/>
        </form>

    </div>
    <script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>