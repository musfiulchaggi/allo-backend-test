package com.musfiul.idrrateaggregator.client;

import com.musfiul.idrrateaggregator.dto.CurrenciesResponse;
import com.musfiul.idrrateaggregator.dto.HistoricalRatesResponse;
import com.musfiul.idrrateaggregator.dto.LatestRatesResponse;

interface FrankfurterClient {

    LatestRatesResponse getLatestRates();
    HistoricalRatesResponse getHistoricalRates();
    CurrenciesResponse getCurrencies();
}
