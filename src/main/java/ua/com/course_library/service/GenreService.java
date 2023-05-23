package ua.com.course_library.service;

import org.springframework.stereotype.Service;
import ua.com.course_library.entity.Genre;
import ua.com.course_library.repository.GenreRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenre(){
        /*List<Genre> genres = new ArrayList<>();
        genres = genreRepository.findAll();
        return genres;*/
        return genreRepository.findAll();
    }
    public Genre getGenreById(Long id){
        return genreRepository.getReferenceById(id);
    }
}
