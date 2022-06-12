package com.company;

import java.util.ArrayList;

public class InnerBar {
    private String name;
    private String school;
    private int age;
    private ArrayList<SmallerBar> money;

    public InnerBar(String name, String school, int age) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.money = new ArrayList<SmallerBar>();
        SmallerBar broke = new SmallerBar("female","black",0,0);
        this.money.add(broke);
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public void addSmallerBar(String sex, String complexion,int realAge, int additionalAge){
        if ((realAge > 0) && (additionalAge > 0)){
            System.out.println("The " + complexion +" and " +sex + " ashawo manipulated "+ realAge + additionalAge + " years. And now x"
                    +additionalAge + " rich" );

        }
    }

    public static class SmallerBar{
        private String sex;
        private String complexion;

        public SmallerBar(String sex, String complexion,int realAge, int additionalAge) {
            this.sex = sex;
            this.complexion = complexion;
        }

        public String getSex() {
            return sex;
        }

        public String getComplexion() {
            return complexion;
        }
    }


}
