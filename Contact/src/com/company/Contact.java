package com.company;

public class Contact {
   private String Name;
   private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        Name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String Name, String phoneNumber){
        return new Contact(Name,phoneNumber);
    }
}
