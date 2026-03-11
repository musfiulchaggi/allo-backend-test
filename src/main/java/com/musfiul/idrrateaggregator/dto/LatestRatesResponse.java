package com.musfiul.idrrateaggregator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class LatestRatesResponse extends BaseResponse<Map<String, BigDecimal>> {

    private String date;

    @JsonProperty("USD_BuySpread_IDR")
    @JsonSerialize(using = ToStringSerializer.class)
    private BigDecimal usdBuySpreadIdr;
}
