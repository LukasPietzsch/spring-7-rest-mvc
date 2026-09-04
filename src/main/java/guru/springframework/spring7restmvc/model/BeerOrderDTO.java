package guru.springframework.spring7restmvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@JsonDeserialize(builder = BeerOrderDTO.BeerOrderDTOBuilder.class)
@Builder
@Data
public class BeerOrderDTO {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("version")
    private Long version;

    @JsonProperty("customerRef")
    private String customerRef;

    @JsonProperty("customer")
    private CustomerDTO customer;

    @JsonProperty("beerOrderLines")
    private Set<BeerOrderLineDTO> beerOrderLines;

    @JsonProperty("beerOrderShipment")
    private BeerOrderShipmentDTO beerOrderShipment;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
