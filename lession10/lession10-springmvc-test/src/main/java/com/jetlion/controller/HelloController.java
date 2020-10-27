package com.jetlion.controller;

import com.jetlion.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/helloController")
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }


    @RequestMapping(value="paramsBind")
    public String paramsBind(@RequestParam("name") String name, @RequestParam("id") int id){
        System.out.println(name);
        int num = id+10;
        System.out.println(num);
        return "index";
    }

    @RequestMapping(value="rest/{name}")
    public String restTest(@PathVariable("name") String name){
        System.out.println(name);
        return "index";
    }

    @RequestMapping("/cookieTest")
    public String getCookie(@CookieValue(value="JSESSIONID") String sessionId){
        System.out.println(sessionId);
        return "index";
    }


    @PostMapping("/addUser")
    public String getPOJO(User user){
        System.out.println(user);
        return "index";
    }


    @RequestMapping("redirectTest")
    public String redirectTest(){
        return "redirect:/index.jsp";
    }

    @PostMapping
    public String postTest(){
        return "index";
    }

}
