package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce41;

import java.util.Scanner;

public class SortArrays {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of the array that is to be created::");
        int size = scanner.nextInt();

        int[] myArray = getInteger(size);
        printArray(myArray);

        sortIntegers(myArray);
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

    private static void sortIntegers(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        System.out.println("Sort Array elements in descending order::");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}