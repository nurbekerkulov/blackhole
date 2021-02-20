package kg.blackhole.blackhole.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.blackhole.blackhole.dto.GenreDto;
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
@Table(name = "genre")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genre extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @XmlTransient
    @JsonIgnore
    public GenreDto getAsDto() {
        return new GenreDto(this);
    }

}
