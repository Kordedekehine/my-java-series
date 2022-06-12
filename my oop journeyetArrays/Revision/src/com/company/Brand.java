package com.company;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class Brand {
   private String name;
   private double creditLimit;
   private String email;

    public Brand() {
        this("Default name", 5000.00,"Default email");
    }

    public Brand(String name, double creditLimit) {
        this(name,creditLimit,"Default email");
    }

    public Brand(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
