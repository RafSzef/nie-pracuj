//package pl.pracuj.niepracuj.model.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table(name = "levels")
//@Setter
//@Getter
//@Builder
//@ToString
//@NoArgsConstructor
//@EqualsAndHashCode
//@AllArgsConstructor
//public class SkillLevels {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    private String name;
//    private int level;
//
//    @OneToMany(mappedBy = "levelId")
//    private Collection<Skills> skills;
//
//    public Collection<Skills> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(Collection<Skills> skills) {
//        this.skills = skills;
//    }
//}
