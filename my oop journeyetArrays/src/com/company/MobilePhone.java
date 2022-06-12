package com.company;

import java.util.ArrayList;
import java.util.Formatter;

public class MobilePhone {

    private String myNumber;
    ArrayList<Contacts> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts){
      if (findContact(contacts) >= 0){
          System.out.println("Contact already on the list");
          return false;
      }else
          this.myContact.add(contacts);
        System.out.println("Contact has been added");
        return true;
   }
   public void printContact(){
       System.out.println("The contact list contained " + this.myContact.size() + "  contacts");
       for (int i = 0; i < this.myContact.size(); i++){
           System.out.println((i +1) + " Name = " +myContact.get(i).getName() + " phoneNumber = " + myContact.get(i).getPhoneNumber());
       }
   }
   public boolean updateContact(Contacts oldContact,Contacts newContact){
       int foundPosition = findContact(oldContact);
       if (foundPosition < 0){
           System.out.println("Contact cannot be found");
           return false;
       }
       this.myContact.set(foundPosition,newContact);
       System.out.println(oldContact.getName() + " has been updated to " + newContact.getName());
       return true;
   }

   public boolean removeContact(Contacts contact) {
       if (findContact(contact) < 0){
           System.out.println("Cannot find contact");
           return false;
       }
       this.myContact.remove(contact);
       return true;
   }

   private int findContact(Contacts contact){
       return this.myContact.indexOf(contact);
   }

   private int findContact(String contactName) {
       for (int i = 0; i < this.myContact.size(); i++) {
           Contacts contacts = this.myContact.get(i);
           if (contacts.getName().equals(contactName)){
           return i;
       }
   }
     return -1;
   }
   public Contacts queryContact(String name){
       int position = findContact(name);
       if (position >= 0){
           return this.myContact.get(position);
       }
       return null;
   }

   public String queryContact(Contacts contacts){
       if (findContact(contacts) >= 0){
           return contacts.getName();
       }
       return null;
   }
}


