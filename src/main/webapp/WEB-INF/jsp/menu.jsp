<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default navbar-static-top">
  <div class=btn-group">
    <ul class="nav nav-pills">
      <c:forEach items="${menu}" var="item">
        <li><a href="${item.link}" class="btn ${item.button} ${pageContext.request.servletPath == item.link ? 'active' : 'none'}" role="button">${item.display}</a></li>
      </c:forEach>
    </ul>
  </div>
</nav>