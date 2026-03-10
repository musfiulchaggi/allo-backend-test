package com.musfiul.idrrateaggregator.service.impl;

import com.musfiul.idrrateaggregator.constant.ResourceType;
import com.musfiul.idrrateaggregator.service.FinanceDataStoreService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class FinanceDataStoreServiceImpl implements FinanceDataStoreService {
    private final Map<ResourceType, Object> store = new ConcurrentHashMap<>();

    @Override
    public void put(ResourceType type, Object data) {
        store.put(type, data);
    }

    @Override
    public Object get(ResourceType type) {
        return store.get(type);
    }
}
