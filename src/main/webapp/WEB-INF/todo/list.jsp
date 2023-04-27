<%--
  Created by IntelliJ IDEA.
  User: sexytony
  Date: 2023/04/27
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl사용--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Page</h1>

<%--5. 컨트롤러에 보관된 데이터를 사용--%>
<%--${list}--%>


<ul>
    <c:forEach var="dto" items="${list}">
        <li>${dto}</li>
    </c:forEach>
</ul>

</body>
</html>
