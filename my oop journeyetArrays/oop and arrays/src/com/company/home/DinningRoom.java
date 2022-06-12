package com.company.home;

public class DinningRoom {
    private String table;
    private int chairs;
    private String tissuePapers;

    public DinningRoom(String table, int chairs, String tissuePapers) {
        this.table = table;
        this.chairs = chairs;
        this.tissuePapers = tissuePapers;
    }

    public String getTable() {
        return table;
    }

    public int getChairs() {
        return chairs;
    }

    public String getTissuePapers() {
        return tissuePapers;
    }
}
