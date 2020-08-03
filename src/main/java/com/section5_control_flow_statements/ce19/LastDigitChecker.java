package com.section5_control_flow_statements.ce19;

public class LastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);

        isValid(10);
        isValid(468);
        isValid(1051);
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if ((firstNum < 10 || firstNum > 1000) || (secondNum < 10 || secondNum > 1000)
                || (thirdNum < 10 || thirdNum > 1000)) {
            return false;
        }

        int mod1 = firstNum % 10;
        int num1 = firstNum /= 10;
        int mod2 = secondNum % 10;
        int num2 = secondNum / 10;
        int mod3 = thirdNum % 10;
        int num3 = thirdNum / 10;

        return num1 == num2 || num1 == num3 || num2 == num3 || num1 == mod2 || num1 == mod3 || num2 == mod1
                || num2 == mod3 || num3 == mod1 || num3 == mod2 || mod1 == mod2 || mod1 == mod3 || mod2 == mod3;
    }

    public static boolean isValid(int num) {
        return num >= 10 || num <= 1000;
    }

}