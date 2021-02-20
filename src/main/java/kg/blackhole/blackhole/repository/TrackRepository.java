package kg.blackhole.blackhole.repository;

import kg.blackhole.blackhole.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author Nurbek
 */
@Repository
public interface TrackRepository extends JpaRepository<Track, UUID> {
    List<Track> findAll();
    List<Track> findTracksByGenre(UUID genre);
    List<Track> findTracksByArtist(UUID artist);
}
