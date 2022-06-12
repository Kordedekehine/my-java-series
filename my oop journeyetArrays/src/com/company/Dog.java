package com.company;

public class Dog extends Animal{
        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;

        public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
            super(name, 1, 1, size, weight);
            this.eyes = eyes;
            this.coat = coat;
            this.legs = legs;
            this.tail = tail;
            this.teeth = teeth;

        }

        private void chew() { //the chew void method was created in the extended animal class
            System.out.println("the called guy");
        }

    @Override
    public void eat() { //Note: that this is the override method that is used for passing multiples print out statements..derived from shortcut
 //you can call method with their name and print them out
        System.out.println("just wow");
        chew();
        super.eat(); //since the eat method is override the main method should be called using super,as super as it is
    }

    public void walk() {
        System.out.println("dog.walk");
        move(5);
    }

    public void run() {
        System.out.println("dog run");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println(16);
        eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move");
        moveLegs(speed);
        super.move(speed);
    }
}

