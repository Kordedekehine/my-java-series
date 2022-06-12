package com.company;
//create a class and demonstrate proper encapsulation techniques
//the class will be called printer
//it will simulate a real computer printer
//it should have fields for the tonerLevel,number of pages printed and whether the printer is duplex,that is capable of printing on both sides
//Add methods to fill up the toner(up to 100% maximum level), another method to
//simulate printing a page (which should increase number of pages printed.
//decide on the scope whether you will use constructor or any thing else

public class Printer {
    private int tonerLevel;
    private int num_of_pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else
            this.tonerLevel = -1;
        this.duplex = duplex;
        this.num_of_pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerLevel > 0 && tonerLevel <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else
            return -1;
    }

    public int Printpages(int Pages){
        int pagesToPrint = Pages;
        if (this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }else
            this.num_of_pagesPrinted = this.num_of_pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getNum_of_pagesPrinted() {
        return this.num_of_pagesPrinted;
    }
}
