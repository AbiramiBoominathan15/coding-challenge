package com.arrayprogram;

//Given an array of integers, how would you find the two numbers that sum up to a specific target value?

public class ArraySum {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {

			// target value=3;

			if (a[i] > 3)

				System.out.println(a[i]);
			else
				System.out.println("invalid data");

		}

	}

}
