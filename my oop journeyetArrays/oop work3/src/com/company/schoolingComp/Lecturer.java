package com.company.schoolingComp;

public class Lecturer {
    private String names;
    private String course;
    private String testDay;
    private String examDay;
    private String handouts;
    private HOD H0D;

    public Lecturer(String names, String course, String testDay, String examDay, String handouts, HOD h0D) {
        this.names = names;
        this.course = course;
        this.testDay = testDay;
        this.examDay = examDay;
        this.handouts = handouts;
        H0D = h0D;
    }

    public String getNames() {
        return names;
    }

    public String getCourse() {
        return course;
    }

    public String getTestDay() {
        return testDay;
    }

    public String getExamDay() {
        return examDay;
    }

    public String getHandouts() {
        return handouts;
    }

    public HOD getH0D() {
        return H0D;
    }
}
