package com.hillel.homework12.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> records;

    public PhoneBook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);

    }

    public void find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                record.printRecord();
                break;
            }
        }
    }

    public void findAll(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                System.out.println("Record: " + "name = '" + record.getName() + '\'' + ", phoneNumber = '"
                        + record.getPhoneNumber() +'\'');
            }
        }
    }

}






