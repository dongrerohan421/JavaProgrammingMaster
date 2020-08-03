package com.section5_control_flow_statements.ce18;

public class SharedDigit {

    public static void main(final String[] args) {
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
            return false;
        }
        int mod1 = firstNum % 10;
        int num1 = firstNum /= 10;
        int mod2 = secondNum % 10;
        int num2 = secondNum / 10;

        return num1 == num2 || num1 == mod2 || num2 == mod1 || mod2 == mod1;
    }
}
