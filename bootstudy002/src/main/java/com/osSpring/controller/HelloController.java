package com.osSpring.controller;

import com.osSpring.dao.StudentDao;
import com.osSpring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private StudentDao studentDao;
    @GetMapping("/index")
    public ModelAndView index(){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",studentDao.findAll());
        return modelAndView;
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") int id){
        studentDao.deleteById(id);
        return "redirect:/hello/index";
    }
    @PostMapping("/save")
    public String save(Student student){
        studentDao.saveOrUpdate(student);
        return "redirect:/hello/index";
    }
    @PostMapping("/update")
    public String update(Student student){
        studentDao.saveOrUpdate(student);
        return "redirect:/hello/index";
    }
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") int id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student",studentDao.findById(id));
        return modelAndView;
    }
}
