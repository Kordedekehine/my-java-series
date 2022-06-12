package com.company;

public enum Size {
    SMALL("The size is small"),
    MEDIUM("The size is medium"),
    LARGE("The size is large"),
    EXTRALARGE("The size is extra large");

    private final String pizzaSize;

    Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }


}


