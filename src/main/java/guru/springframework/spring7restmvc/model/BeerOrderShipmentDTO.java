package guru.springframework.spring7restmvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonDeserialize(builder = BeerOrderShipmentDTO.BeerOrderShipmentDTOBuilder.class)
@Builder
@Data
public class BeerOrderShipmentDTO {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("version")
    private Long version;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @JsonProperty("beerOrderId")
    private UUID beerOrderId;

    @JsonProperty("trackingNumber")
    private String trackingNumber;

}
