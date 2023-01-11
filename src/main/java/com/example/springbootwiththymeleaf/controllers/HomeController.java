package com.example.springbootwiththymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home");

        String name = "Mehedi Hasan";
        int age = 19;
        model.addAttribute("name", name);
        model.addAttribute("Age", age);
        model.addAttribute("date", new Date());
        return "index";
    }

}
