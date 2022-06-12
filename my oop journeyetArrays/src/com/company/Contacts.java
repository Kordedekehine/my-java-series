package com.company;

class Contacts { //To create a mobile phone contact list, the contact itself must have its own class
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

    //we have to create a public static method so that we can access and create a new contact record.very useful when accessing function
    // on phone
    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name,phoneNumber);
    }
}
