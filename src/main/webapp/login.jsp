<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<h2>欢迎来到浙江交通职业技术学院</h2>
<form action="/login" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="passwd"><br>
    <input type="submit" value="登录">
</form>

<a href="/reg">立即注册</a>

</body>
</html>
