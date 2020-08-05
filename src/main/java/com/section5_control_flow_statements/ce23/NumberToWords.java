package com.section5_control_flow_statements.ce23;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversed = reverse(number);
            if (reversed == 0) {
                System.out.println("Zero");
            }
            while (reversed != 0) {
                int lsd = reversed % 10;
                reversed /= 10;
                switch (lsd) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Other");
                        break;
                }
            }
            int difference = getDigitCount(number) - getDigitCount(reverse(number));
            if (difference > 0) {
                for (int i = 1; i <= difference; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    private static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    private static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number >= 0 && number <= 9) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}