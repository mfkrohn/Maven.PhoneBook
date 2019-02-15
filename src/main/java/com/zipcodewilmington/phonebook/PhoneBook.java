package com.zipcodewilmington.phonebook;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {


    public TreeMap<String ,String > phoneBook = new TreeMap<String, String>();

    public PhoneBook() {

    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public String lookup(String name) {
       return phoneBook.get(name);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }


    public String reverseLookup(String phoneNumber) {
        Set names = phoneBook.keySet();
        Object[] namesArr = names.toArray();
        String[] namesStringArr = Arrays.copyOf(namesArr, namesArr.length, String[].class);
        for(String currentName : namesStringArr){
            if(lookup(currentName) == phoneNumber){
                return currentName;
            }
        }
        return null;

    }

    public String display() {

        StringBuilder output = new StringBuilder();
        for(Map.Entry currentEntry : phoneBook.entrySet()){
           output.append(currentEntry.getKey() + " ");
           output.append(currentEntry.getValue());
           output.append("\n");

       }
        System.out.println(output.toString());
        return output.toString();

    }
}
