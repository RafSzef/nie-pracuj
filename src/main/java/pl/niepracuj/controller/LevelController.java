package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.model.dto.LevelDto;
import pl.niepracuj.model.dto.TechnologyDto;
import pl.niepracuj.service.LevelService;
import pl.niepracuj.service.TechnologyService;

import java.util.List;

@RestController
@RequestMapping("/level")
@RequiredArgsConstructor
public class LevelController {
    private final LevelService levelService;

    @GetMapping("/all")
    public List<LevelDto> getLevels() {
        return levelService.getLevels();
    }

    @PostMapping("/create")
    public LevelDto createLevel(@RequestBody LevelDto levelDto){
        return levelService.createLevel(levelDto);
    }
}
