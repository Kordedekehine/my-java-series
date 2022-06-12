package com.company.assignments.assignments;

public class Six {

    public static void main(String[] args) {
        attendanceForExam(29,"Yes");
    }

     static void attendanceForExam(int numOfClassAttended, String MedicalProblem) {
        int numberOfClassesHeld = 40;
        int attendancePercentage = numberOfClassesHeld * 75 / 100;
        if (numOfClassAttended >= attendancePercentage && MedicalProblem == "No") {
                System.out.println("Good! Eligible for the exams! Student has attended more than 75% of the class attendance.");
            } else if (numOfClassAttended < attendancePercentage && MedicalProblem == "Yes") {
                    System.out.println("Eligible for the exams! Student failed to attended more than 75% of the class attendance due to medical reasons");
                } else if (numOfClassAttended < attendancePercentage && MedicalProblem == "No") {
                    System.out.println("Student is not eligible for the exams!Student has not attended up to 75% of the class attendance.");
                }else if (numOfClassAttended >= attendancePercentage && MedicalProblem == "Yes") {
            System.out.println("Good! Student has attended more than 75% of the class attendance despite health conditions. Therefore, Eligible for the exams");
        }
        }
    }


