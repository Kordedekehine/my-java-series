package reserveFlight;

public class Passenger {

    private String firstname;

    private String lastname;

    private String nationality;

    public String getFirstname() {
        return firstname;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getNationality(){
        return nationality;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
