package pl.niepracuj.model.dto;

import lombok.*;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementDto {

    private Long id;
    private Long salaryFrom;
    private Long salaryTo;
    private Instant publishDate;
    private Instant expireDate;
    private String name;
    private String description;
    Set<SkillDto> skills;
    private CompanyDto companyDto;
    private TechnologyDto technologyDto;
    private SeniorityDto seniorityDto;
    private CityDto cityDto;
}
