package com.section6_classes_constructors_inheritance.ce30;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);

        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);

        person.setLastName("Smith"); // lastName is set to Smith
    }
}