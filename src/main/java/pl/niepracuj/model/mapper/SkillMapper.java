package pl.niepracuj.model.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.niepracuj.model.dto.SkillDto;
import pl.niepracuj.model.entity.Skill;

@Component
@AllArgsConstructor
public class SkillMapper {
    private final LevelMapper levelMapper;

    public SkillDto toDto(Skill skill) {
        return SkillDto.builder()
                .id(skill.getId())
                .name(skill.getName())
                .level(levelMapper.toDto(skill.getLevel()))
                .build();
    }
}
