<%--
  Created by IntelliJ IDEA.
  User: Chenfer
  Date: 2017/3/25
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
    <link href="/css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/amazeui.min.js"></script>

</head>

<body>

<jsp:include page="common/header-logo.jsp"/>

<div class="res-banner">
    <div class="res-main">
        <jsp:include page="common/content-back.jsp"/>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">

                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active"><a href="">邮箱注册</a></li>
                    <li><a href="">手机号注册</a></li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form id="form1" action="/user/register" method="post">

                            <div class="user-email">
                                <label for="email"><i class="am-icon-envelope-o"></i></label>
                                <input type="email" name="user_email" id="email" placeholder="请输入邮箱账号">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="user_pwd" id="password_e" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordRepeat_e" placeholder="确认密码">
                            </div>

                        </form>

                        <div class="login-links">
                            <label for="reader-me">
                                <input id="reader-me-e" type="checkbox"> 点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf">
                            <input type="submit" name="" onclick="commit('form1');" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>
                        <div class="am-cf">
                            <input type="submit" name=""  onclick="location.href='/user/to_login';" value="去登录" class="am-btn am-btn-sm am-fl">
                        </div>
                    </div>

                    <div class="am-tab-panel">
                        <form id="form2" action="/user/register" method="post">
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" name="user_phone" id="phone" placeholder="请输入手机号">
                            </div>
                            <div class="verification">
                                <label for="code"><i class="am-icon-code-fork"></i></label>
                                <input type="tel" name="" id="code" placeholder="请输入验证码">
                                <a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">
                                    <span id="dyMobileButton">获取</span></a>
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="user_pwd" id="password" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                            </div>
                        </form>
                        <div class="login-links">
                            <label for="reader-me">
                                <input id="reader-me" type="checkbox"> 点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf" style="margin-bottom: 5px;">
                            <input type="submit" name=""  onclick="commit('form2');" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>
                        <div class="am-cf" style="margin-top: 5px;">
                            <input type="submit" name=""  onclick="location.href='/user/to_login';" value="去登录" class="am-btn am-btn-sm am-fl">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
<script type="text/javascript">
    $(function() {
        $('#doc-my-tabs').tabs();

        var status = '${status}';
        if(status!="") {
            if (status)
                alert("注册成功");
            else
                alert("注册失败");
        }
    });
    function commit(type) {
        if(type=='form1')
            $('#form1').submit();
        else
            $('#form2').submit();
    }
</script>
</body>
</html>
