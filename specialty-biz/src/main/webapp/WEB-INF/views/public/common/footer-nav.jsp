<%--
  Created by IntelliJ IDEA.
  User: Chenfer
  Date: 2017/4/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!--引导 -->
<div class="navCir">
    <li><a href="/home"><i class="am-icon-home "></i>首页</a></li>
    <li><a href="/home/sort.html"><i class="am-icon-list"></i>分类</a></li>
    <li><a href="/home/shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>
    <li class="active"><a href="/user/center/${user.user_id}"><i class="am-icon-user"></i>我的</a></li>
</div>