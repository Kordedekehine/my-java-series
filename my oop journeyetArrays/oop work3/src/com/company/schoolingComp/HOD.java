package com.company.schoolingComp;

public class HOD {
    private String names;
    private char Gender;
    private String Office;
    private Staff theStaffs;

    public HOD(String names, char gender, String office, Staff theStaffs) {
        this.names = names;
        Gender = gender;
        Office = office;
        this.theStaffs = theStaffs;
    }

    public String getNames() {
        return names;
    }

    public char getGender() {
        return Gender;
    }

    public String getOffice() {
        return Office;
    }

    public Staff getTheStaffs() {
        return theStaffs;
    }
}
