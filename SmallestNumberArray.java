package com.codingchallenge;

import java.util.Arrays;

public class SmallestNumberArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 14, 9, 2, 11, 7, 6, 15};

        int k = 3;

        int[] kLargest = findKLargest(array, k);

        System.out.println("The " + k + " largest elements are: " + Arrays.toString(kLargest));
    }

    public static int[] findKLargest(int[] array, int k) {
        Arrays.sort(array);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[array.length - k + i];
        }

        return result;
    }
}
