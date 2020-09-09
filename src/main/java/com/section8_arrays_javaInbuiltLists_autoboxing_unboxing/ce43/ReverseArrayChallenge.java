package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce43;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();

        int[] nonReversedArray = nonReverseArray(size);
        System.out.println("Non Reversed Array: " + Arrays.toString(nonReversedArray));

        int[] reversedArray = reverse(nonReversedArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

    }

    private static int[] nonReverseArray(int size) {
        int[] inputIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            inputIntegers[i] = scanner.nextInt();
        }
        return inputIntegers;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        int j = array.length;

        for (int i = 0; i < array.length; i++) {
            reverse[j - 1] = array[i];
            j -= 1;
        }
        return reverse;
    }
}
