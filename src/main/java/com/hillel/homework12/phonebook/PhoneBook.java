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

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                record.printRecord();
                return record;

            }
        }
        System.out.println("This name wasn't found");
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundedRecord = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundedRecord.add(record);
                System.out.println("Record: " + "name = '" + record.getName() + '\'' + ", phoneNumber = '"
                        + record.getPhoneNumber() + '\'');
            }
        }
        if (foundedRecord.isEmpty()) {
            System.out.println("This name wasn't found");
            return null;
        }
        return foundedRecord;
    }
}







