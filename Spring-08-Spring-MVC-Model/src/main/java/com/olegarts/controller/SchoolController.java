package com.olegarts.controller;

import com.olegarts.model.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class SchoolController {

    @RequestMapping("/schools")
    public String school(Model model) {
        List<School> schools = Arrays.asList(
                new School("Greenwood High", Arrays.asList("Math", "Science", "History"), 500, true, 88.5, LocalDate.of(2000, 5, 15)),
                new School("Springfield Academy", Arrays.asList("English", "Art", "Music"), 350, false, 76.3, LocalDate.of(1995, 9, 1)),
                new School("Oakridge International", Arrays.asList("Physics", "Chemistry", "Biology"), 600, true, 92.1, LocalDate.of(2010, 3, 10))
        );

        model.addAttribute("schools", schools);
        return "school/schools"; // ✅ Corrected return path
    }
}
