package kg.blackhole.blackhole.dto;

import kg.blackhole.blackhole.entity.Track;
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
public class TrackDto {

    private UUID id;
    private String name;
    private String audio;
    private UUID artist;
    private UUID genre;

    public TrackDto(Track track) {
        this.id = track.getId();
        this.name = track.getName();
        this.audio = track.getAudio();
        this.artist = track.getArtist().getId();
        this.genre = track.getGenre().getId();
    }

}
