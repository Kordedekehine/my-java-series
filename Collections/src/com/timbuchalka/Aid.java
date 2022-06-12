package com.timbuchalka;

import java.util.List;

public class Aid {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);


        if (theatre.reserveSeat("D10")) {
            System.out.println("Please pay for D10");
        } else
            System.out.println("Seat already reserved");


        if (theatre.reserveSeat("D11")) {
            System.out.println("Please pay for D11");
        } else
            System.out.println("Seat already reserved");


//        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
//        Collections.reverse(reverseSeat);
//        printList(reverseSeat); //print seats and price in reverse order
//
//        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
//        priceSeats.add(theatre.new Seat("B00",13.00));
//        priceSeats.add(theatre.new Seat("A00",13.00)); //we add more seats and their price
//        Collections.sort(priceSeats,Theatre.PRICE_ORDER); //we add the sort method to the comparator
//        printList(priceSeats);
    }
    public static void printList(List<Theatre.Seat> list){ //print it out
        for (Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================================");
    }
}
