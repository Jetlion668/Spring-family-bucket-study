package com.jetlion.controller;

import com.jetlion.annotation.MyController;
import com.jetlion.annotation.MyRequestMapping;

@MyController
@MyRequestMapping(value = "/testController")
public class TestController {

    @MyRequestMapping(value = "/test")
    public String test(){
        System.out.println("执行test相关业务");
        return "index";
    }


}
