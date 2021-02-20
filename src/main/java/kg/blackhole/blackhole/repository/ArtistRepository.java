package kg.blackhole.blackhole.repository;

import kg.blackhole.blackhole.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author Nurbek
 */
@Repository
public interface ArtistRepository extends JpaRepository<Artist, UUID> {

    List<Artist> findAll();

}
