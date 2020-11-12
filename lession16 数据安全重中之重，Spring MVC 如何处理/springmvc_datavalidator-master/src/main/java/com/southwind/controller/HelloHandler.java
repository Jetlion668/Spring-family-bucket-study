package com.southwind.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.southwind.entity.Student;
import com.southwind.entity.User;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping(value = "/login")
    public String login(Model model){
        model.addAttribute(new Student());
        return "login";
    }

    @PostMapping(value="/login")
    public String login(@Validated Student student,BindingResult br) {
        if (br.hasErrors()) {
            return "login";
        }
        return "success";
    }
    
    @PostMapping(value="/register")
    public String register2(@Valid User user,BindingResult br) {
        if (br.hasErrors()){
            return "register";
        }
        return "success";
    }

}
