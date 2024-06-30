<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>

<div style="text-align: center; margin-top: 120px">
    <form action="http://localhost:8081/lp/Register" method="post" id="loginForm">
        <h2 style="font-size: 20px; color:blue">注册信息</h2>
        <table style="margin: auto; font-family: 华文楷体">
            <tr>
                <td> username:</td>
                <td><input type="text" id="uname" required></td>
            </tr>
            <tr>
                <td> password:</td>
                <td><input type="password" id="upwd" required></td>
            </tr>
            <tr>
                <td> age:</td>
                <td><input type="number" id="uage" required></td>
            </tr>
            <tr>
                <td> job:</td>
                <td><input type="text" id="ujob" required></td>
            </tr>
            <tr>
                <td> tel:</td>
                <td><input type="text" id="utel" required></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><input type="email" id="uemail" required></td>
            </tr>
        </table>
        <button type="button" id="loginBtn"
                onclick="javascript:window.location.href='http://localhost:8081/lp/Login.jsp'">注册
        </button>
    </form>
    <br>
</div>
</body>

</html>
