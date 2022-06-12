package com.company.hamburger;

public class DeluxeHamburger extends Hamaburger {

    public DeluxeHamburger( ) {
        super("Deluxe", "White", "Sausage and Bacon", 10.0);
        super.addHamburgerAddition1("Drink",2.5);
        super.addHamburgerAddition2("Chip",1.8);
    }


}
