package com.uniteproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {


    @RequestMapping("/demo")
    public String testDemo() {
        System.out.println("~");
        System.out.println("~");
        System.out.println("~");
        return "demo";
    }

}
