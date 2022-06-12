package com.company;

public class Schedule {
    private String Days;
    private String Plans;


    public Schedule(String days,String plans) {
        Days = days;
        this.Plans = plans;
    }

    public String getDays() {
        return Days;
    }

    public String getPlans(){
           return Plans;
        }


    public static Schedule createSchedule(String days, String plans){

        return new Schedule(days,plans);
    }
}
