package com.musfiul.idrrateaggregator.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class FrankfurterClientImpl implements FrankfurterClient {
    private final WebClient webClient;

    public FrankfurterClientImpl(WebClient.Builder builder,
                                 @Value("${frankfurter.api.url}") String baseUrl) {

        this.webClient = builder
                .baseUrl(baseUrl)
                .build();
    }

    @Override
    public Object getLatestRates() {

        return webClient.get()
                .uri("/latest?base=IDR")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    @Override
    public Object getHistoricalRates() {

        return webClient.get()
                .uri("/2024-01-01..2024-01-05?from=IDR&to=USD")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    @Override
    public Object getCurrencies() {

        return webClient.get()
                .uri("/currencies")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }
}
