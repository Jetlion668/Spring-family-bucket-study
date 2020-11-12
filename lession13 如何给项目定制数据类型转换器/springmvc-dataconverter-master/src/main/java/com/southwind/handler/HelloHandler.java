package com.southwind.handler;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.entity.Student;

@Controller
public class HelloHandler {

	@RequestMapping(value="/dateConverterTest")
	@ResponseBody
	public String dateConverterTest(Date date){
	    return date.toString();
	}
	
	@RequestMapping(value="/studentConverterTest")
	@ResponseBody
	public String studentConverterTest(Student student){
	    return student.toString();
	}
	
}