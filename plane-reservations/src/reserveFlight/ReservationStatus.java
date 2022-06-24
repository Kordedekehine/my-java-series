package reserveFlight;

public class ReservationStatus {

    private Options options;
    private int seatNumber;
    private String firstName;
    private String lastName;

    private String nationality;
    private String destination;

    public ReservationStatus(Options options, int seatNumber, String firstName, String lastName, String nationality, String destination) {
        this.options = options;
        this.seatNumber = seatNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.destination = destination;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public int getSeatNumber() {
        return seatNumber;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

//FOR PRINT OUT
    @Override
    public String toString() {
        String result = "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "seatNumber: " + seatNumber + "\n" +
                "options: " + options + "\n" +
                "destination: " + destination;

        return result;
    }
}
