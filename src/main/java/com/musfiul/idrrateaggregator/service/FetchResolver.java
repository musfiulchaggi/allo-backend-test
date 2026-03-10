package com.musfiul.idrrateaggregator.service;

import com.musfiul.idrrateaggregator.constant.ResourceType;

public interface FetchResolver {
    IDRDataFetcher resolve(ResourceType type);
}
