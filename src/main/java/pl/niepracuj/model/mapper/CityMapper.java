package pl.niepracuj.model.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.niepracuj.model.dto.CityDto;
import pl.niepracuj.model.entity.City;

@Component
@AllArgsConstructor
public class CityMapper {

    private final StateMapper stateMapper;

    public CityDto toDto (City city){
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .stateDto(stateMapper.toDto(city.getState()))
                .build();
    }
}
