package com.section7_composition_encapsulation_polymorphism.ce38;

public class Main {
    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(50, true);
        System.out.println("Initial page count = " + duplexPrinter.getPagesPrinted());

        int pagesPrinted = duplexPrinter.printPages(4);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = "
                + duplexPrinter.getPagesPrinted());

        pagesPrinted = duplexPrinter.printPages(2);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = "
                + duplexPrinter.getPagesPrinted());

        Printer singlePrinter = new Printer(50, false);
        System.out.println("Initial page count = " + singlePrinter.getPagesPrinted());

        int singlePagesPrinted = singlePrinter.printPages(4);
        System.out.println("pages printed was " + singlePagesPrinted + " new total print count for printer = "
                + singlePrinter.getPagesPrinted());

        singlePagesPrinted = singlePrinter.printPages(2);
        System.out.println("pages printed was " + singlePagesPrinted + " new total print count for printer = "
                + singlePrinter.getPagesPrinted());
    }
}