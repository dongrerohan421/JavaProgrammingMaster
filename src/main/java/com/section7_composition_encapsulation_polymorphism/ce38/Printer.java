package com.section7_composition_encapsulation_polymorphism.ce38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
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

    public int addToner(int tonerAmmount) {
        if (tonerAmmount > 0 && tonerAmmount <= 100) {
            if (this.tonerLevel + tonerAmmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode!");
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }
}