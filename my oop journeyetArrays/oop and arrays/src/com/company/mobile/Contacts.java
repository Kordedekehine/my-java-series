package com.company.mobile;

public class Contacts {
    private String number;
    private String name;

    public Contacts(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static Contacts contacts(String number, String name){
        return new Contacts(number,name);
    }
}
