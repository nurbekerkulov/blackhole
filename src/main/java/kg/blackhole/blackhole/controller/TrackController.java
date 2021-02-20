package kg.blackhole.blackhole.controller;

import kg.blackhole.blackhole.entity.Track;
import kg.blackhole.blackhole.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nurbek
 */
@RestController
@RequestMapping("track")
public class TrackController {

    @Autowired
    private TrackRepository trackRepository;

    public List<Track> findAll() {
        return trackRepository.findAll();
    }

}
