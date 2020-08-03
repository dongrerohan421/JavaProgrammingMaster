package com.section5_control_flow_statements.ce20;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10)
            return -1;

        int upto = firstNum < secondNum ? firstNum : secondNum;
        int gcd = -1;

        for (int i = 1; i < upto; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}