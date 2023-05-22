package ua.com.course_library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.course_library.entity.Genre;
import ua.com.course_library.service.GenreService;

import java.util.List;

@Controller
public class GenreController {
    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/genre")
    public String getPageGenre(Model model){
        List<Genre> genreList = genreService.getAllGenre();
        model.addAttribute("allGenre", genreList);
        return "genre";
    }
}
