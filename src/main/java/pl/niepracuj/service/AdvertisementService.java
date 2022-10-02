package pl.niepracuj.service;


import pl.niepracuj.model.dto.AdvertisementCreateDto;
import pl.niepracuj.model.dto.AdvertisementDto;

import java.util.List;

public interface AdvertisementService {
    List<AdvertisementDto> getAllAdvertisements();
    AdvertisementCreateDto createAdvertisement(AdvertisementCreateDto advertisementCreateDto);
}
