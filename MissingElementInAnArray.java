package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = new int[] { 1, 2, 3, 4, 7, 6, 8 };
		int i;
		// Sort the array
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		for (i = 0; i < arr.length; i++) {
			// print the number
			System.out.println(arr[i]);
			// once printed break the iteration
			if (i > arr.length) {
				break;
			}

		}

	}

}
