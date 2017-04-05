package com.java.controller.person;

import com.java.model.user.UserCheck;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Chenfer on 2017/4/5.
 * 用户中心
 */
@Controller
@RequestMapping("/user/center")
public class UserCenterController {
    //跳转个人中心
    @RequestMapping(value = {"","/{userId}"})
    public String toUserCenter(HttpServletRequest request){
        UserCheck userCheck = (UserCheck) request.getSession().getAttribute("user");
        if(userCheck==null)
            return "person/login";
        else
            return "person/center-home";
    }
}
