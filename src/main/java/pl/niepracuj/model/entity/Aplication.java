package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "aplications")
@Getter
@Setter
@NoArgsConstructor
public class Aplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String surname;

    private String email;

    private String description;

    private String patch;

    @ManyToOne
    @JoinColumn(name = "adv_id", referencedColumnName = "id")
    private Advertisement advertisement;
}
