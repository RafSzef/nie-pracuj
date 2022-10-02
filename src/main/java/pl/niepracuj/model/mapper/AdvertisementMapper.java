package pl.niepracuj.model.mapper;

import pl.niepracuj.model.dto.AdvertisementDto;
import pl.niepracuj.model.dto.SkillDto;
import pl.niepracuj.model.entity.Advertisement;
import pl.niepracuj.model.entity.Skill;

import java.util.Set;
import java.util.stream.Collectors;

public class AdvertisementMapper {

    private CompanyMapper companyMapper;
    private TechnologyMapper technologyMapper;
    private SeniorityMapper seniorityMapper;
    private CityMapper cityMapper;
    private SkillMapper skillMapper;

    public AdvertisementDto toDto(Advertisement advertisement) {
        return AdvertisementDto.builder()
                .id(advertisement.getId())
                .name(advertisement.getName())
                .expireDate(advertisement.getExpireDate())
                .salaryFrom(advertisement.getSalaryFrom())
                .salaryTo(advertisement.getSalaryTo())
                .description(advertisement.getDescription())
                .companyDto(companyMapper.toDto(advertisement.getCompany()))
                .technologyDto(technologyMapper.toDto(advertisement.getTechnology()))
                .seniorityDto(seniorityMapper.toDto(advertisement.getSeniority()))
                .cityDto(cityMapper.toDto(advertisement.getCity()))
                .skills(getSkills(advertisement.getSkills()))
                .build();
    }

    private Set<SkillDto> getSkills(Set<Skill> skills) {
        return skills.stream().map(skillMapper::toDto).collect(Collectors.toSet());
    }
}
