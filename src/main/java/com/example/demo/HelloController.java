package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String say(@RequestParam("name") String name){
        return "hello"+name;
    }

    @GetMapping("/hello2/{name}")
    public String saypath(@PathVariable("name") String name){
        return "hello"+name;
    }

    @GetMapping("/hello5")
    public ModelAndView sayhello(@RequestParam("name") String name,ModelAndView mv){
        mv.setViewName("hello");
        mv.addObject("name", name);
        return mv;
    }
}
