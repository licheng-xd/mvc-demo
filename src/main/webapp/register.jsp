<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>注册页</title>
</head>
<body>
<h2>欢迎来到浙江交通职业技术学院</h2>
<form action="/register" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="passwd"><br>
    简介: <input type="text" name="desc"><br>
    <input type="submit" value="注册">
</form>
<a href="/">返回登录页</a>
</body>
</html>
