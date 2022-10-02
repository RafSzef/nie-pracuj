package pl.niepracuj.service;

import org.springframework.stereotype.Service;
import pl.niepracuj.model.dto.SeniorityDto;

import java.util.List;

@Service
public interface SeniorityService {
    List<SeniorityDto> getSeniorities();

    SeniorityDto createSeniority(SeniorityDto seniorityDto);
}
