package kg.blackhole.blackhole.repository;

import kg.blackhole.blackhole.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Nurbek
 */
@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {

}
