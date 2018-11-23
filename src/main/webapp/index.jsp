<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${users}" var="user">
    ${user.username}||${user.password}<br>
</c:forEach>
</body>
</html>
