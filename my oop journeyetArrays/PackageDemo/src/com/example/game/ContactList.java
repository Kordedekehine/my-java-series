package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class ContactList implements Isavable {
    private String contactName;
    private long phoneNumber;
    private String relationship;
    private String gender;

    public ContactList(String contactName, long phoneNumber, String relationship, String gender) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
        this.gender = gender;
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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contactName='" + contactName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", relationship='" + relationship + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public List<String> Write() {
        List<String> contacts = new ArrayList<String>();
        contacts.add(0, this.contactName);
        contacts.add(1, " " + this.phoneNumber);
        contacts.add(2, this.relationship);
        contacts.add(3, this.gender);

        return contacts;
    }

    @Override
    public void display(List<String> savedContacts) {
        if (savedContacts != null && savedContacts.size() > 0) {
            this.contactName = savedContacts.get(0);
            this.phoneNumber = Long.parseLong(savedContacts.get(1));
            this.relationship = savedContacts.get(2);
            this.gender = savedContacts.get(3);
        }
    }
}
