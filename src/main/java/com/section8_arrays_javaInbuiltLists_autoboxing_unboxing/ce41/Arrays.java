package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce41;

import java.util.Scanner;

public class Arrays {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of the array that is to be created::");
        int size = scanner.nextInt();

        int[] myArray = getInteger(size);
        printArray(myArray);
    }

    public static int[] getInteger(int number) {

        System.out.println("Enter " + number + " values\r");
        int[] inputIntegers = new int[number];
        for (int i = 0; i < inputIntegers.length; i++) {
            inputIntegers[i] = scanner.nextInt();
        }

        return inputIntegers;
    }

    public static int[] printArray(int[] array) {
        int[] myArray = array;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " enter value " + myArray[i]);
        }

        return myArray;
    }
}