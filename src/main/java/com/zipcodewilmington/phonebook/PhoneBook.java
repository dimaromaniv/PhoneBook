package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook ;


    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = map;
    }


    public PhoneBook() {

        this( new TreeMap<>() );
    }

    public void add(String name, String phoneNumber) {

        // this.phonebook.put(name,phoneNumbers);


    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name , Arrays.asList(phoneNumbers));
        //System.out.println(phonebook);



//        List <String> phoneNumber = new ArrayList<>();
//
//        for (int i = 0 ; i <= phoneNumbers.length -1 ; i++) {
//            phoneNumber.add(phoneNumbers[i]);
//        }
//
//        this.phonebook.put(name, phoneNumber);
//        System.out.println(phonebook);

    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name,String phonebook) {

        return null;
    }

    public Boolean hasEntry(String name ){

        return null;
    }


    public List<String> lookup(String name) {

        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {


        return new HashMap(phonebook);
    }
}
