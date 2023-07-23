package com.hillel.homework13;

import java.util.Comparator;
import java.util.*;

public class FileNavigator {
    Map<String, List<FileData>> filesByPath;

    public FileNavigator() {
        filesByPath = new HashMap<>();
    }

    public void add(FileData file) {
        String filePath = file.getPath();
        if (filesByPath.containsKey(filePath)){
            List<FileData> filesAtPath = filesByPath.get(filePath);
            filesAtPath.add(file);
        } else {
            List <FileData> filesAtPath = new ArrayList<>();
            filesAtPath.add(file);
            filesByPath.put(filePath, filesAtPath);
        }
    }

    public List<FileData> find (String path) {
        return filesByPath.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize (long maxSize){
        List <FileData> filteredFiles = new ArrayList<>();

        for (List <FileData> fileAtPath:
                filesByPath.values()) {
            for (FileData file:
                 fileAtPath) {
                if (file.getSize() <= maxSize){
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove (String path) {
        filesByPath.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> filesAtPath:
                filesByPath.values()) {
            allFiles.addAll(filesAtPath);
        }
        allFiles.sort(Comparator.comparingLong(FileData::getSize));

        return allFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "filesByPath=" + filesByPath +
                '}';
    }
}
