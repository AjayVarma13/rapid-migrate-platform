package com.ajayvarma.rapid_migrate.configset.dto;

import com.ajayvarma.rapid_migrate.configset.enums.ConfigSetStatus;
import com.ajayvarma.rapid_migrate.configset.enums.SourceSystem;
import com.ajayvarma.rapid_migrate.configset.enums.TargetSystem;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ConfigSetResponse {

    private UUID id;

    private String configSetCode;

    private String configSetName;

    private SourceSystem sourceSystem;

    private TargetSystem targetSystem;

    private String migrationType;

    private String description;

    private ConfigSetStatus status;
}
