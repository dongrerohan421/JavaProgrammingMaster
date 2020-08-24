package com.section7_composition_encapsulation_polymorphism.ce40;

public class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Delux", "White", "Sausage & Bacon", 14.54);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.18);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add an additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add an additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add an additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add an additional item to delux burger");
    }

}