package reserveFlight;

import java.util.Optional;

public class Seat {

    private boolean isAssigned;
    private Options checkFlightMode;
    private Passenger passenger;
    private int seatNumber;

    public Seat(Options checkFlightMode, int seatNumber) {
        this.checkFlightMode = checkFlightMode;
        this.seatNumber = seatNumber;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public Options getCheckFlightMode() {
        return checkFlightMode;
    }

    public void setCheckFlightMode(Options checkFlightMode) {
        this.checkFlightMode = checkFlightMode;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
