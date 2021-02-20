package kg.blackhole.blackhole.controller;

import kg.blackhole.blackhole.entity.Genre;
import kg.blackhole.blackhole.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Nurbek
 */
@RestController
@RequestMapping("genre")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @PostMapping
    public Genre post(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

}
