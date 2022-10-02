package pl.niepracuj.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private Integer size;
    private String email;
}
