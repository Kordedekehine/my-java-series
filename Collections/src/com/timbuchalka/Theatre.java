package com.timbuchalka;

import java.util.*;

/**
 * Created by dev on 2/12/2015.
 */
public class Theatre {
    private final String theatreName; //final can only be extended once so it's ideal we use it
    private List<Seat> seats = new ArrayList<>(); //Generics of the seat class
    //we had to change the access modifier to public for the sake of
    //testing normally in a real world program it's wrong

    static final Comparator<Seat> PRICE_ORDER; //here we created a comparator to check between the chosen seats

    static { //here we ,ake it a proper static method clicking on comparator show context action
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return 1;
                } else
                    return 0;
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) { //we create the parameter of input we want to accept
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1); // incrementing the alphabets
        for (char row = 'A'; row <= lastRow; row++) { //incrementing the number of alphabets
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
              double price = 12.00; //Towards the first front role, the price is 12.00(ones sitting at d edge)

              if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                  price = 14.00; //The ones sitting at the middle has to pay 14.00 from row 1 to 3
              }else if ((row > 'F') || (seatNum < 4 || seatNum > 9)){
                  price = 7.00; //from the F role downward those sitting at the edge will pay 7.00
              }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price); //the print out in this
                //format
                seats.add(seat);
            }
        }


    }

    public String getTheatreName() { //print everything out

        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) { //this method search using the compare method
//        int low = 0;
//        int high = seats.size()-1;
//
//        while (low <= high) {
//            System.out.print(".");
//            int mid = (low + high) / 2;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//            if (cmp < 0) { //if it actually detect it then get
//                low = mid + 1;
//            } else if (cmp > 0) {
//                high = mid - 1;
//            } else {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat " + seatNumber);
//        return false;

        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null); //search for seats using binary
        if (foundSeat >= 0) { //if the seat exist
            return seats.get(foundSeat).reserve(); //then reserve it
        } else
            System.out.println("There is no seat " + seatNumber); //hold that there is no seat
        return false;
    }


    // for testing
//    public void getSeats() {
//        for(Seat seat : seats) {
//            System.out.println(seat.getSeatNumber());
//        }
//    }
    public Collection<Seat> getSeats(){
        return seats;
    }

    public void getPrice(){
        for (Seat seat: seats){
            System.out.println(seat.price);
        }
    }



    public class Seat implements Comparable<Seat> { //we had to change the access modifier to public for the sake of
        //testing normally in a real world program it's wrong
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() { //the reserve method
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }


}
