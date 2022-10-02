package pl.pracuj.niepracuj.model.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "advertisements")
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    @Column
//    @ManyToOne
//    private Company companyId;
//    @ManyToOne
//    @Column
//    private Technology technologyId;
//    @ManyToOne
//    @Column
//    private Seniority seniorityId;
//    @Column
//    private Timestamp publishDate;
//    @Column
//    private Timestamp expireDate;
//    @Column
//    private long salaryFrom;
//    @Column
//    private long salaryTo;
//    @OneToMany
//    @Column
//    private Set<City> cities;
//    private int size;
    @ManyToMany
    @JoinTable(
            name = "adv_skills",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "adv_id")
    )
    private Set<Skills> skills;
}
