package com.company.schoolingComp;

public class Students {
    private String names;
    private int numOfStudents;
    private String Courses;
    private Lecturer theLecturer;

    public Students(String names, int numOfStudents, String courses, Lecturer theLecturer) {
        this.names = names;
        this.numOfStudents = numOfStudents;
        Courses = courses;
        this.theLecturer = theLecturer;
    }

    public void present(boolean isLecturerPresent, boolean isThereAfterClassText){
        System.out.println("Is the lecturer present in the class? |" +isLecturerPresent +
                "| will there be after class text " +isThereAfterClassText);
    }

    public String getNames() {
        return names;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getCourses() {
        return Courses;
    }

    public Lecturer getTheLecturer() {
        return theLecturer;
    }
}
