package com.company.schoolingComp;

public class Staff {
    private String name;
    private String duty;
    private String office;

    public Staff(String name, String duty, String office) {
        this.name = name;
        this.duty = duty;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public String getDuty() {
        return duty;
    }

    public String getOffice() {
        return office;
    }
}
