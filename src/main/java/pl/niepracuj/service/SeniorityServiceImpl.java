package pl.niepracuj.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.niepracuj.model.dto.SeniorityDto;
import pl.niepracuj.model.mapper.SeniorityMapper;
import pl.niepracuj.repository.SenioritRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class SeniorityServiceImpl implements SeniorityService {
    private final SenioritRepository senioritRepository;
    private final SeniorityMapper seniorityMapper;

    @Override
    public List<SeniorityDto> getSeniorities() {
        return senioritRepository.findAll().stream()
                .map(seniorityMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public SeniorityDto createSeniority(SeniorityDto seniorityDto) {
        return seniorityMapper.toDto(senioritRepository.save(seniorityMapper.toNewEntity(seniorityDto)));
    }
}
