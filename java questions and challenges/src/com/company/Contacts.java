package com.company;

import java.util.ArrayList;

public class Contacts { //To create a mobile phone contact list, the contact itself must have its own class..that capture the phone number and name
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber); //by implementing this we can call on the constructor to create our method
    }

//    ArrayList<String> contactList = new ArrayList<String>();
//
//    public ArrayList<String> getContactList() {
//        return contactList;
//    }
//
//    public void storeContacts(String names) {
//        contactList.add(names);
//    }
//
//    public void printContactList() {
//        System.out.println("You have " + contactList.size() + " Contacts in your list.");
//        for (int i = 0; i < contactList.size(); i++) {
//            System.out.println(i + " - " + contactList.get(i));
//        }
//    }
}
