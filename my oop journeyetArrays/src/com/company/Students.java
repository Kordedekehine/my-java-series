package com.company;

public class Students {
    private String study;
    private int Matric_no;

    public Students(String study, int matric_no) {
        System.out.println("Korede studies " +study + " and has a matric number of " +matric_no);
        this.study = study;
        Matric_no = matric_no;
    }

    public String getStudy() {
        return study;
    }

    public int getMatric_no() {
        return Matric_no;
    }
}
