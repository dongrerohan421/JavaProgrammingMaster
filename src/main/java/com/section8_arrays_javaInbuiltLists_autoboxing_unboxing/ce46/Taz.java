package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce46;

public class Taz {

    private int numberOfPerson = 0;
    private String[] storePerson = new String[4];

    public Boolean isEmpty() {
        return numberOfPerson == 0;
    }

    public void add(String person) {
        ++numberOfPerson;
        for (int i = 0; i < numberOfPerson; i++) {
            if (storePerson[i] == null) {
                storePerson[i] = person;
            }
        }
    }

    public int noOfPerson() {
        return numberOfPerson;
    }

    public boolean isOnboard(String person) {
        for (int i = 0; i < numberOfPerson; i++) {
            if (storePerson[i].equals(person)) {
                return true;
            }
        }
        return false;
    }

    public boolean removePerson(String person) {
        for (int i = 0; i < numberOfPerson; i++) {
            if (storePerson[i].equals(person)) {
                storePerson[--numberOfPerson] = storePerson[i + 1];
                return true;
            }
        }
        return false;
    }

}
