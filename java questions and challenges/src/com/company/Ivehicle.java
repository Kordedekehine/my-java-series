package com.company;

interface Ivehicle {
    public void move(int gear);
   public void speed(int km);
   public void accelerate(int stop);
   default void vehicleSound(){
       System.out.println("Not too loud");
   }
}
