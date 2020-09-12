package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce44;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private static final boolean FALSE = false;
    private static final boolean TRUE = true;
    private String name;
    private List<Contact> contacts;

    public MobilePhone(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    // show contact list
    public void printContactList() {
        for (Contact contact : contacts) {
            if (contacts.isEmpty()) {
                System.out.println("Contact list is empty!");
            }
            System.out.println(contact.getName() + " : " + contact.getPhoneNumber());
        }
    }

    // add - only add when there's no existing contact
    // need to type in name and number to create Contact in parameter
    public boolean addContact(Contact contact) {
        if (!existingContact(contact)) {
            contacts.add(contact);
            System.out.println("New contact added!");
            return TRUE;
        }
        System.out.println(name + " already exists!");
        return FALSE;
    }

    // update - (boolean) replace oldOne with newOne
    // only if oldOne is an existing contact & newOne is not an existing Contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (existingContact(oldContact) && !existingContact(newContact)) {
            int position = findContact(oldContact);
            contacts.set(position, newContact);
            System.out.println("Update successful!");
            return TRUE;
        }
        System.out.println("Error updating!");
        return FALSE;
    }

    // remove
    public boolean removeContact(Contact contact) {
        if (contacts.remove(contact)) {
            System.out.println("Deletion successful!");
            return TRUE;
        }
        System.out.println("Error deleting!");
        return FALSE;
    }

    // query - search by Contact and return boolean
    public boolean existingContact(Contact contact) {
        return contacts.contains(contact) ? TRUE : FALSE;
    }

    // search by name and return position
    public boolean existingContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return TRUE;
            }
        }
        return FALSE;
    }

    // search by Contact return position
    public int findContact(Contact contact) {
        if (existingContact(contact)) {
            return contacts.indexOf(contact);
        }
        return -1;
    }

    // search by name and return contact
    public Contact findContact(String name) {
        if (existingContact(name)) {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public void printMenu() {
        System.out.println("Mobile phone contacts\n" + "0 - Quit application\n" + "1 - Show contact list\n"
                + "2 - Add new contact\n" + "3 - Update contact\n" + "4 - Remove contact\n" + "5 - Find contact");
    }
}
