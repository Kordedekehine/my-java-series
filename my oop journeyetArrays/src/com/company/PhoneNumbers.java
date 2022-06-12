package com.company;

import java.util.ArrayList;

public class PhoneNumbers {
    ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
    ArrayList<String>  phoneNames = new ArrayList<String>();

    public void addContact(int number, String contactName){
        phoneNumbers.add(number);
    }
    public void addContactName(String name){
        phoneNames.add(name);
    }
    public void printContactNames(){
        System.out.println("You have " + phoneNames.size() + " in your contact list");
        for (int i = 0; i < phoneNames.size(); i++){
            System.out.println(phoneNames.get(i));

            for (int J = 0; J < phoneNumbers.size(); J++){
                System.out.println(i + 1 + " , " + phoneNumbers.get(J));
        }
    }
    }
    }





