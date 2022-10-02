package pl.niepracuj.model.dto;

import lombok.*;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementCreateDto {
    private String name;
    private String description;
    private Instant expireDate;
    private Long salaryFrom;
    private Long salaryTo;
    private Long companyId;
    private Long technologyId;
    private Long seniorityId;
    private Long cityId;
    private Set<SkillCreateDto> skills;
}