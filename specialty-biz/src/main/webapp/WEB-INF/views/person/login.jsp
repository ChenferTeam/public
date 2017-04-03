<%--
  Created by IntelliJ IDEA.
  User: Chenfer
  Date: 2017/4/1
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="/assets/css/amazeui.css" />
    <link href="/css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/amazeui.min.js"></script>
</head>

<body>

<jsp:include page="common/header-logo.jsp"/>

<div class="login-banner">
    <div class="login-main">
        <jsp:include page="common/content-back.jsp"/>
        <div class="login-box">

            <h3 class="title">登录商城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form id="loginForm" action="/user/login" method="post">
                    <div class="user-name">
                        <label for="user"><i class="am-icon-user"></i></label>
                        <input type="text" name="userName" id="user" placeholder="邮箱/手机/用户名">
                    </div>
                    <div class="user-pass">
                        <label for="password"><i class="am-icon-lock"></i></label>
                        <input type="password" name="userPwd" id="password" placeholder="请输入密码">
                    </div>
                </form>
            </div>

            <div class="login-links">
                <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
                <a href="#" class="am-fr">忘记密码</a>
                <a href="/user/to_register" class="zcnext am-fr am-btn-default">注册</a>
                <br />
            </div>
            <div class="am-cf">
                <input type="submit" name="" value="登 录" onclick="loginFormCommit();" class="am-btn am-btn-primary am-btn-sm">
            </div>
            <div class="partner">
                <h3>合作账号</h3>
                <div class="am-btn-group">
                    <li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
                    <li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
                    <li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
                </div>
            </div>

        </div>
    </div>
</div>


<script type="text/javascript">
    function loginFormCommit() {
        $("#loginForm").submit();
    }
</script>
</body>

</html>
