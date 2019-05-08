<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="C" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/25 0025
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center" width="500px" style="text-align: center">
        <tr>
            <td>编号&nbsp;&nbsp;<a href="UserActions_userList?c=id+" style="text-decoration: none">↑</a>&nbsp;&nbsp;<a href="UserActions_userList?c=id-" style="text-decoration: none">↓</a></td>
            <td>姓名</td>
            <td>年龄</td>
            <td colspan="2" >操作&nbsp;&nbsp;<a href="addUser.jsp" style="text-decoration: none">+</a></td>
        </tr>
        <c:forEach items="${sessionScope.list}" var="u" begin="${sessionScope.begin}" end="${sessionScope.begin+4}">
            <tr>
                <td>
                        ${u.id}
                    <c:if test="${empty u.id}"><br></c:if>
                </td>
                <td>${u.name}</td>
                <td>${u.age}</td>
                <td><a href="UserActions_reUpdateUser?id=${u.id}" style="text-decoration: none">修改</a></td>
                <td><a href="UserActions_deleteUser?id=${u.id}" style="text-decoration: none">删除</a></td>
            </tr>
        </c:forEach>
        <tr><td colspan="5"><br></td></tr>
        <tr>
            <td colspan="5">
                <div>
                    <a href="UserActions_userList?page=${sessionScope.page-1}&c=${sessionScope.c}" style="text-decoration: none"><--上一页</a>&nbsp;&nbsp;
                    <c:forEach var="x" begin="1" end="${sessionScope.pagecount}" step="1">
                        <a href="UserActions_userList?page=${x}&c=${sessionScope.c}" style="text-decoration: none">${x}</a>&nbsp;&nbsp;
                    </c:forEach>
                    <a href="UserActions_userList?page=${sessionScope.page+1}&c=${sessionScope.c}" style="text-decoration: none">下一页--></a>
                </div>
            </td>
        </tr>

    </table>


















    <%--<table align="center" width="500px" style="text-align: center">--%>
        <%--<tr>--%>
            <%--<td>编号</td>--%>
            <%--<td>姓名</td>--%>
            <%--<td>年龄</td>--%>
            <%--<td colspan="2" >操作&nbsp;&nbsp;<a href="addUser.jsp" style="text-decoration: none">+</a></td>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${sessionScope.list}" var="u">--%>
            <%--<tr>--%>
                <%--<td>${u.id}</td>--%>
                <%--<td>${u.name}</td>--%>
                <%--<td>${u.age}</td>--%>
                <%--<td><a href="UserActions_reUpdateUser?id=${u.id}" style="text-decoration: none">修改</a></td>--%>
                <%--<td><a href="UserActions_deleteUser?id=${u.id}" style="text-decoration: none">删除</a></td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
</body>
</html>
