<%--
  Created by IntelliJ IDEA.
  User: lihoo
  Date: 2018/8/7
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="text-align: center">
    用户姓名： ${user.username}<br>
    用户QQ:   ${user.qq}<br>
    用户职业： ${user.job}<br>
    用户学校： ${user.school}<br>
    用户网站： ${user.url}<br>
</div>

