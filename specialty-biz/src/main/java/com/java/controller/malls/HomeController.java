package com.java.controller.malls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by Chenfer on 2017/4/1.
 * 首页
 */
@Controller
public class HomeController {

    //首页
    @RequestMapping(value = {"/","/home","/index"})
    public String showHome(){
        return "public/home";
    }

}
