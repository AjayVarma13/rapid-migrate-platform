package com.ajayvarma.rapid_migrate.configset.controller;

import com.ajayvarma.rapid_migrate.configset.dto.ConfigSetResponse;
import com.ajayvarma.rapid_migrate.configset.dto.CreateConfigSetRequest;
import com.ajayvarma.rapid_migrate.configset.service.ConfigSetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/configsets")
@RequiredArgsConstructor
public class ConfigSetController {

    private final ConfigSetService configSetService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConfigSetResponse createConfigSet(
            @Valid @RequestBody CreateConfigSetRequest request) {

        return configSetService.createConfigSet(request);
    }

    @GetMapping
    public List<ConfigSetResponse> getAllConfigSets() {

        return configSetService.getAllConfigSets();
    }

    @GetMapping("/{id}")
    public ConfigSetResponse getConfigSetById(
            @PathVariable UUID id) {

        return configSetService.getConfigSetById(id);
    }
}