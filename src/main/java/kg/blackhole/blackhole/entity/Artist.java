package kg.blackhole.blackhole.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.blackhole.blackhole.dto.ArtistDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Nurbek
 */
@Entity
@Table(name = "artist")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artist extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "photo")
    private String photo;

    @XmlTransient
    @JsonIgnore
    public ArtistDto getAsDto() {
        return new ArtistDto(this);
    }

}
