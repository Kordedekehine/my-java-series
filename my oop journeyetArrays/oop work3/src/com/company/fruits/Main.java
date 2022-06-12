package com.company.fruits;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fruits fruits = new Fruits("Consumable fruits", "Vitamin","Varies");

        Grape grape = new Grape("Grape","Green",true);
        grape.consumption();

      Guava guava = new Guava("Guava","Red",true);
     // guava.consumption();
    }
}
