package com.zipcodewilmington.phonebook;

public class Main {
    public static void main(String[] args) {
PhoneBook phone = new PhoneBook();
phone.add("Jared", "3021234567");
phone.lookup("Jared");
        System.out.println(phone.lookup("Jared"));
        System.out.println(phone.hasEntry("Jared"));
        System.out.println(phone.reverseLookup("3021234567"));
       // phone.addAll("Bob","3021293084"," 0987654321", "1029387092");
      //  System.out.println(phone.lookup("Bob"));
        phone.add("Lesh","0987654321");
        System.out.println(phone.hasEntry("Lesh"));
        phone.remove("Lesh");
        System.out.println(phone.hasEntry("Lesh"));
        phone.add("Perry", "1230984764"); phone.add("tarfel", "0293837464");
        System.out.println(phone.getAllContactNames());
             phone.addAll("Bob","3021293084"," 0987654321", "1029387092");
            System.out.println(phone.getAllContactNames());
            System.out.println(phone.lookup("Bob"));
    }
}
