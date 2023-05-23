package ua.com.course_library.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.course_library.entity.Genre;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getPageHome(Model model){
        return "home";
    }
}