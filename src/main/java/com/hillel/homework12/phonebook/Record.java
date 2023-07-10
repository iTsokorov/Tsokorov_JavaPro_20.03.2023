package com.hillel.homework12.phonebook;

public class Record {
    String name;
    String phoneNumber;

    public void printRecord() {
        System.out.println("Record: " + "name = '" + name + '\'' + ", phoneNumber = '" + phoneNumber +'\'');
    }

    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
