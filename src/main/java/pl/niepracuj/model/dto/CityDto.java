package pl.niepracuj.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {
    private long id;
    private String name;
    private StateDto stateDto;
}
