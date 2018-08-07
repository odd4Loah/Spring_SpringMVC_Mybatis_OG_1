<%--
  Created by IntelliJ IDEA.
  User: lihoo
  Date: 2018/8/6
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="text-align: center;">REAL SHIT != !!!!</h1>

<form action="addUser" style="text-align: center;">

    用户姓名：<input type="text" name="username" value=""><br>
    用户QQ：<input type="number" name="qq" value=""><br>
    用户职业：<input type="text" name="job" value=""><br>
    用户学校：<input type="text" name="school" value=""><br>
    用户网站：<input type="text" name="url" value="" placeholder="网址"><br>

    <input type="submit" value="增加用户">

</form>
