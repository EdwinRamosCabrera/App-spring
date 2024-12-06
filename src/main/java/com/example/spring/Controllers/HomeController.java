package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private static final String HOME_INDEX = "home/welcome";

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("message", "Curso de Spring");
        return HOME_INDEX;
    } 
}
