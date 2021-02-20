package kg.blackhole.blackhole.controller;

import kg.blackhole.blackhole.entity.Artist;
import kg.blackhole.blackhole.entity.Track;
import kg.blackhole.blackhole.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Artist save() {
        Artist artist = new Artist();
        artist.setName("fullname");
        artist.setInstagram("insta");
        artist.setPhoto("photo");
        artistRepository.save(artist);
        return artist;
    }

}
