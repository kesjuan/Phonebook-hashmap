package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */



public class PhoneBook {
 private HashMap<String, String> phoneBook = new HashMap<>();
    //HashMap<String, String> phoneBook = new HashMap<String, String>();
   // private final Map<String, List<String>> phonebook;

//    public PhoneBook(Map<String, List<String>> map) {
//
//        this.phonebook = null;
//    }

//    public PhoneBook() {
//
//        this(null);
//    }

    public void add(String name, String phoneNumber) {

        phoneBook.put(name, phoneNumber);
    }
                                    // String... = varags which means an arbitrary number of args from 0 to multiple.
    public void addAll(String name, String... phoneNumbers) {
        //HashMap <String, String> numbers = new HashMap<>();
        //ArrayList<String> numbers = new ArrayList<String>();
      // Map<String, List<>> = phoneNumbers new
        HashMap<String, ArrayList<String>> numbers = new HashMap<>();
       ArrayList<String> numbers1 = Arrays.stream(phoneNumbers).collect(Collectors.toCollection(ArrayList::new));
               // stream().collect(Collectors.toCollection(ArrayList::new))
        for (int x = 0; x < numbers1.size(); x++){

          numbers.put(name, numbers1);
          phoneBook.put(name, numbers.toString());
            System.out.println(1);
         // phoneBook.putAll(numbers);
           // phoneBook.putAll(name, );
//            numbers.add(phoneNumbers);
            //phoneBook.put(name,phoneBook.);
           // phoneBook.put(name, phoneBook(x));
//            System.out.println(phoneNumbers[x]);
        }
    }

    public void remove(String name) {
        for (int x = 0; x < phoneBook.size(); x++){
            if (phoneBook.containsKey(name)){
                phoneBook.remove(name);
            }
        }
    }

    public Boolean hasEntry(String name) {
        Boolean hasContact = false;
        for (int x = 0; x < phoneBook.size(); x++){
            if (phoneBook.containsKey(name)){
                hasContact = true;
            } else {hasContact = false; }

        }
        return hasContact;
    }

    public List<String> lookup(String name) {
        for(int x = 0; x < phoneBook.size(); x++){
            if (phoneBook.containsKey(name)){
                System.out.println(phoneBook.get(name));
                break;
            }
        }
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        String contact = "";
            for (int x = 0; x < phoneBook.size(); x++){
                if (phoneBook.containsValue(phoneNumber)){
                    contact = phoneBook.keySet().toString();
                } else  {
                    contact = "Sorry this number isn't in your phonebook";
                }

            }
        return contact;
    }

    public List<String> getAllContactNames() {
       // List<String> contacts ;
//        for(int x = 0; x < phoneBook.size(); x++){
//           contacts = phoneBook.get()
//           contacts.listIterator();
//        }
        ArrayList<String> listOfKeys = phoneBook.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        return listOfKeys;
    }

    public Map<String, List<String>> getMap() {

        return null;
    }
}
