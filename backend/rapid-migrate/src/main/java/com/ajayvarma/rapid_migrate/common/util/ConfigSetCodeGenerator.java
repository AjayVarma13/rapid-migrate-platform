package com.ajayvarma.rapid_migrate.common.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ConfigSetCodeGenerator {

    private ConfigSetCodeGenerator() {
    }

    public static String generate() {

        String datePart =
                LocalDate.now()
                         .format(DateTimeFormatter.BASIC_ISO_DATE);

        long sequence =
                System.currentTimeMillis() % 1000;

        return String.format(
                "CFG-%s-%03d",
                datePart,
                sequence);
    }
}