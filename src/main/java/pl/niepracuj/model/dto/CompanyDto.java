package pl.niepracuj.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDto {
    private long id;
    private String name;
    private String address;
    private Integer size;
    private String email;
}
