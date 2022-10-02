package pl.niepracuj.model.dto;

import lombok.*;
import pl.niepracuj.model.enums.TechnologyEnum;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TechnologyDto {

    private long id;
    private TechnologyEnum name;
}
