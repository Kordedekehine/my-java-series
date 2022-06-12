package com.company;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MobilePhone {

    ////////////////////////////////////////////////////////////////////////////////MOBILE PHONE
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    //we have to create a method to check if our contacts already exist
    public boolean addNewContact(Contacts contacts){
        if (findContact(contacts.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }//we need to bring out the phone number and contact name at a time
        this.myContacts.add(contacts); //after checking if contact already exist, if not, we proceed to save
        return true;
    }

    public void printContactList() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println("NO \t\t" + "Name\t\t\t\t" + "Number");
            System.out.println("\t\t" + i + 1 + " , " + "\t" + this.myContacts.get(i).getName() + " \t"  + this.myContacts.get(i).getPhoneNumber() );

        }
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }else
            this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }


    public boolean removeContact(Contacts contacts){
        int foundPosition = findContact(contacts);
        if (foundPosition < 0){
            System.out.println(contacts.getName() + " cannot be found");
            return false;
        }else
            this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + " was deleted");
        return true;
    }


    //we need to implement two find contact method..one has to be overload..one has to return the index position
    private int findContact(Contacts contacts){ //this method helps us to return integer..the phone number
        return this.myContacts.indexOf(contacts); //to show us which position our elements is, in our array
    }
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){ //this method helps return String....the phone name
            Contacts contacts = this.myContacts.get(i); //we create a new object to get the contact
            if(this.myContacts.get(i).getName() == contactName){ //if the contact name is found
                return i; //i is the element in the arrayList that we find the record in..it is used for the constant update, the test whether our
                //search content is greater than 0
            }
        }
        return -1; //return negative 1 if it wasn't found
    }


    //now there is a need to return data not in int(number) but string this this time..this leads to creation of query method
    //remember the findContact is directly invoking from its method
    public Contacts queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

}





