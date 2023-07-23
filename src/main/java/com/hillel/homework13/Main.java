package com.hillel.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("file1.txt", 1024, "/path/to/file1.txt");
        FileData file2 = new FileData("file2.txt", 2048, "/path/to/file2.txt");
        FileData file3 = new FileData("file3.txt", 4096, "/path/to/file1.txt");
        FileData file4 = new FileData("file4.txt", 1024, "/path/to/file4.txt");
        FileData file5 = new FileData("file5.txt", 4096, "/path/to/file5.txt");

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);

        List<FileData> fileData1 = fileNavigator.find("/path/to/file1.txt");
        System.out.println("Files at \"/path/to/file1.txt\".");
        for (FileData file :
                fileData1) {
            System.out.println(file);
        }

        long maxSize = 2048;
        List<FileData> filteredFiles = fileNavigator.filterBySize(maxSize);
        System.out.println("Files with size less than or equal to " + maxSize + " bytes:");
        for (FileData file :
                filteredFiles) {
            System.out.println(file);
        }

        fileNavigator.add(file4);
        fileNavigator.add(file5);

        String pathToRemove = "/path/to/file1.txt";
        fileNavigator.remove(pathToRemove);

        List<FileData> fileData2 = fileNavigator.find(pathToRemove);
        System.out.println("Files at " + pathToRemove + ":" + fileData2);

        System.out.println("All files after remove: " + fileNavigator);

        List<FileData> sortedFiles = fileNavigator.sortBySize();
        System.out.println("Sorted files by size:");
        for (FileData file:
             sortedFiles) {
            System.out.println(file);
        }

    }

}
