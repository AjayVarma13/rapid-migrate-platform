package com.ajayvarma.rapid_migrate.configset.dto;

import com.ajayvarma.rapid_migrate.configset.enums.SourceSystem;
import com.ajayvarma.rapid_migrate.configset.enums.TargetSystem;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateConfigSetRequest {

    @NotBlank
    private String configSetName;

    private SourceSystem sourceSystem;

    private TargetSystem targetSystem;

    private String migrationType;

    private String description;
}