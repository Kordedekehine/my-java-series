package com.company;

    public class Practise {
       static void myStaticMethod() { //this is the only way we can declare static method.it cannot be declare inner or in the class
            System.out.println("Static methods can be called without creating objects");
        }

        public void myPublicMethod() {
            System.out.println("public methods must be called by creating objects");
        }

        public static void main(String[] args) {
            myStaticMethod(); //call the static method
            // myPublicMethod (); This would compile an error


            // create an object of main
         /*   Main myObj = new Main();
            myObj.myPublicMethod(); //call the public method on the object

        }
        public void fullThrottle() {
            System.out.println("oya wait");
        }
        public void  speed(int speed) {
            System.out.println("max speed = " + speed);
        }

        public static void main(String[] args) {
            Main myCar = new Main();
            myCar.fullThrottle();
            myCar.speed(200); */
        }
        }



