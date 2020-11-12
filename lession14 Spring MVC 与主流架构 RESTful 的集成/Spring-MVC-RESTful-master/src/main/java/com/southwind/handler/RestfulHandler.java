package com.southwind.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.entity.Student;

@Controller
public class RestfulHandler {
	
	private static Map<Integer,Student> students;
	
	static{
		students = new HashMap<Integer,Student>();
		students.put(1, new Student(1,"zhangsan",22));
	}
	
	@RequestMapping(value="/httpGet/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Student httpGet(@PathVariable(value="id")int id){
		return students.get(id);
	}
	
	@RequestMapping(value="/httpPost/{id}/{name}/{age}",method=RequestMethod.POST)
	@ResponseBody
	public Student httpPost(@PathVariable(value="id")int id,@PathVariable(value="name")String name,@PathVariable(value="age")int age){
		Student student = new Student(id,name,age);
		students.put(student.getId(), student);
		return student;
	}
	
	@RequestMapping(value="/httpDelete/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String httpDelete(@PathVariable(value="id")int id){
		students.remove(id);
		return "delete-ok";
	}
	
	@RequestMapping(value="/httpPut/{id}/{name}/{age}",method=RequestMethod.PUT)
	@ResponseBody
	public Student httpPut(@PathVariable(value="id")int id,@PathVariable(value="name")String name,@PathVariable(value="age")int age){
		Student student = new Student(id,name,age);
		students.put(student.getId(), student);
		return student;
	}
}
