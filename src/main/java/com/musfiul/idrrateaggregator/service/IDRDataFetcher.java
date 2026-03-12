package com.musfiul.idrrateaggregator.service;

import com.musfiul.idrrateaggregator.constant.ResourceType;

public interface IDRDataFetcher {
    ResourceType getType();

    Object fetchData();
}
