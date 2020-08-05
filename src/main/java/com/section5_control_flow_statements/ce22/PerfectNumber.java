package com.section5_control_flow_statements.ce22;

public class PerfectNumber {

    public static void main(String[] args) {
        isPerfectNumber(-1);
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        if (num < 1) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num ? true : false;
    }

}