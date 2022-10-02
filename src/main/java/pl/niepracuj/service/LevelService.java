package pl.niepracuj.service;

import org.springframework.stereotype.Service;
import pl.niepracuj.model.dto.LevelDto;

import java.util.List;

@Service
public interface LevelService {
    List<LevelDto> getLevels();

    LevelDto createLevel(LevelDto levelDto);
}
