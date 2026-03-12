package com.musfiul.idrrateaggregator.service.impl;

import com.musfiul.idrrateaggregator.client.FrankfurterClient;
import com.musfiul.idrrateaggregator.dto.CurrenciesResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CurrenciesFetcherTest {

    @Mock
    private FrankfurterClient client;

    @InjectMocks
    private CurrenciesFetcher fetcher;

    @Test
    void shouldReturnCorrectResourceType() {
        assertEquals("SUPPORTED_CURRENCIES", fetcher.getType().name());
    }

    @Test
    void shouldFetchCurrenciesFromClient() {
        CurrenciesResponse mockResponse = new CurrenciesResponse();

        when(client.getCurrencies()).thenReturn(mockResponse);

        CurrenciesResponse result = fetcher.fetchData();

        assertEquals(mockResponse, result);
        verify(client, times(1)).getCurrencies();
    }
}