<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/25 0025
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="UserActions_updateUser">
        <s:hidden name="u.id" value="%{user.id}"/>
        <s:textfield label="姓名" name="u.name" value="%{user.name}"/>
        <s:textfield label="年龄" name="u.age" value="%{user.age}"/>
        <s:submit value="提交"/>
    </s:form>
    <s:debug/>
</body>
</html>
