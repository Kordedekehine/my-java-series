package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contact implements Isavable{
    private String contactName;
    private long phoneNumber;

    public Contact(String contactName, long phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "SpeedDial{" +
                "contactName='" + contactName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public List<String> Write() {
        List<String> dial = new ArrayList<>();
        dial.add(0,this.contactName);
        dial.add(1," " + this.phoneNumber);

        return dial;
    }

    @Override
    public void display(List<String> savedContacts) {
        if (savedContacts != null && savedContacts.size() > 0){
            this.contactName = savedContacts.get(0);
            this.phoneNumber = Long.parseLong(savedContacts.get(1));
        }
    }
}
