package com.company;

//public class Benz extends Car{ //the benz class inherits from the car class
// private int roadServiceMethods;
//
//    public Benz(  int roadServiceMethods) {
//        super("Benz", "254GL", 5, 5, 3, 4, 6, false);
//        this.roadServiceMethods = roadServiceMethods;
//    }
//    public void accelerate(int rate){
//
//        int newVelocity = getCurrentVelocity() + rate;
//        if (newVelocity == 0){
//            stop();
//            changeGear(1);
//        }else if (newVelocity > 0 && newVelocity <= 10){
//            changeGear(1);
//        }else if (newVelocity > 10 && newVelocity <= 20){
//            changeGear(2);
//        }else if (newVelocity > 20 && newVelocity <= 30){
//            changeGear(3);
//        }else
//            changeGear(4);
//
//    if(newVelocity > 0) {
//        changeVelocity(newVelocity, getCurrentDirection());
//    }
//  }
//}