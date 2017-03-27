package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.  //Encapsulation challenge
 */

public class Printer {

    private int tonerLevel = 50;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int filltoner(int addToner) {
        int newtonerLevel = tonerLevel + addToner;
        if (newtonerLevel > 100) {
            System.out.println("Toner Level Overflow: Invalid Action");
        } else {
            tonerLevel = newtonerLevel;
            System.out.println("Toner Level now at " + tonerLevel);
        }
        return tonerLevel;
    }

    public int printPage(int pages2print) {
        if (isDuplex) {
            pagesPrinted = ((pagesPrinted*2) + pages2print)/2;
        } else {
            pagesPrinted = pagesPrinted + pages2print;
        }
        System.out.println("You have printed " + pagesPrinted + " pages");
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
