package com.ajayvarma.rapid_migrate.configset.service;

import com.ajayvarma.rapid_migrate.configset.dto.ConfigSetResponse;
import com.ajayvarma.rapid_migrate.configset.dto.CreateConfigSetRequest;

import java.util.List;
import java.util.UUID;

public interface ConfigSetService {

    ConfigSetResponse createConfigSet(CreateConfigSetRequest request);

    List<ConfigSetResponse> getAllConfigSets();

    ConfigSetResponse getConfigSetById(UUID id);
}