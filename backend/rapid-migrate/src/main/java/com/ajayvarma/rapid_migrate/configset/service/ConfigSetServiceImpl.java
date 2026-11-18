package com.ajayvarma.rapid_migrate.configset.service;

import com.ajayvarma.rapid_migrate.exception.ResourceNotFoundException;
import com.ajayvarma.rapid_migrate.common.util.ConfigSetCodeGenerator;
import com.ajayvarma.rapid_migrate.configset.dto.ConfigSetResponse;
import com.ajayvarma.rapid_migrate.configset.dto.CreateConfigSetRequest;
import com.ajayvarma.rapid_migrate.configset.entity.ConfigSet;
import com.ajayvarma.rapid_migrate.configset.enums.ConfigSetStatus;
import com.ajayvarma.rapid_migrate.configset.repository.ConfigSetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConfigSetServiceImpl implements ConfigSetService {

    private final ConfigSetRepository repository;

    @Override
    public ConfigSetResponse createConfigSet(
            CreateConfigSetRequest request) {

        ConfigSet configSet =
                ConfigSet.builder()
                         .configSetCode(
                                 ConfigSetCodeGenerator.generate())
                         .configSetName(
                                 request.getConfigSetName())
                         .sourceSystem(
                                 request.getSourceSystem())
                         .targetSystem(
                                 request.getTargetSystem())
                         .migrationType(
                                 request.getMigrationType())
                         .description(
                                 request.getDescription())
                         .status(
                                 ConfigSetStatus.DRAFT)
                         .build();

        ConfigSet saved =
                repository.save(configSet);

        return map(saved);
    }

    @Override
    public List<ConfigSetResponse> getAllConfigSets() {
        return repository.findAll()
                         .stream()
                         .map(this::map)
                         .toList();
    }

    @Override
public ConfigSetResponse getConfigSetById(UUID id) {

    ConfigSet configSet =
            repository.findById(id)
                    .orElseThrow(() ->
                            new ResourceNotFoundException(
                                    "ConfigSet not found with id: " + id));

    return map(configSet);
}


    private ConfigSetResponse map(
            ConfigSet configSet) {

        return ConfigSetResponse.builder()
                .id(configSet.getId())
                .configSetCode(configSet.getConfigSetCode())
                .configSetName(configSet.getConfigSetName())
                .sourceSystem(configSet.getSourceSystem())
                .targetSystem(configSet.getTargetSystem())
                .migrationType(configSet.getMigrationType())
                .description(configSet.getDescription())
                .status(configSet.getStatus())
                .build();
    }
}