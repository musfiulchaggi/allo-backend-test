package com.musfiul.idrrateaggregator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestRatesResponse extends BaseResponse<Map<String, BigDecimal>> {

    private String date;

    @JsonProperty("USD_BuySpread_IDR")
    private BigDecimal usdBuySpreadIdr;
}
