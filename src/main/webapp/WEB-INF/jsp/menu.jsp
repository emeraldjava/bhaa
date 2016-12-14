<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul id="menu">
  <c:forEach items="${menu}" var="item">
    <li><a href="${item.key}" class="${pageContext.request.servletPath == item.key ? 'active' : 'none'}">${item.value}</a></li>
  </c:forEach>
</ul>