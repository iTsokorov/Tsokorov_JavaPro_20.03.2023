package com.hillel.homework9;

import java.io.File;

public class FileLoggerConfiguration {

     private final File file;

     private final long maxSizeFile;

     private final String format;

     private final LoggingLevel level;


    public FileLoggerConfiguration(File file, long maxSizeFile, String format, LoggingLevel level) {
        this.file = file;
        this.maxSizeFile = maxSizeFile;
        this.format = format;
        this.level = level;
    }

    public File getFile() {
        return file;
    }

    public long getMaxSizeFile() {
        return maxSizeFile;
    }

    public String getFormat() {
        return format;
    }

    public LoggingLevel getLevel() {
        return level;
    }
}
