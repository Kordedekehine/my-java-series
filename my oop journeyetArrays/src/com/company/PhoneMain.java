package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class PhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("08088675804");

    public static void main(String[] args) {
        int choice = 0;
        printInstructions();
        boolean quit = false;
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
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


    public static void addContact(){
        System.out.println("Enter contact number: ");
        String Number = scanner.nextLine();
        System.out.println("Enter contact name");
        String Name = scanner.nextLine();
        Contacts newContacts = Contacts.createContact(Number,Name); //this is directly from the contact class..gotten using the static/factory method
        //invoking the method we pass the contact name and number to the phone itself
        if (mobilePhone.addNewContact(newContacts)){ //if the contact name and number has been passed into the phone..Then,new number is added
            System.out.println("New contact added: " + "Name = " + Name + ", phoneNumber = " + Number);
        }else
            System.out.println("Cannot add " + Name + " already on file");
    }

}

