package com.java.controller;

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

    @RequestMapping(value = {"/test"},method = RequestMethod.GET)
    public String test(){

        return "index";
    }
    @RequestMapping(value = {"/home"},method = RequestMethod.GET)
    public String home(){

        return "public/home";
    }
}