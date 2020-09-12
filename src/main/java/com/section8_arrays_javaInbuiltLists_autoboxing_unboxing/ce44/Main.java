package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce44;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("iPhone X");
    private static String CONTACT_NAME = "Enter contact name: ";

    public static void main(String[] args) {
        mobilePhone.printMenu();

        boolean quit = false;

        while (!quit) {
            System.out.println("Enter your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("You've left the application!");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    public static void addNewContact() {
        System.out.println(CONTACT_NAME);
        String name = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);

        mobilePhone.addContact(contact);
    }

    public static void updateContact() {
        System.out.println(CONTACT_NAME);
        String existingName = scanner.nextLine();
        Contact oldContact = mobilePhone.findContact(existingName);

        if (oldContact == null) {
            System.out.println("Contact not found");
        }

        System.out.println(CONTACT_NAME);
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();

        Contact newContact = new Contact(newName, newPhoneNumber);

        mobilePhone.updateContact(oldContact, newContact);
    }

    public static void removeContact() {
        System.out.println(CONTACT_NAME);
        String name = scanner.nextLine();
        Contact deleteContact = mobilePhone.findContact(name);

        mobilePhone.removeContact(deleteContact);
    }

    private static void findContact() {
        System.out.println(CONTACT_NAME);
        String name = scanner.nextLine();
        mobilePhone.findContact(name);
        System.out.println(name + " is in the list!");
    }

}
