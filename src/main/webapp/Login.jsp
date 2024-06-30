<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>

<div style="text-align: center; margin-top: 120px">
    <form action="http://localhost:8081/lp/login" method="post" id="loginForm">
        <h2 style="font-size: 20px; color:blue">登录系统</h2>
        <table style="margin: auto; font-family: 华文楷体">
            <tr>
                <td> username:</td>
                <td><input type="text" name="uname" id="uname"></td>
            </tr>
            <tr>
                <td> password:</td>
                <td><input type="password" name="upwd" id="upwd"></td>
            </tr>
        </table>
        <span id="msg" style="font-size: 12px;color: red"></span> <br>
        <button type="button" id="loginBtn">登录</button>
        <a href="http://localhost:8081/lp/Register.jsp">注册</a>
    </form>
    <br>
</div>
</body>
<%--引入jquery的js文件 --%>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $("#loginBtn").click(function () {
        var uname = $("#uname").val();
        var upwd = $("#upwd").val();
        //判断是否为空
        if (isempty(upwd) && isempty(uname)) {
            $("#msg").html("用户名和密码不可为空！");
            return;
        }
        if (isempty(uname)) {
            $("#msg").html("用户名不可为空！");
            return;
        }
        if (isempty(upwd)) {
            $("#msg").html("用户密码不可为空！");
            return;
        }

        //如果都不为空，则手动提交
        $("#loginForm").submit();

    });

    /**
     * 判断字符串是否为空：为空返回true，不为空返回false
     */
    function isempty(str) {
        if (str == null || str.trim() == "")
            return true;
        return false;
    }
</script>
</html>
