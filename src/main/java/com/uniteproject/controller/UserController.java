package com.uniteproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("/demo")
    public String testDemo(){

        System.out.println("帅帅的我又回来了！！");
        System.out.println("~");
        System.out.println("~");
        System.out.println("~");
        return "demo";
    }

}
