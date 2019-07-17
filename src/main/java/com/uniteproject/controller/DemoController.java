package com.uniteproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {


    @RequestMapping("/demo")
    public String testDemo(){
        System.out.println("又加了一句输出语句");
        return "demo";
    }

}
