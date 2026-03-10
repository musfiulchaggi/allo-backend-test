package com.musfiul.idrrateaggregator.service.impl;

import com.musfiul.idrrateaggregator.client.FrankfurterClient;
import com.musfiul.idrrateaggregator.constant.ResourceType;
import com.musfiul.idrrateaggregator.dto.CurrenciesResponse;
import com.musfiul.idrrateaggregator.service.IDRDataFetcher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrenciesFetcher implements IDRDataFetcher {
    private static final String SUPPORTED_CURRENCIES = "supported_currencies";
    private final FrankfurterClient client;

    @Override
    public ResourceType getType() {
        return ResourceType.from(SUPPORTED_CURRENCIES);
    }

    @Override
    public CurrenciesResponse fetchData() {
        return client.getCurrencies();
    }
}
