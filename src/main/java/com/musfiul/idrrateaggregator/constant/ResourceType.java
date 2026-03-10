package com.musfiul.idrrateaggregator.constant;

import lombok.Getter;

@Getter
public enum ResourceType {

    LATEST_IDR_RATES,
    HISTORICAL_IDR_USD,
    SUPPORTED_CURRENCIES;

    public static ResourceType from(String value) {
        return ResourceType.valueOf(value.toUpperCase());
    }
}
