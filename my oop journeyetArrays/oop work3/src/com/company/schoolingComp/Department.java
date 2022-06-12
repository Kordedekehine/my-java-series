package com.company.schoolingComp;

public class Department {
    private String name;
    private String Classes;
    private String courses;
    private String Schedules;
    private Building theBuilding;

    public Department(String name, String classes, String courses, String schedules, Building theBuilding) {
        this.name = name;
        Classes = classes;
        this.courses = courses;
        Schedules = schedules;
        this.theBuilding = theBuilding;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return Classes;
    }

    public String getCourses() {
        return courses;
    }

    public String getSchedules() {
        return Schedules;
    }

    public Building getTheBuilding() {
        return theBuilding;
    }
}
