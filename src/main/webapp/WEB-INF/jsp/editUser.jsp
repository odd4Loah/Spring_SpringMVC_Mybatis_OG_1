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
        <form method="post" action="../user/${u.id}">
            用户姓名：<input type="text" name="username" value="${u.username}"> <br><br>
            用户QQ:  <input type="number" name="qq" value="${u.qq}"> <br><br>
            用户职业：<input type="text" name="job" value="${u.job}"> <br><br>
            用户学校：<input type="text" name="school" value="${u.school}"> <br><br>
            用户网址：<input type="text" name="url" value="${u.url}"> <br><br>

            <input type="submit" value="修改用户">
        </form>
    </div>
</div>