package com.codegym.wdbsspringboot.controller;


import com.codegym.wdbsspringboot.service.taskservice.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private ITaskService taskService;

    @GetMapping()
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("list", taskService.findAll());
        return modelAndView;
    }
}
