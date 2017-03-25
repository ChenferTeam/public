package com.java.controller;

import com.java.service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chenfer on 2017/3/25.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = {"/test"},method = RequestMethod.GET)
    public String test(){
        System.out.println(testService.test());
        return "index";
    }
    @RequestMapping(value = {"/home"},method = RequestMethod.GET)
    public String home(){
        System.out.println(testService.test());
        return "public/home";
    }
}
