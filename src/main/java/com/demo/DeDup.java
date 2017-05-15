package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Shikha
 *
 */
public class DeDup {

	/**
	 * Positive : Performance will be good with small size array. Negative : for
	 * large size array directly effecting system performance because of
	 * internally position shifting.
	 * 
	 * @param arr
	 * @return Array with Unique elements.
	 */

	public int[] eliminateArrayDuplicates(int[] inputArray) {
		int count = 0;

		if (inputArray != null) {
			count = inputArray.length;

			for (int i = 0; i < count; i++) {

				// Loop for comparing value with next value and so on..
				for (int j = i + 1; j < count; j++) {
					if (inputArray[i] == inputArray[j]) {
						int shiftLeft = j;

						// left shifting in array after finding duplicate
						for (int k = j + 1; k < count; k++, shiftLeft++) {
							inputArray[shiftLeft] = inputArray[k];
						}
						count--;
						j--;
					}
				}
			}
		}

		// Copy unique value from temp into result
		int[] resultArray = new int[count];
		for (int i = 0; i < count; i++) {
			resultArray[i] = inputArray[i];
		}

		return resultArray;
	}

	/**
	 * Positive : No much changes in internal structure of original array as
	 * well as maintaining original insertion order. Negative : Default
	 * initialization of result array with input array size and manipulation in
	 * size of result array
	 * 
	 * @param arr
	 * @return Array with Unique elements.
	 */

	public int[] removeArrayDuplicates(int[] inputArray) {

		int count = 0;
		int[] tempArray = null;
		int[] resultArray = null;
		if (inputArray != null) {
			// Temp array
			tempArray = new int[inputArray.length];

			for (int i = 0; i < inputArray.length; i++) {
				boolean exists = false;

				// Loop to find duplicate existences in temp array
				for (int j = 0; j < tempArray.length; j++) {
					if (tempArray[j] == inputArray[i]) {
						exists = true;
					}
				}

				// Set unique value in temp array
				if (!exists) {
					tempArray[count] = inputArray[i];
					count++;
				}
			}

			// Copy unique value from temp into result
			resultArray = new int[count];
			System.arraycopy(tempArray, 0, resultArray, 0, count);
		}

		return resultArray;
	}

	/**
	 * 
	 * Positive : Highly efficient with large size of array as time complexity
	 * with Set is o(N). Negative : does not guarantee order of elements
	 * returned.
	 * 
	 * @param arr
	 * @return Array with Unique elements.
	 */

	public int[] eliminateDuplicates(int[] inputArray) {

		int[] resultArray = null;
		if (inputArray != null) {
			Set<Integer> myset = new HashSet<Integer>();

			// remove duplicate
			for (int i = 0; i < inputArray.length; i++) {
				myset.add(inputArray[i]);
			}

			// Copy unique values into the result.
			resultArray = new int[myset.size()];
			Iterator itr = myset.iterator();
			int count = 0;
			while (itr.hasNext()) {
				resultArray[count] = ((Integer) itr.next()).intValue();
				count++;
			}
		}

        // return value
		return resultArray;
	}

}
