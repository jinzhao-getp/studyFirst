<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/5
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学员信息</h1>
<table style="background-color: lightsteelblue">
    <tr>
        <th width="200">编号</th>
        <th width="200">姓名</th>
        <th width="200">年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>
                <a href="/hello/findById/${student.id}">修改</a>
                <a href="/hello/deleteById/${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/save.jsp">添加学员</a>
</body>
</html>
