package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SchoolsChart <T extends Interhouse>{
    private String name;

  private   ArrayList<T> charts = new ArrayList<>();

    public SchoolsChart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addOverall(T player){
        if (charts.contains(player)){
            System.out.println(player.getName() + " already added");
            return false;
        }else
            charts.add(player);
        System.out.println(player.getName() + " just got added");
        return true;
    }

    public void showCharts(){
        Collections.sort(charts);
        for (T t:
             charts) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}
