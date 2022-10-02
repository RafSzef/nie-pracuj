package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.model.dto.SeniorityDto;
import pl.niepracuj.service.SeniorityService;

import java.util.List;

@RestController
@RequestMapping("/seniority")
@RequiredArgsConstructor
public class SeniorityController {
    private final SeniorityService seniorityService;

    @GetMapping("/all")
    public List<SeniorityDto> getSeniority() {
        return seniorityService.getSeniorities();
    }

    @PostMapping("/create")
    public SeniorityDto createSeniority(@RequestBody SeniorityDto seniorityDto) {
        return seniorityService.createSeniority(seniorityDto);
    }
}
