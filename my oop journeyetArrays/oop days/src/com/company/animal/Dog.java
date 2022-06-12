package com.company.animal;

public class Dog extends Animal implements Behaviour{
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " chew when eating");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " glide while walking");
    }

    @Override
    public void behaviour() {
        System.out.println(getName() + " behaves like hyena");
    }
}
