package com.section7_composition_encapsulation_polymorphism.ce40;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
        hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Lettuce", 0.27);
        hamburger.addHamburgerAddition2("Cheese", 0.75);
        hamburger.addHamburgerAddition3("Tomatto", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.67);
        healthyHamburger.addHamburgerAddition1("Egg", 5.67);
        healthyHamburger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyHamburger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total delux burger price is " + deluxBurger.itemizeHamburger());
    }
}