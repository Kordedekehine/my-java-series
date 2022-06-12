package com.company;

import java.util.ArrayList;
public class PhoneBook {

    private String Number;
  private  ArrayList<Contact> myContacts;

    public PhoneBook(String number) {
        Number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already added");
        }
        this.myContacts.add(contact);
        return true;
    }

    public void printContact(){
        System.out.println("Our contact contains " + this.myContacts.size() + " contact");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.print("**\t" + "NO"  + "       NAME\t" + "     Number\t"   );
            System.out.println("**");
            System.out.println("\t" + (i + 1 ) + "      \t" + this.myContacts.get(i).getName() +
                    "     \t " + this.myContacts.get(i).getPhoneNumber());
        }
    }
    public boolean removeContact(Contact contact){
      int foundPosition = findContact(contact);
      if (foundPosition < 0){
          System.out.println("Contact cannot be found");
          return false;
      }
        this.myContacts.remove(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println("Contact cannot be found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " has been updated. Now " + newContact.getName());
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i); //spent 2 weeks on actually getting this place
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
}
