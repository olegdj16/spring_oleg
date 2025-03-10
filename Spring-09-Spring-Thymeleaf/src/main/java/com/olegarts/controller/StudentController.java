package com.olegarts.controller;

import com.olegarts.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/student") // Global prefix
public class StudentController {

    @GetMapping("/newStudent")
    public String register(Model model) {
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    @GetMapping("/welcome")
    public String info(Model model) {  // ✅ Ensure Model is passed here
        model.addAttribute("students", DataGenerator.createStudent()); // ✅ Add students to model
        return "student/welcome";
    }
}
