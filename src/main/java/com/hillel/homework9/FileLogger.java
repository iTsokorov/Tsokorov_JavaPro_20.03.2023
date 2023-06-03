package com.hillel.homework9;

import static java.rmi.server.LogStream.log;

public class FileLogger {
    private FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void debug (String message) {
        if (configuration.getCurrentLevel() == LoggingLevel.DEBUG || configuration.getCurrentLevel() == LoggingLevel.INFO) {
            log("[DEBUG] " + message);
        }
    }

    public void info(String message) {
        if (configuration.getCurrentLevel() == LoggingLevel.INFO) {
            log("[INFO] " + message);
        }
    }
}
