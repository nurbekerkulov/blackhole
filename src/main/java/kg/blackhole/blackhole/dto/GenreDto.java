package kg.blackhole.blackhole.dto;

import kg.blackhole.blackhole.entity.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Nurbek
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GenreDto {

    private UUID id;
    private String name;

    public GenreDto(Genre genre) {
        this.id = genre.getId();
        this.name = genre.getName();
    }
}
