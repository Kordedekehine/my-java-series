package com.company.schoolingComp;

public class Faculty {
    private  String name;
    private Department theDepartment;
    private Students theStudents;
    private Lecturer theLecturer;
    private HOD theHOD;

    public Faculty(String name, Department theDepartment, Students theStudents, Lecturer theLecturer, HOD theHOD) {
        this.name = name;
        this.theDepartment = theDepartment;
        this.theStudents = theStudents;
        this.theLecturer = theLecturer;
        this.theHOD = theHOD;
    }

    public void isFacultyOpen(boolean isFacultyOpen){
        System.out.println("the faculty is currently " + isFacultyOpen);
    }

    public String getName() {
        return name;
    }

    public Department getTheDepartment() {
        return theDepartment;
    }

    public Students getTheStudents() {
        return theStudents;
    }

    public Lecturer getTheLecturer() {
        return theLecturer;
    }

    public HOD getTheHOD() {
        return theHOD;
    }
}
