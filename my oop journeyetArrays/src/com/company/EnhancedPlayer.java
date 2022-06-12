package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitpoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitpoint, String weapon) {
        this.name = name;
        if (hitpoint > 0 && hitpoint <= 100) {
            this.hitpoint = hitpoint;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoint = this.hitpoint - damage;
        if (this.hitpoint <= 0) {
            System.out.println("player knocked out");
        }
    }

    public int getHitpoint() {
        return this.hitpoint;
    }
}
