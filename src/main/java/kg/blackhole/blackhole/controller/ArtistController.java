package kg.blackhole.blackhole.controller;

import kg.blackhole.blackhole.entity.Artist;
import kg.blackhole.blackhole.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Nurbek
 */
@RestController
@RequestMapping("artist")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;


    @GetMapping
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    @PostMapping
    public Artist save(@RequestBody Artist artist) {
        return artistRepository.save(artist);
    }

}
