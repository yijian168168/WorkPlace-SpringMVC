<%--
  Created by IntelliJ IDEA.
  User: Lenovo-PC-QR
  Date: 2016/9/22
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>测试</title>
</head>
<body>
<h1>
    <center>SpringMVC-Base 测试页面，通过点击链接进行测试</center>
</h1>
<br>
<hr>
Get请求 : 基础功能测试
<br>
<a href="<%=basePath%>/baseController/method"><%=basePath%>/baseController/method</a>
<br>
<hr>
Get请求 : 使用get请求请求只允许get请求的页面
<br>
<a href="<%=basePath%>/baseController_Method/getMethod"><%=basePath%>/baseController_Method/getMethod</a>
<br>
<hr>
Get请求 : 使用get请求请求只允许post请求的页面
<br>
<a href="<%=basePath%>/baseController_Method/postMethod"><%=basePath%>/baseController_Method/postMethod</a>
<br>
<hr>
Post请求 : 使用post请求请求只允许post请求的页面
<form action="<%=basePath%>/baseController_Method/postMethod" method="post">
    <input type="submit" value="/baseController_Method/postMethod"></form>
</form>
<hr>
Post请求 : 使用post请求请求只允许get请求的页面

<form action="<%=basePath%>/baseController_Method/getMethod" method="post">
    <input type="submit" value="<%=basePath%>/baseController_Method/getMethod" />
</form>
<hr>
Delete请求 : 使用DELETE请求请求只允许DELETE请求的页面
<form action="<%=basePath%>/baseController_Method/deleteMethod" METHOD="post">
    <input type="submit" value="<%=basePath%>/baseController_Method/deleteMethod"/>
    <input type="hidden" name="_method" value="DELETE"/>
</form>


</body>
</html>
