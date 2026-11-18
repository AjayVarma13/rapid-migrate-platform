package com.ajayvarma.rapid_migrate.configset.repository;

import com.ajayvarma.rapid_migrate.configset.entity.ConfigSet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ConfigSetRepository extends JpaRepository<ConfigSet, UUID> {

    Optional<ConfigSet> findByConfigSetCode(String configSetCode);

    boolean existsByConfigSetCode(String configSetCode);
}