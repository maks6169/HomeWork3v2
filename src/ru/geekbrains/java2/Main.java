package ru.geekbrains.java2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("one", "two", "three", "one", "one", "four", "five", "five", "six", "seven"));
        System.out.println(arr);
        HashMap<String, Integer> newArr = new HashMap<>();
        for (String s : arr) {
            newArr.merge(s, 1, Integer::sum);
        }
        System.out.println(newArr);
        TreeSet<String> arr1 = new TreeSet<>(arr);
        System.out.println(arr1);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pupkin", "1234");
        phoneBook.add("Sumkin", "2345");
        phoneBook.add("Beggins", "3456");
        phoneBook.add("Sumkin", "4567");
        phoneBook.add("Sumkin", "5678");
        System.out.println("Sumkin phone" + phoneBook.get("Sumkin"));
        System.out.println("Pupkin phone" + phoneBook.get("Pupkin"));
    }
}


