package com.hillel.homework9;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load(new File("./logging-config.txt"));

        FileLogger fileLogger = new FileLogger(configuration);

            fileLogger.info("info message");
            fileLogger.debug("debug message");

//        for (int i = 0; i < 100; i++) {
//            fileLogger.info("info message" + i);
//            fileLogger.debug("debug message" + i);
//        }
        }
    }


