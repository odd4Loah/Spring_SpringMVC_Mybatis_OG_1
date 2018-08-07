<%--
  Created by IntelliJ IDEA.
  User: lihoo
  Date: 2018/8/6
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" import="java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--<script type="text/javascript" src="js/jquery.min.js"></script>--%>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
    /*将post method 改变为delete*/
    $(function(){
        $(".delete").click(function(){
            var href=$(this).attr("href");
            $("#form_delete").attr("action",href).submit();
            return false;
        })
    })
</script>

<div style="width: 500px; margin: 0 auto; text-align: center;">
    <table align='center' border='1' cellspacing='0' style="text-align: center">
        <tr>
            <td>id</td>
            <td>username</td>
            <td>qq</td>
            <td>job</td>
            <td>school</td>
            <td>url</td>
            <td>*编辑*</td>
            <td>*删除*</td>
        </tr>
        <c:forEach items="${us}" var="c" varStatus="st">
            <tr style="text-align: center">
                <td>${c.id}</td>
                <td>${c.username}</td>
                <td>${c.qq}</td>
                <td>${c.job}</td>
                <td>${c.school}</td>
                <td>${c.url}</td>
                <td><a href="user/${c.id}">编辑</a></td>
                <td><a class="delete" href="user/${c.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center;">
        <a href="?start=0">首  页</a>
        <a href="?start=${page.start-page.count}">上一页</a>
        <a href="?start=${page.start+page.count}">下一页</a>
        <a href="?start=${page.last}">末  页</a>
    </div>

    <div style="text-align: center; margin-top: 40px">
        <form method="post" action="user">
            <input type="hidden" name="_method" value="PUT">

                用户名称：<input type="text" name="username" value="安度因"><br><br>
                用户QQ:  <input type="number" name="qq" value="741745"><br><br>
                用户职业：<input type="text" name="job" value="牧师（狗）"><br><br>
                用户学校：<input type="text" name="school" value="嗯，抱歉职业技术学院"><br><br>
                用户网址：<input type="text" name="url" value="谢谢你！！！！"><br><br>

                <input type="submit" value="增加用户">
        </form>
    </div>

</div>

    <form id="form_delete" action="" method="POST">
        <input type="hidden" name="_method" value="DELETE">
    </form>


