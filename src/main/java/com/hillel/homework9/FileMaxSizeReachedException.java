package com.hillel.homework9;

public class FileMaxSizeReachedException extends Exception {
    private long currentSize;
    private long maxSize;
    private String filePath;

    public FileMaxSizeReachedException(long currentSize, long maxSize, String filePath) {
        this.currentSize = currentSize;
        this.maxSize = maxSize;
        this.filePath = filePath;
    }
}
