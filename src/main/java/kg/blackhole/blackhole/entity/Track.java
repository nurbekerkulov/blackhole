package kg.blackhole.blackhole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Nurbek
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "track")
public class Track extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "audio", nullable = false)
    private String audio;

    @JoinColumn(name = "artist", nullable = false, referencedColumnName = "id")
    @ManyToOne
    private Artist artist;

    @JoinColumn(name = "genre", nullable = false, referencedColumnName = "id")
    @ManyToOne
    private Genre genre;

}
