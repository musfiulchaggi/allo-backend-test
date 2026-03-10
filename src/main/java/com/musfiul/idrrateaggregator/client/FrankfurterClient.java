package com.musfiul.idrrateaggregator.client;

interface FrankfurterClient {

    Object getLatestRates();
    Object getHistoricalRates();
    Object getCurrencies();
}
