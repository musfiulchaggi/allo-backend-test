package com.musfiul.idrrateaggregator.controller;

import com.musfiul.idrrateaggregator.constant.ResourceType;
import com.musfiul.idrrateaggregator.service.FinanceDataStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/finance/data")
@RequiredArgsConstructor
public class AggregatorController {
    private final FinanceDataStoreService storeService;

    @GetMapping("/{resourceType}")
    public ResponseEntity<Object> getDataByResourceType(@PathVariable String resourceType) {
        ResourceType type = ResourceType.from(resourceType);
        return ResponseEntity.ok(storeService.get(type));
    }
}
