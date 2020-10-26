package com.jetlion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("鎵цindex涓氬姟浠ｇ爜");
        return "index";
    }

}
