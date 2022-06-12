package com.company;

public class Fish extends Animal{
    private int fins;
    private int gills;
    private int eyes;

    public Fish(String name, int size, int weight, int fins, int gills, int eyes) {
        super(name,1,1, size, weight); //once you put any number instead of a the method  variable,you delete it from the static
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }
    //after this you define all the characteristics of the fish and what it should print out
    private void rest() {
        System.out.println("fish do rest");
    }
    private void moveMuscles() {
        System.out.println("fish muscles");
    }

    private void moveBackFin() {

    }

  private void swim(int speed) {
        moveBackFin();
        moveMuscles();
        super.move(speed);
  }

    @Override
    public void eat() {
        swim(9);
        super.eat();
    }
}
