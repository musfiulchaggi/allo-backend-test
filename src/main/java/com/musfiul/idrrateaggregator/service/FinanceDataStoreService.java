package com.musfiul.idrrateaggregator.service;

import com.musfiul.idrrateaggregator.constant.ResourceType;

public interface FinanceDataStoreService {
    void put(ResourceType type, Object data);

    Object get(ResourceType type);
}
