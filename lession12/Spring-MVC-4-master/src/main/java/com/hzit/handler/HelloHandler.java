package com.hzit.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import com.hzit.entity.Address;
import com.hzit.entity.User;

@Controller
@SessionAttributes(value="user")
public class HelloHandler {
	
	@RequestMapping("/mapTest")
	public String mapTest(Map<String,Object> map){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		map.put("user", user);
		return "index";
	}
	
	@RequestMapping("/modelTest")
	public String modelTest(Model model){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/modelAndViewTest1")
	public ModelAndView modelAndViewTest1(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		modelAndView.addObject("user", user);
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest2")
	public ModelAndView modelAndViewTest2(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		modelAndView.addObject("user", user);
		View view = new InternalResourceView("/index.jsp");
		modelAndView.setView(view);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest3")
	public ModelAndView modelAndViewTest3(){
		ModelAndView modelAndView = new ModelAndView("index");
		User user = new User();
		user.setId(1);
		user.setName("张三");
		modelAndView.addObject("user", user);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest4")
	public ModelAndView modelAndViewTest4(){
		View view = new InternalResourceView("/index.jsp");
		ModelAndView modelAndView = new ModelAndView(view);
		User user = new User();
		user.setId(1);
		user.setName("张三");
		modelAndView.addObject("user", user);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest5")
	public ModelAndView modelAndViewTest5(){
		Map<String,Object> map = new HashMap<String,Object>();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		map.put("user", user);
		ModelAndView modelAndView = new ModelAndView("index", map);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest6")
	public ModelAndView modelAndViewTest6(){
		Map<String,Object> map = new HashMap<String,Object>();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		map.put("user", user);
		View view = new InternalResourceView("/index.jsp");
		ModelAndView modelAndView = new ModelAndView(view, map);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest7")
	public ModelAndView modelAndViewTest7(){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		ModelAndView modelAndView = new ModelAndView("index", "user", user);
	    return modelAndView;
	}
	
	@RequestMapping("/modelAndViewTest8")
	public ModelAndView modelAndViewTest8(){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		View view = new InternalResourceView("/index.jsp");
		ModelAndView modelAndView = new ModelAndView(view, "user", user);
	    return modelAndView;
	}
	
	@RequestMapping("requestTest")
	public String requestTest(HttpServletRequest request){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		request.setAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/modelAttributeTest")
	public String modelAttributeTest(){
		return "index";
	}
	
	@ModelAttribute
	public User getUser(){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		return user;
	}
	
	@ModelAttribute
	public void getUser2(Map<String,Object> map){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		map.put("user", user);
	}
	
	@ModelAttribute
	public void getUser3(Model model){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		model.addAttribute("user", user);
	}
}