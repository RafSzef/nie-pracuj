package pl.niepracuj.model.mapper;

import org.springframework.stereotype.Component;
import pl.niepracuj.model.dto.CompanyDto;
import pl.niepracuj.model.entity.Company;

@Component
public class CompanyMapper {

    public CompanyDto toDto(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .address(company.getAddress())
                .size(company.getSize())
                .email(company.getEmail())
                .name(company.getName())
                .build();
    }

    public Company toEntity(CompanyDto companyDto) {
        return Company.builder()
                .id(companyDto.getId())
                .address(companyDto.getAddress())
                .email(companyDto.getEmail())
                .size(companyDto.getSize())
                .name(companyDto.getName())
                .build();
    }

    public Company toNewEntity(CompanyDto companyDto) {
        return Company.builder()
                .address(companyDto.getAddress())
                .email(companyDto.getEmail())
                .size(companyDto.getSize())
                .name(companyDto.getName())
                .build();
    }
}
