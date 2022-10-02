package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.niepracuj.model.enums.SeniorityEnum;

import javax.persistence.*;

@Entity
@Table(name = "seniorities")
@Getter
@Setter
@NoArgsConstructor
public class Seniority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private SeniorityEnum name;
}
