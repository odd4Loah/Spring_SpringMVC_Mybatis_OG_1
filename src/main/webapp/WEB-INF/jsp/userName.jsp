<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lihoo
  Date: 2018/8/6
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户名</title>
</head>
<body>
    <table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>username</td>
    </tr>
    <c:form items="${us_name}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.username}</td>
        </tr>
    </c:form>
</table>


</body>
</html>
