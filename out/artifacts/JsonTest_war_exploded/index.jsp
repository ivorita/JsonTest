<%--
  Created by IntelliJ IDEA.
  User: ivorita
  Date: 2019/3/8
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
  <head>
    <%--<base> 标签为页面上的所有链接规定默认地址或默认目标。--%>
    <%--href—设定前缀的链接地址--%>
    <base href="<%=basePath%>">
    <title>Test Json</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">

    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <%--定义页面内容描述--%>
    <meta name="description" content="Json数据测试">


  </head>
  <body>
  <form action="getJson" method="get">
    <input type="submit" value="点击获取新闻数据">
  </form>
  </body>
</html>
