package com.company;

 class Player {
    public String name;
    public int health;
    public String weapon;

    public void checkHealth(int level){
        this.health = this.health - level;
        if (this.health < 0) {
            System.out.println("player knocked out");
        }else
            System.out.println(this.health);

    }

     public int getHealth() {
         return health;
     }
 }
