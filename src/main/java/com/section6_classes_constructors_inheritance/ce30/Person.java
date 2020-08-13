package com.section6_classes_constructors_inheritance.ce30;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lasttName) {
        this.lastName = lasttName;
    }

    public int getAge() {
        if (age < 0 || age > 100)
            age = 0;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20) ? true : false;
    }

    public String getFullName() {
        if (firstName.isEmpty())
            return lastName;
        if (lastName.isEmpty())
            return firstName;
        return firstName + " " + lastName;
    }
}