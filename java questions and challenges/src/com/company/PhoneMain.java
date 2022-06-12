package com.company;

import java.util.Scanner;

public class PhoneMain {

    private static Scanner scanner = new Scanner(System.in);
    // Creating an instant with a default Number
    private static MobilePhone mobilePhone = new MobilePhone("000 443 876");

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        while(!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int choice = 0;
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    mobilePhone.printContactList();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\n press");
        System.out.println("\t 0 - To print the Instructions");
        System.out.println("\t 1 - To print contact names");
        System.out.println("\t 2 - To add new contacts");
        System.out.println("\t 3 - To update the contact list");
        System.out.println("\t 4 - To remove the contact list");
        System.out.println("\t 5 - To query the contact list");
        System.out.println("\t 6 - To quit the process");
    }

    private static void addNewContact() {
        System.out.println("Enter contact number: ");
        String Name = scanner.nextLine();
        System.out.println("Enter contact name");
        String Number = scanner.nextLine();
        Contacts newContacts = Contacts.createContact(Name, Number); //this is directly from the contact class..gotten using the static/factory method
        //invoking the method we pass the contact name and number to the phone itself
        if (mobilePhone.addNewContact(newContacts)) { //if the contact name and number has been passed into the phone..Then,new number is added
            System.out.println("New contact added: " + "Name = " + Name + ", phoneNumber = " + Number);
        } else
            System.out.println("Cannot add " + Name + " already on file");
    }
//    public static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contacts existingCont = mobilePhone.queryContact(name);
//        if (existingCont == null) {
//            System.out.println("Contact not found");
//            return;
//        }
//        System.out.println("Enter replacement contact name: ");
//        String newName = scanner.nextLine();
//        System.out.println("Enter replacement contact number");
//        String newNumber = scanner.nextLine();
//        Contacts newContacts = Contacts.createContact(newNumber, newName);
//        if (mobilePhone.updateContact(existingCont, newContacts)) {
//            System.out.println("Contacts successfully updated");
//        } else
//            System.out.println("Error updating record");
//    }
//    public static void removeContact(){
//        System.out.println("Enter contact name to delete: ");
//        String Name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(Name);
//        if(existingContactRecord == null){
//            System.out.println("Cannot found contact");
//            return;
//        }
//         if ( mobilePhone.removeContact(existingContactRecord)){
//            System.out.println("Contact successfully deleted");
//        }else
//        System.out.println("Contact cannot be deleted");
//    }
//    public static void queryContact(){
//        System.out.println(" Enter contact name to search");
//        String Name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(Name);
//        if (existingContactRecord.equals(null)){
//            System.out.println("Cannot found contact");
//            return;
//        }else
//            System.out.println(" Name: = " + existingContactRecord.getName() + " and the Contact: = " +
//                    existingContactRecord.getPhoneNumber());
//
//    }






    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
           System.out.println("Contact not found");
        }else
            if (existingContactRecord != null)
        System.out.println("Enter replacement contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter replacement contact number");
        String newNumber = scanner.nextLine();
        Contacts newContacts = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContacts)) {
            System.out.println("Contacts successfully updated");
        } else
            System.out.println("Error updating record");
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String Name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(Name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else
            System.out.println("Error deleting record");
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String Name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(Name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " Phone number: " + existingContactRecord.getPhoneNumber());

    }





}
