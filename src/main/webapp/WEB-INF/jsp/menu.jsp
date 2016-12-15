<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default navbar-static-top">
  <div class=btn-group">
    <ul class="nav nav-pills">
      <c:forEach items="${menu}" var="item">
        <li><a href="${item.key}" class="btn ${pageContext.request.servletPath == item.key ? 'active' : 'none'}">${item.value}</a></li>
      </c:forEach>
    </ul>
  </div>
</nav>