<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
//java.util.jar.Manifest manifest = new java.util.jar.Manifest();
//manifest.read(pageContext.getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF"));
//java.util.jar.Attributes attributes = manifest.getMainAttributes();
%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <jsp:include page="/WEB-INF/jsp/menu.jsp" />
                <div class="jumbotron">
                    <h2>Index Page</h2>
                    <p>
                    Message: ${message}

                    <c:url value="/xresources/text.txt" var="url"/>
                    <spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
                    Spring URL: ${springUrl} at ${time}
                    <br>
                    JSTL URL: ${url}
                    <br>
                    </p>
                    <%--<img src="<c:url value="/images/bhaa-logo.jpg" />" />--%>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>