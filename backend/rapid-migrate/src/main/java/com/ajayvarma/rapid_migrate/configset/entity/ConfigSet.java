package com.ajayvarma.rapid_migrate.configset.entity;

import com.ajayvarma.rapid_migrate.common.entity.BaseEntity;
import com.ajayvarma.rapid_migrate.configset.enums.ConfigSetStatus;
import com.ajayvarma.rapid_migrate.configset.enums.SourceSystem;
import com.ajayvarma.rapid_migrate.configset.enums.TargetSystem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "config_set")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfigSet extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String configSetCode;

    @Column(nullable = false)
    private String configSetName;

    @Enumerated(EnumType.STRING)
    private SourceSystem sourceSystem;

    @Enumerated(EnumType.STRING)
    private TargetSystem targetSystem;

    private String migrationType;

    private String description;

    @Enumerated(EnumType.STRING)
    private ConfigSetStatus status;
}