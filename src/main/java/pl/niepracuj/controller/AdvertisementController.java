package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.model.dto.AdvertisementCreateDto;
import pl.niepracuj.model.dto.AdvertisementDto;
import pl.niepracuj.service.AdvertisementService;

import java.util.List;

@RestController
@RequestMapping("/adv")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;


    @GetMapping("/all")
    public List<AdvertisementDto> getAllAdvertisements() {
        return advertisementService.getAllAdvertisements();
    }

//    @PostMapping("/create")
//    public AdvertisementCreateDto createAdvertisement(@RequestBody AdvertisementCreateDto advertisementCreateDto) {
//        return advertisementService.createAdvertisements(advertisementCreateDto);
//    }
}
