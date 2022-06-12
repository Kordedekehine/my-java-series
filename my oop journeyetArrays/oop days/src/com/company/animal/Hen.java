package com.company.animal;

public class Hen extends Animal implements Behaviour {
    public String name;

    public Hen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " swallow while eating");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " Jog while walking");
    }

    @Override
    public void behaviour() {
        System.out.println(getName() + " has a distinct behaviour");
    }
}
