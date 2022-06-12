package com.company;

public class Schedule {
    private String Days;
    private String plans;

    public Schedule(String days, String plans) {
        this.Days = days;
        this.plans = plans;
    }

    public String getDays() {
        return Days;
    }

    public String getPlans() {
        return plans;
    }

    public static Schedule createPlans(String days, String plans){
       return new Schedule(days,plans);
    }
}
