package com.codingchallenge;

import java.util.Arrays;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 14, 9, 2, 11, 7, 6, 15};

        int k = 3;

        Arrays.sort(array);

        System.out.print("The " + k + " largest elements are: ");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
