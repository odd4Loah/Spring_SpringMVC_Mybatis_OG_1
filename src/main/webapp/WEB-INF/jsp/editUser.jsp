<%--
  Created by IntelliJ IDEA.
  User: lihoo
  Date: 2018/8/6
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width: 500px; margin:0 auto; text-align: center;">
    <div style="text-align: center; margin-top: 40px;">
        <form method="post" action="../user/${c.id}">
            分类名称：<input name="username" value="${c.username}" type="text"> <br><br>
            <input type="submit" value="修改分类">
        </form>
    </div>
</div>