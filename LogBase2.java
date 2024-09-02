package com.codingchallenge;

public class LogBase2 {
    public static void main(String[] args) {
        int number = 2350;

        int result = logBase2(number);

        System.out.println("Original Number: " + number);
        System.out.println("Result: " + result);
    }

    public static int logBase2(int num) {
        int log = 0;

        while (num > 1) {
            num /= 2;
            log++;
        }

        return log;
    }
}
