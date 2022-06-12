package com.company.fan;

public class Fan {
    private String name;
    private String size;


   private int rotation;
    private int celerity;


    public Fan(String name, String size) {
        this.name = name;
        this.size = size;

        this.celerity = 0;
        this.rotation = 0;
    }

    public int getRotation() {
        return rotation;
    }

    public int getCelerity() {
        return celerity;
    }

    public void adjust(int rotation){
        this.rotation = rotation;
        System.out.println("The fan is adjusted to the " + rotation + " rotation degree");
    }

    public void cool(int celerity,int rotation){
        this.rotation = rotation;
        this.celerity = celerity;
        System.out.println("The fan is cooling the space at the speed of " + celerity + " at " +rotation + " degree");
    }

   public void stop(){
       System.out.println("Stop");
   }
}
