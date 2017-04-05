package com.java.controller.person;

import com.java.model.user.UserCheck;
import com.java.service.service.UserCheckService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Chenfer on 2017/3/25.
 */
@Controller
@RequestMapping(value = "/user")
public class UserCheckController {

    @Autowired
    private UserCheckService userCheckService;
    //跳转注册页面
    @RequestMapping(value = {"/to_register"})
    public String toRegister(){
        return "person/register";
    }

    //注册
    @RequestMapping(value = {"/register"},method = RequestMethod.POST)
    public String register(UserCheck userCheck, Model model, HttpServletRequest request, HttpServletResponse response){
        Integer row =  userCheckService.register(userCheck);
        if(row==null||row<1)
            model.addAttribute("status",false);
        else
            model.addAttribute("status",true);
        return "person/register";
    }
    //跳转登录页面
    @RequestMapping(value = {"/to_login"})
    public String toLogin(){
        return "person/login";
    }
    //登录
    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    public String login(String userName,String userPwd, Model model, HttpServletRequest request, HttpServletResponse response){

        UserCheck userCheck = userCheckService.login(userName,userPwd);//可通过账号 邮箱 电话 登录
        if(userCheck!=null){
            request.getSession().setAttribute("user",userCheck);//设置session user
            return "public/home";
        }else
            return "person/login";


    }
    //注销
    @RequestMapping(value = {"/exit"})
    public String exit(HttpServletRequest request, HttpServletResponse response){

       request.getSession().invalidate();//清空session

        return "person/login";
    }
}
