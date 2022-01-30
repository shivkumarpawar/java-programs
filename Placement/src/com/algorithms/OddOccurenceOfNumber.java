/* this is the program in which we have to print the number which is 
 *  occurring odd number of time in the array
 * 
   @author shiv kumar
 
 */

package com.algorithms;

import java.util.*;

public class OddOccurenceOfNumber {
	int arraySize;

	public static void main(String[] args) {

		OddOccurenceOfNumber m = new OddOccurenceOfNumber();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size and elemnts in an array");
		m.arraySize = sc.nextInt();

		int[] myArray = new int[m.arraySize];

		for (int i = 0; i < m.arraySize; i++) {
			System.out.println("Enter the" + i + 1 + "th number in array ");
			int inputNumber = sc.nextInt();
			myArray[i] = inputNumber;
		}
		int Number = m.getOddOccurringNumber(myArray, m.arraySize);
		System.out.println("The odd occurring number is  " + Number);

	}

	int getOddOccurringNumber(int[] myArray, int arraySize) {

		int res = 0;

		for (int i = 0; i < arraySize; i++)
			res = res ^ myArray[i];

		return res;
	}
}
