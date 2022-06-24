package reserveFlight;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static int person = 1;

    private static SeatBooking seatBooking = new SeatBooking();

    private static boolean isFirstClassFull = false;

    private static boolean isMiddleClassFull = false;

    private static boolean isEconomyClassFull = false;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (person != 0) {
            System.out.println("KAABO SI AIRPORT MURITALA NI NAIJA..IWO MAAFO \n" +
                    "PRESS 1 TO BOOK A FLIGHT IN THE FIRST CLASS SPACE\n" +
                    "PRESS 2 TO BOOK A FLIGHT IN THE MIDDLE CLASS SPACE\n" +
                    "PRESS 3 TO BOOK A FLIGHT IN THE ECONOMY CLASS SPACE");

            int userInput = scanner.nextInt();
            if (userInput == 1) {
                firstClassBooking();
            } else if (userInput == 2) {
                middleClassBooking();
            } else if (userInput == 3) {
                economyClassBooking();
            } else
                System.out.println("PRESS 1-2 OR 3..TO BOOK A FLIGHT");
        }
    }

    private static void firstClassBooking() {
        Passenger passenger = new Passenger();
        scanner.nextLine();
        System.out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();


        System.out.println("Enter your nationality: ");
        String nationality = scanner.nextLine();


        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        passenger.setFirstname(firstName);
        passenger.setLastname(lastName);
        passenger.setNationality(nationality);

        int seatNumber = 0;
        boolean isSeatFound = false;
        for (Seat seat : seatBooking.getFirstClassSeats()) {
            if (seat.isAssigned() == false) { //remember boolean is automatically false?
                seat.setAssigned(true);
                seat.setPassenger(passenger);
                seatNumber = seat.getSeatNumber();
                isSeatFound = true;
                break;
            }
        }
        if (isSeatFound) {
            ReservationStatus reservationStatus = new ReservationStatus(Options.FIRSTCLASS, seatNumber, firstName,
                    lastName, nationality, destination);
            System.out.println("INFOS");
            System.out.println(reservationStatus);
            System.out.println();
        } else {
            isFirstClassFull = true;
            System.out.println("No seats found in the first class section, would you like a seat in the " +
                    "middle class section or economy class section?" +
                    "if yes, enter 1 for middle class, if no enter 2 for ecomony: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                middleClassBooking();
            } else {
                isMiddleClassFull = true;
                System.out.println("Sorry! Try economy. Pele");

                if (choice == 2) {
                    economyClassBooking();
                } else {
                    isEconomyClassFull = true;
                    System.out.println("Maybe you should trek! Mafo");

                    System.out.println("Alright, Our next flight is in three hours, you can book a first class seat " +
                            "for it");
                    person = -1;
                }
            }
        }
    }

        private static void middleClassBooking () {
            Passenger passenger = new Passenger();
            scanner.nextLine();
            System.out.println("Enter your firstName: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter your lastName: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter your lastName: ");
            String nationality = scanner.nextLine();

            System.out.println("Enter your destination: ");
            String destination = scanner.nextLine();

            passenger.setFirstname(firstName);
            passenger.setLastname(lastName);
            passenger.setNationality(nationality);
            int seatNumber = 0;
            boolean isSeatFound = false;
            for (Seat seat : seatBooking.getEconomyClassSeats()) {
                if (seat.isAssigned() == false) {
                    seat.setAssigned(true);
                    seat.setPassenger(passenger);
                    seatNumber = seat.getSeatNumber();
                    isSeatFound = true;
                    break;
                }
            }
            if (isSeatFound) {
                System.out.println("Booked successfully");
               ReservationStatus reservationStatus = new ReservationStatus( Options.MIDDLECLASS,seatNumber, firstName,
                        lastName, nationality, destination);
                System.out.println(reservationStatus);
                System.out.println();
            } else {
                isMiddleClassFull = true;
                System.out.println("No seats found in the middle class section, would you like a seat in the " +
                        "economy class section?" +
                        "if yes, enter 1 for middle class, if no enter 2 for ecomony: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    economyClassBooking();
                } else {
                    isEconomyClassFull = true;
                    System.out.println("Sorry! Try economy. Pele");
                        System.out.println("Alright, Our next flight is in three hours, you can book a first class seat " +
                                "for it");
                        person = -1;
                    }
                }
    }

    private static void economyClassBooking () {
        Passenger passenger = new Passenger();
        scanner.nextLine();
        System.out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String nationality = scanner.nextLine();

        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        passenger.setFirstname(firstName);
        passenger.setLastname(lastName);
        passenger.setNationality(nationality);
        int seatNumber = 0;
        boolean isSeatFound = false;
        for (Seat seat : seatBooking.getEconomyClassSeats()) {
            if (seat.isAssigned() == false) {
                seat.setAssigned(true);
                seat.setPassenger(passenger);
                seatNumber = seat.getSeatNumber();
                isSeatFound = true;
                break;
            }
        }
        if (isSeatFound) {
            System.out.println("Booked successfully");
            ReservationStatus reservationStatus = new ReservationStatus( Options.ECONOMY,seatNumber, firstName,
                    lastName, nationality, destination);
            System.out.println(reservationStatus);
            System.out.println();
        } else {

                isEconomyClassFull = true;
                System.out.println("Sorry! Try economy. Pele");
                System.out.println("Alright, Our next flight is in three hours, you can book a first class seat " +
                        "for it");
                person = -1;
            }
        }
    }




