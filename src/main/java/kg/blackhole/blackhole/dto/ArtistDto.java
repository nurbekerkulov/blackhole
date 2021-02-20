package kg.blackhole.blackhole.dto;

import kg.blackhole.blackhole.entity.Artist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Nurbek
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto implements Serializable {

    private UUID id;
    private String name;
    private String instagram;
    private String photo;

    public ArtistDto(Artist artist) {
        this.id = artist.getId();
        this.name = artist.getName();
        this.instagram = artist.getInstagram();
        this.photo = artist.getPhoto();
    }

}
