package com.hillel.homework9;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");

    private final FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }

    public void debug(String message) {
        if (configuration.getLevel() != LoggingLevel.DEBUG) {
            return;
        }
        log(LoggingLevel.DEBUG, message);
    }

    private void log(LoggingLevel loggingLevel, String message) {

        String nowDataTime = LocalDateTime.now().format(DATE_TIME_FORMATTER);
        try {

            File logFile = configuration.getFile();

            if (logFile.length() >= configuration.getMaxSizeFile()) {

                logFile.renameTo(new File(logFile.getCanonicalFile().getParentFile() + File.separator +
                        "log-" + nowDataTime + ".txt"));
                //throw new FileMaxSizeReachedException(logFile);
            }

            logFile.getCanonicalFile().getParentFile().mkdirs();

            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            try (Writer writer = new OutputStreamWriter(new FileOutputStream(logFile, true))) {

                String messageForLogFile = configuration.getFormat();
                messageForLogFile = messageForLogFile.replace("[TIME]", nowDataTime);
                messageForLogFile = messageForLogFile.replace("[LEVEL]", loggingLevel.name());
                messageForLogFile = messageForLogFile.replace("[THREAD]", Thread.currentThread().getName());
                messageForLogFile = messageForLogFile.replace("[MESSAGE]", message);

                writer.append(messageForLogFile + "\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
