package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook("0894857548");

    public static void main(String[] args) {
        int choice = 0;
        printInstructions();
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter key to access functions");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phoneBook.printContact();
                    break;
                case 2:
                    addContact();
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

    public static void printInstructions() {
        System.out.println("\n press");
        System.out.println("\t 0 - To print the Instructions");
        System.out.println("\t 1 - To print contact names");
        System.out.println("\t 2 - To add new contacts");
        System.out.println("\t 3 - To update the contact list");
        System.out.println("\t 4 - To remove the contact list");
        System.out.println("\t 5 - To query the contact list");
        System.out.println("\t 6 - To quit the process");
    }

    public static void addContact() {
        System.out.println("Enter the Name you wanna add");
        String Name = scanner.nextLine();
        System.out.println("Enter the Number of the number");
        String Number = scanner.nextLine();
        Contact newContact = Contact.createContact(Name, Number);

        if (phoneBook.addNewContact(newContact)) {
            System.out.println("Contact added:  Name: " + Name + " Number: " + Number);
        } else
            System.out.println("Cannot add contact");
    }

    public static void removeContact() {
        System.out.println("Enter the name of contact you wanna remove: ");
        String Name = scanner.nextLine();
        Contact contactExisting = phoneBook.queryContact(Name);
        if (contactExisting != null) {
            phoneBook.removeContact(contactExisting);
            System.out.println(contactExisting.getName() + " has been deleted");
        }else
        System.out.println(  " cannot be found");
    }

    public static void updateContact() {
        System.out.println("To Update: Enter the existing contact name");
        String Name = scanner.nextLine();
        Contact contactExisting = phoneBook.queryContact(Name);
        if (contactExisting != null) {
            System.out.println("Enter the new contact name");
            String newName = scanner.nextLine();
            System.out.println("Enter the new contact number");
            String newNumber = scanner.nextLine();

            Contact brandNewContact = Contact.createContact(newName, newNumber);
            phoneBook.updateContact(contactExisting, brandNewContact);
            System.out.println("Contact modified: " + contactExisting.getName() + "  has been modified to " + brandNewContact.getName());
        }else if (contactExisting == null)
        System.out.println("Contact cannot be modified");
    }

    public static void queryContact() {
        System.out.println("Enter the contact you wanna search for: ");
        String Name = scanner.nextLine();
        Contact searchName = phoneBook.queryContact(Name);
        if (searchName != null) {
            System.out.println("Name = " + searchName.getName() + " Number = " + searchName.getPhoneNumber());
        }else
        System.out.println("contact not found");
    }

}

