package ru.geekbrains.java2;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneNumberList = phoneBook.get(name);
        } else {
            phoneNumberList = new ArrayList<>();
        }
        phoneNumberList.add(phoneNumber);
        phoneBook.put(name, phoneNumberList);
    }

    public List<String> get(String name) {
        return phoneBook.get(name);
    }
}

