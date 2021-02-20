package kg.blackhole.blackhole.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * @author Nurbek
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "ver")
    private Integer ver;

    @Column(name = "del_mark")
    private Integer delMark;

    @Column(name = "updt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
