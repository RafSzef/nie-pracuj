package pl.niepracuj.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.niepracuj.model.dto.AdvertisementCreateDto;
import pl.niepracuj.model.dto.AdvertisementDto;
import pl.niepracuj.model.mapper.AdvertisementMapper;
import pl.niepracuj.repository.AdvertisementRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class AdvertisementServiceImpl implements AdvertisementService {
    private final AdvertisementRepository advertisementRepository;
    private final AdvertisementMapper advertisementMapper;
    @Override
    public List<AdvertisementDto> getAllAdvertisements() {
        return advertisementRepository.findAll().stream().map(advertisementMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public AdvertisementCreateDto createAdvertisement(AdvertisementCreateDto advertisementCreateDto) {
        return null;
    }
}
