package com.musfiul.idrrateaggregator.runner;

import com.musfiul.idrrateaggregator.constant.ResourceType;
import com.musfiul.idrrateaggregator.service.FetchResolver;
import com.musfiul.idrrateaggregator.service.FinanceDataStoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FinanceStartupRunner implements ApplicationRunner {

    private final FetchResolver resolver;
    private final FinanceDataStoreService store;

    @Override
    public void run(ApplicationArguments args) {

        log.info("FinanceStartupRunner");
        for (ResourceType type : ResourceType.values()) {
            log.info("Fetching type : {}", type);
            Object data = resolver
                    .resolve(type)
                    .fetchData();
            log.info("Fetched data : {}", data);
            store.put(type, data);
        }
        log.info("FinanceStartupRunner end");
    }
}
