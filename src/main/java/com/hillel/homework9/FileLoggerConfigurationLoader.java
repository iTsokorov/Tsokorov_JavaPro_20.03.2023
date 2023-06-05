package com.hillel.homework9;

import java.io.*;

public class FileLoggerConfigurationLoader {

    public static FileLoggerConfiguration load(File configFile) {

        String file = null;
        String format = null;
        long maxFileSize = 100000;
        LoggingLevel level = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(configFile)))) {

            int lineIndex = 0;
            String line = null;

            while ((line = reader.readLine()) != null) {

                String[] lineParts = line.split(":");
                String value = lineParts[1].trim();

                switch (lineParts[0]) {
                    case "FILE":
                        file = value;
                        break;
                    case "FORMAT":
                        format = value;
                        break;
                    case "MAX-SIZE":
                        maxFileSize = Long.parseLong(value);
                        break;
                    case "LEVEL":
                        level = LoggingLevel.valueOf(value);
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (file == null || format == null || level == null) {
            throw new IllegalArgumentException("Invalid config");

        }

        return new FileLoggerConfiguration(
                new File(file),
                maxFileSize,
                format,
                level
        );
    }
}
