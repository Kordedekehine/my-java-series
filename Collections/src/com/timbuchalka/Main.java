package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Olympian Theatre" );

        Scanner scanner = new Scanner(System.in);
        String seatNumber = " ";
        String seatNumber2 = " ";
        Theatre theatre = new Theatre("Olympian", 8, 12);

        System.out.println("1 : Enter your preferred seat number");
        seatNumber = scanner.next();

        if (theatre.reserveSeat(seatNumber)) {
            System.out.println("Please pay for " + seatNumber);
        } else
            System.out.println("Seat already reserved");

        System.out.println("2 : Enter your preferred seat number");
        seatNumber2 = scanner.next();

        if (theatre.reserveSeat(seatNumber2)) {
            System.out.println("Please pay for " + seatNumber2);
        } else
            System.out.println("Seat already reserved");


        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat); //print seats and price in reverse order

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00)); //we add more seats and their price
        Collections.sort(priceSeats,Theatre.PRICE_ORDER); //we add the sort method to the comparator
        printList(priceSeats);
    }
    public static void printList(List<Theatre.Seat> list){ //print it out
        for (Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================================");
    }
}
