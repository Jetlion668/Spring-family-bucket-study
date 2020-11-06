package com.jetlion.controller;

import com.jetlion.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping(value = "/dateConverterTest")
    @ResponseBody
    public String dateConverterTest(Date date) {
        return date.toString();
    }

    @RequestMapping(value = "/studentConverterTest")
    @ResponseBody
    public String studentConverterTest(Student student) {
        return student.toString();
    }

}