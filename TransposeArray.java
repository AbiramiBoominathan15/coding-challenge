package com.codingchallenge;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] originalArray = {
            {10, 20, 30},
            {40, 50, 60}
        };

        int rows = originalArray.length;
        int cols = originalArray[0].length;
        
        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("After changing the rows and columns of the said array:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
