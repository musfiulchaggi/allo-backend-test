package com.musfiul.idrrateaggregator.runner;

import com.musfiul.idrrateaggregator.constant.ResourceType;
import com.musfiul.idrrateaggregator.service.FetchResolver;
import com.musfiul.idrrateaggregator.service.FinanceDataStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FinanceStartupRunner implements ApplicationRunner {

    private final FetchResolver resolver;
    private final FinanceDataStoreService store;

    @Override
    public void run(ApplicationArguments args) {

        for (ResourceType type : ResourceType.values()) {

            Object data = resolver
                    .resolve(type)
                    .fetchData();
            store.put(type, data);
        }
    }
}
