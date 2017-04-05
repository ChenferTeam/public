<%--
  Created by IntelliJ IDEA.
  User: Chenfer
  Date: 2017/4/5
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-l">
        <div class="topMessage">
            <div class="menu-hd">
                <c:if test="${empty user}">
                    <a href="/user/to_login" target="_top" class="h">亲，请登录</a> |
                    <a href="/user/to_register" target="_top">免费注册</a>
                </c:if>
                <c:if test="${!empty user}">
                    <label>欢迎你！亲：
                        <a href="#">
                            <c:if test="${! empty user.user_name}">${user.user_name}</c:if>
                            <c:if test="${empty user.user_name}">ID:${user.user_id}</c:if>
                            <c:if test="${! empty user.user_email}">| ${user.user_email}</c:if>
                            <c:if test="${! empty user.user_phone}">| ${user.user_phone}</c:if>
                        </a>
                    </label> |
                    <a href="/user/exit">[ 注销 ]</a>
                </c:if>
            </div>
        </div>
    </ul>

</div>