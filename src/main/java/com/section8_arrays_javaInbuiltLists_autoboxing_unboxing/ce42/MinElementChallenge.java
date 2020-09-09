package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce42;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {

        int[] readInteger = readInteger(5);
        System.out.println(Arrays.toString(readInteger));

        System.out.println("Minimum value is: " + findMin(readInteger));
    }

    public static int[] readInteger(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] inputIntegers = new int[count];
        for (int i = 0; i < inputIntegers.length; i++) {
            inputIntegers[i] = scanner.nextInt();
        }
        scanner.close();
        return inputIntegers;
    }

    public static int findMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}
