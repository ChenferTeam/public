package com.java.controller.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chenfer on 2017/3/25.
 */
@Controller
@RequestMapping(value = "/user")
public class UserCheckController {

    @RequestMapping(value = {"/to_register"})
    public String toRegister(){
        return "person/register";
    }
}
