package com.jetlion.controller;

import com.jetlion.dao.CourseDAO;
import com.jetlion.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jetlion
 */
@Controller
public class CourseController {

    @Autowired
    private CourseDAO courseDAO;

    /**
     * 开始的界面
     *
     * @return
     */
    @GetMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("courses", courseDAO.getAll());
        return modelAndView;
    }

    /**
     * 添加的界面
     *
     * @return
     */
    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    /**
     * 修改的界面
     *
     * @return
     */
    @GetMapping(value = "/update/{id}")
    public ModelAndView updatePage(@PathVariable(value = "id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("course", courseDAO.getById(id));
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public String add(Course course) {
        courseDAO.add(course);
        return "redirect:/index";
    }

    @PutMapping(value = "/update")
    public String update(Course course) {
        courseDAO.update(course);
        return "redirect:/index";
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable(value = "id") int id) {
        courseDAO.deleteById(id);
        return "success";
    }


}
