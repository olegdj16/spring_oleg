package com.olegarts.controller;

import com.olegarts.model.Mentor;
import com.olegarts.service.MentorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    private final MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("mentor", new Mentor());
        List<String> batchList = Arrays.asList("JD1", "JD2", "EU1", "EU2", "B18", "B20");
        model.addAttribute("batchList", batchList);
        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String saveMentor(@ModelAttribute("mentor") Mentor mentor) {
        mentorService.saveMentor(mentor);  // Save mentor
        return "redirect:/mentor/list";    // Redirect to list page
    }

    @GetMapping("/list")
    public String listMentors(Model model) {
        model.addAttribute("mentors", mentorService.getAllMentors());
        return "mentor/mentor-list";  // Display mentors
    }
}
