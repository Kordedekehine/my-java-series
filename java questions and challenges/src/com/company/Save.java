package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Save {

//    private String name;
//    private String phoneNumber;
//
//    public Contacts(String name, String phoneNumber) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    // Calling constructor in createContact Method
//    public static Contacts createContact(String name, String phoneNumber) {
//        return new Contacts(name, phoneNumber);
//    }
//
//
//
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
//        for(int i = 0; i < contactList.size(); i++) {
//            System.out.println(i + " - " + contactList.get(i));
//        }
//    }
    ////////////////////////////////////////////////////////////////////////////////MOBILE PHONE
//private String myNumber;
//    private ArrayList<Contacts> myContacts;
//
//    public MobilePhone(String myNumber) {
//        this.myNumber = myNumber;
//        this.myContacts = new ArrayList<Contacts>();
//    }
//
//
//    // Adding a new contact
//    public boolean addNewContact(Contacts contact) {
//
//        // Before adding a contact we are checking that its exist or not
//
//        if(findContact(contact.getName()) >= 0) {
//            System.out.println("Contact is already on file");
//        }
//
//        //If Not exist then add our contact
//        myContacts.add(contact);
//        return true;
//    }
//
//    //Update Contact using set method
//    public boolean updateContact(Contacts oldContact , Contacts newContact) {
//        int foundPosition = findContact(oldContact);
//        if(foundPosition < 0) {
//            System.out.println(oldContact.getName() + " , was not found");
//            return false;
//        }
//
//        this.myContacts.set(foundPosition, newContact);
//        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
//        return true;
//    }
//
//    // Remove Contact
//    public boolean removeContact(Contacts contact) {
//        int foundPosition = findContact(contact);
//        if(foundPosition < 0) {
//            System.out.println(contact.getName() + " , was not found");
//            return false;
//        }
//        this.myContacts.remove(foundPosition);
//        System.out.println(contact.getName() + " was deleted");
//        return true;
//    }
//
//
//    // Find Contact Position
//    private int findContact(Contacts contact) {
//        return this.myContacts.indexOf(contact);
//    }
//
//    // Find Contact Names
//    private int findContact(String contactName) {
//        for(int i =0; i < myContacts.size(); i++) {
//            // Creating another temporary object to hold the name and compare
//            Contacts contacts = this.myContacts.get(i);
//            if(contacts.getName().equals(contactName)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    // query contact
//    public String queryContact(Contacts contact) {
//        if(findContact(contact) >= 0) {
//            return contact.getName();
//        }
//        return null;
//    }
//
//    public Contacts queryContact(String name) {
//        int position = findContact(name);
//        if(position >=0) {
//            return this.myContacts.get(position);
//        }
//        return null;
//    }
//
//
//    public void printContacts() {
//        System.out.println("Contact list");
//        for(int i = 0; i < this.myContacts.size(); i++) {
//            System.out.println((i+1) + " ." +
//                    this.myContacts.get(i).getName() +
//                    " -> " + this.myContacts.get(i).getPhoneNumber());
//        }
//    }
    ///////////////////////////////////////////////////////////////////////////////////
//private static Scanner scanner = new Scanner(System.in);
//    // Creating an instant with a default Number
//    private static MobilePhone mobilePhone = new MobilePhone("000 443 876");
//
//    public static void main(String[] args) {
//
//        boolean quite = false;
//        startPhone();
//        printAction();
//        while(!quite) {
//            System.out.println("\n Enter action: (6 to show available actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\n Shuting down .. ");
//                    quite = true;
//                    break;
//
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    printAction();
//                    break;
//
//
//            }
//
//
//
//        }
//
//    }
//    private static void addNewContact() {
//        System.out.println("Enter new Contact Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter phone Number: ");
//        String phone = scanner.nextLine();
//        Contacts newContact = Contacts.createContact(name, phone);
//        if(mobilePhone.addNewContact(newContact)) {
//            System.out.println("New Contact Added: name = "+ name + " , phone: " + phone );
//        }else {
//            System.out.println("Can't add, " + name +" already on file");
//        }
//    }
//
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name : ");
//        String name = scanner.nextLine();
//        Contacts extContact = mobilePhone.queryContact(name);
//        if(extContact == null)
//        {
//            System.out.println("Cannot found contact");
//            return;
//        }
//
//        System.out.println("Enter new Contact Name: ");
//        String newName = scanner.nextLine();
//        System.out.println("Enter new Phone Number: ");
//        String newNumber = scanner.nextLine();
//
//        Contacts newContact = Contacts.createContact(newName, newNumber);
//        if(mobilePhone.updateContact(extContact, newContact))
//        {
//            System.out.println("Successfully updated");
//        }else {
//            System.out.println("Error Updating Contact");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println("Enter existing contact name : ");
//        String name = scanner.nextLine();
//        Contacts extContact = mobilePhone.queryContact(name);
//        if(extContact == null)
//        {
//            System.out.println("Cannot found contact");
//            return;
//        }
//
//        if(mobilePhone.removeContact(extContact)) {
//            System.out.println("Successfully deleted");
//        }else {
//            System.out.println("Error Deleting Contact");
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name : ");
//        String name = scanner.nextLine();
//        Contacts extContact = mobilePhone.queryContact(name);
//        if(extContact == null)
//        {
//            System.out.println("Cannot found contact");
//            return;
//        }
//
//        System.out.println("Name : " + extContact.getName() +
//                " Phone Number is: " + extContact.getPhoneNumber());
//    }
//
//
//    private static void startPhone() {
//        System.out.println("Starting Phone . . .");
//    }
//
//    private static void printAction() {
//        System.out.println("\nAvailable actions:\npress");
//        System.out.println("0 - to shutDown\n" +
//                "1 - to print contacts\n"+
//                "2 - to add a new contact\n"+
//                "3 - to update an existing contact\n"+
//                "4 - to remove and existing contact\n"+
//                "5 - query for existing contact\n"+
//                "6 - to print a list of available actions.");
//        System.out.println("Choose Your Action: ");
//    }
}
