package pl.pracuj.niepracuj.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "skills")
@Setter
@Getter
//@Builder
@ToString
@NoArgsConstructor
@EqualsAndHashCode
//@AllArgsConstructor
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @Column
//    private SkillLevels levelId;

    @ManyToMany(mappedBy = "skills")
    private Set<Advertisement> advertisements;

}
