package com.company.assignments;

public class Twenty1 {
    //class name should be employee

    public static void main(String[] args) {
        Twenty1 twenty1 = new Twenty1("Robert",1994,"64C-WallsStreet");
        Twenty1 twenty2 = new Twenty1("Sam",2000,"68D-WallsStreet");
        Twenty1 twenty3 = new Twenty1("John",1999,"26B-WallsStreet");

        System.out.println("Name \t\t\tYear of Joining \t\t Address");
        System.out.println(twenty1.getName() +"\t\t\t"  + twenty1.getYearOfJoining() +     "    \t\t\t"  + twenty1.getAddress());
        System.out.println(twenty2.getName() + "    \t\t\t"  + twenty2.getYearOfJoining() +     "    \t\t\t"  + twenty2.getAddress());
        System.out.println(twenty3.getName() + "\t\t\t"  + twenty3.getYearOfJoining() +  "       \t\t\t"  + twenty3.getAddress());


    }
    private String name;
    private int YearOfJoining;
    private String Address;

    public Twenty1(String name, int yearOfJoining, String address) {
        this.name = name;
        YearOfJoining = yearOfJoining;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return YearOfJoining;
    }

    public String getAddress() {
        return Address;
    }
}
