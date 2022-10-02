package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "advertisements")
@Getter
@Setter
@NoArgsConstructor
public class Advertisement {

    private String name;
    @Column(name = "publish_date")
    private Instant publishDate;
    @Column(name = "expire_date")
    private Instant expireDate;
    @Column(name = "salary_from")
    private long salaryFrom;
    @Column(name = "salary_to")
    private long salaryTo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "adv_skills",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "adv_id")
    )
    Set<Skill> skills;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "technology_id", referencedColumnName = "id")
    private Technology technology;

    @ManyToOne
    @JoinColumn(name = "seniority_id", referencedColumnName = "id")
    private Seniority seniority;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
}
