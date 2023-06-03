package com.hillel.homework9;

public class FileLoggerConfiguration {
    private String filePath;
    private LoggingLevel currentLevel;
    private byte maxSizeFile;
    private String logFormat;

    public FileLoggerConfiguration(String filePath, LoggingLevel currentLevel, byte maxSizeFile, String logFormat) {
        this.filePath = filePath;
        this.currentLevel = currentLevel;
        this.maxSizeFile = maxSizeFile;
        this.logFormat = logFormat;
    }

    public String getFilePath() {
        return filePath;
    }

    public LoggingLevel getCurrentLevel() {
        return currentLevel;
    }

    public byte getMaxSizeFile() {
        return maxSizeFile;
    }

    public String getLogFormat() {
        return logFormat;
    }
}
