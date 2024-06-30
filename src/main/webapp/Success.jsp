<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户登录成功</title>
</head>
<body>
登录成功！
<a href="http://localhost:8081/lp/Login.jsp">退出</a>
<form action="http://localhost:8081/lp/Register" method="post" id="loginForm">
    <h2 style="font-size: 20px; color:blue">用户信息</h2>

    <table border="1" >
        <tr>
            <td>username:</td>
            <td>age:</td>
            <td>job:</td>
            <td>tel:</td>
            <td>email:</td>
        </tr>
        <tr>
            <td><%=request.getAttribute("username")%></td>
            <td><%=request.getAttribute("age")%></td>
            <td><%=request.getAttribute("job")%></td>
            <td><%=request.getAttribute("tel")%></td>
            <td><%=request.getAttribute("email")%></td>
        </tr>
    </table>
    <br>
    <h2 style="font-size: 20px; color:blue">密码修改</h2>
    新密码:<input type="text" name="newpwd" required> <br>
    <button type="button" id="loginBtn"
            onclick="javascript:window.location.href='http://localhost:8081/lp/Login.jsp'">提交
    </button>
</form>
<br>


</body>
</html>
