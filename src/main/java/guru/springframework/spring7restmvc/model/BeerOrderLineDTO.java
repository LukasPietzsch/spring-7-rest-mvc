package guru.springframework.spring7restmvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonDeserialize(builder = BeerOrderLineDTO.BeerOrderLineDTOBuilder.class)
@Builder
@Data
public class BeerOrderLineDTO {


    @JsonProperty("id")
    private UUID id;

    @JsonProperty("version")
    private Long version;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @JsonProperty("beerOrderId")
    private UUID beerOrderId;

    @JsonProperty("beerId")
    private UUID beerId;

    @JsonProperty("orderQuantity")
    private Integer orderQuantity;
    @JsonProperty("quantityAllocated")
    private Integer quantityAllocated;
}
