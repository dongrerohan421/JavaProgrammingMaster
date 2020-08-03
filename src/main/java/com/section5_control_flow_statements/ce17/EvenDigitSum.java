package com.section5_control_flow_statements.ce17;

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(252);
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int lastDigit;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }
}