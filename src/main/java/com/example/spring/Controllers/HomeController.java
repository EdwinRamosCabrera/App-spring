package com.example.spring.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("message", "Curso de Spring");
        return "home/welcome";
    } 
}
