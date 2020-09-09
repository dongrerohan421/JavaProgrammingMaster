package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce42;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] readInteger = readInteger(count);
        System.out.println("Entered array is: " + Arrays.toString(readInteger));

        System.out.println("Minimum value is: " + findMin(readInteger));
    }

    public static int[] readInteger(int count) {
        int[] inputIntegers = new int[count];
        for (int i = 0; i < inputIntegers.length; i++) {
            System.out.print("Enter a number: ");
            inputIntegers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return inputIntegers;
    }

    public static int findMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}
