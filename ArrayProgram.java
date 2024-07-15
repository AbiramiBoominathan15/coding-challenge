package com.arrayprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ArrayProgram {
	public static void main(String[] args) {

		int n = 5, temp;
		int a[] = { 1, 4, 7, 3, 2 };
		int i, j;
		System.out.println(Arrays.toString(a));
 
	for (i = 0; i < n - 1; i++) {
			for (j = 1; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		System.out.println("\nSorted array:");
		System.out.println(Arrays.toString(a));

	}
}

/*
 * int b[] = new int[] { 1, 2, 3 }; System.out.println(Arrays.toString(b));
 */
/*
 * String fruit[]=new String[] {"apple","orange","Mango"};
 * System.out.println(Arrays.toString(fruit)); System.out.println(fruit.length);
 * //reverse of the String for(String i:fruit) { System.out.println(i); }
 */
/*
 * byte []c=new byte[] {2,5,6,7,8}; for(int i=0;i<c.length;i++) {
 * System.out.println(c[i]); }
 * 
 * 
 * 
 * byte[] byteArr = { 10, 20, 30, 13 };
 * 
 * System.out.print("Byte Array: "); for (int i = 0; i < byteArr.length; i++) {
 * System.out.print(byteArr[i] + " "); }
 * 
 * System.out.print("]\nCopied Array: \n");
 * 
 * // Create copy of the array of same size byte[] byteArrCopy =
 * Arrays.copyOfRange(byteArr, 0, 4);
 * 
 * System.out.print("Byte Array: ["); for (int i = 0; i < byteArrCopy.length;
 * i++) { System.out.print(byteArrCopy[i] + " "); } System.out.print("]"); char
 * []arr1= {'a','b','c'}; char[]arr2= {'a','b','c'}; boolean
 * arr3=Arrays.equals(arr1, arr2); System.out.println(arr3);
 * 
 * 
 * //fill using char val char f[]= {'a','b','c'}; char replacement='z';
 * Arrays.fill(f, replacement); System.out.println(f); double m[]=new double[]
 * {2.4,4.6}; int n = m.hashCode(); System.out.println(n);
 * 
 * byte byteArr3[] = {10,20,15,22,35};
 * 
 * // sorting array Arrays.sort(byteArr3);
 * System.out.println("The sorted byte array is:"); for (byte number : byteArr3)
 * { System.out.println("Number = " + number); }
 * 
 * // entering the value to be searched byte searchVal = 35; int retVal =
 * Arrays.binarySearch(byteArr3,searchVal);
 * System.out.println("The index of element 35 is : " + retVal); }
 */
