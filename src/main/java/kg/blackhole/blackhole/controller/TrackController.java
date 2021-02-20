package kg.blackhole.blackhole.controller;

import kg.blackhole.blackhole.entity.Track;
import kg.blackhole.blackhole.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author Nurbek
 */
@RestController
@RequestMapping("track")
public class TrackController {

    @Autowired
    private TrackRepository trackRepository;

    @GetMapping
    public List<Track> findAll() {
        return trackRepository.findAll();
    }

    @PostMapping
    public Track post(@RequestBody Track track) {
        return trackRepository.save(track);
    }

    @GetMapping("/{genreId}")
    public List<Track> getByGenre(@PathVariable UUID genreId) {
        return trackRepository.findTracksByGenre(genreId);
    }

    @GetMapping("/{artistId}")
    public List<Track> getByArtist(@PathVariable UUID artistId) {
        return trackRepository.findTracksByArtist(artistId);
    }

}
