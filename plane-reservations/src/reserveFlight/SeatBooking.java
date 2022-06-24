package reserveFlight;

public class SeatBooking {

    private Seat [] firstClassSeats = new Seat[10];

    private Seat [] middleClassSeats = new Seat[10];

    private Seat [] economyClassSeats = new Seat[10];


    public SeatBooking() {
        //LETS LOOP THROUGH ALL THE ARRAYS (seats)
        for (int booked = 0; booked < firstClassSeats.length; booked++){
            //FOR EACH FIRST CLASS BOOK A FLIGHT AND COUNT THE SEAT TAKEN
            firstClassSeats[booked] = new Seat(Options.FIRSTCLASS,booked+1);
        }

        for (int booked = 0; booked < middleClassSeats.length;booked++){
            firstClassSeats[booked] = new Seat(Options.MIDDLECLASS,booked+1);
        }

        for (int booked = 0; booked < economyClassSeats.length;booked++){
            firstClassSeats[booked] = new Seat(Options.ECONOMY,booked+1);
        }
    }

    //Guess we dont need setter..since we are her to get(book) a seat
    public Seat[] getFirstClassSeats() {
        return firstClassSeats;
    }

    public Seat[] getMiddleClassSeats() {
        return middleClassSeats;
    }

    public Seat[] getEconomyClassSeats() {
        return economyClassSeats;
    }
}
