package com.example.springbootwiththymeleaf.controllers;

import com.example.springbootwiththymeleaf.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyController {

    @GetMapping("/basic")
    public String basicExample(Model model) {
        model.addAttribute("title", "Basic Example");

        String name = "Mehedi Hasan";
        int age = 19;
        model.addAttribute("name", name);
        model.addAttribute("Age", age);
        model.addAttribute("date", new Date());

        return "basic";
    }

    @GetMapping("/iteration")
    public String iterationExample(Model model) {
        model.addAttribute("title", "Iteration Example");

        List<String> colors = List.of("White", "Black", "Green", "Yellow", "Red", "Pink", "Brown");
        model.addAttribute("colors", colors);

        Student student1 = new Student("Mehedi Hasan", 19, "Rangpur");
        Student student2 = new Student("Fariya Richie", 18, "Rangpur");
        Student student3 = new Student("Zahid Hasan", 20, "Dhaka");
        List<Student> students = List.of(student1, student2, student3)
                .stream()
                .sorted((s1, s2)-> s1.getAge() - s2.getAge())
                .collect(Collectors.toList());
        model.addAttribute("students", students);

        return "iteration";
    }

}