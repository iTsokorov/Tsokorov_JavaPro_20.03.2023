package com.hillel.homework12.phonebook;

public class Main {
    public static void main(String[] args) {
        Record record1 = new Record("Steve Jobs", "+38077717911");
        Record record2 = new Record("Angelina Joli", "+3802278991");
        Record record3 = new Record("Steve Jobs", "+38077717922");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(record1);
        phoneBook.add(record2);
        phoneBook.add(record3);
        phoneBook.find("Angelina Joli");
        phoneBook.findAll("Steve Jobs");
        phoneBook.find("Anastasia");
        phoneBook.findAll("Anastasia");
    }
}
