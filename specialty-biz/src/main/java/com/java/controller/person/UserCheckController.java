package com.java.controller.person;

import com.java.model.UserCheck;
import com.java.service.service.UserCheckService;
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
}
