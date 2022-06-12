package com.company.mobile;

import java.util.ArrayList;

public class MobilePhone {
private String number;
ArrayList<Contacts> myContacts = new ArrayList<Contacts>();

    public MobilePhone(String number) {
        this.number = number;
        this.myContacts = myContacts;
    }

    public boolean addContactList(Contacts contacts){
      int position = queryContact(contacts);
      if (position < 0){
          this.myContacts.add(contacts);
          return true;
      }
        System.out.println(contacts + " already existed! Cannot be added");
      return false;
    }

public void printContactsList(){
    System.out.println("Contacts include " + this.myContacts.size() + " in the list");
    for (int i = 0; i < this.myContacts.size(); i++){
        System.out.println((i + 1) + " , " + this.myContacts.get(i).getNumber() +
                " --> " + this.myContacts.get(i).getName());
    }
}

  public boolean updateContactList(Contacts oldContacts, Contacts newContacts){
     int position = queryContact(oldContacts);
     if (position >= 0){
         myContacts.set(position,newContacts);
         return true;
     }else
         System.out.println("Cannot be found in the contact");
     return false;
  }

  public boolean removeContactList(Contacts contacts){
        int position = queryContact(contacts);
        if (position >= 0){
            myContacts.remove(position);
            return true;
        }else
            System.out.println("Cannot found contact");
        return false;
  }

  public Contacts findContact(String name){
        int position = queryContact(name);
        if (position >= 0){
          return   myContacts.get(position);
        }
        return null;
  }

  private int queryContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++){
            Contacts contacts = myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
      return -1;
  }

    private int queryContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }

    public Contacts searchContactList(String name){
        int position = queryContact(name);
        if (position >= 0){
           return myContacts.get(position);
        }else
        return null;
    }
}
