/*	Chapter 7.11 The Selection Sort and the Binary Search Algorithms

	--> a sorting algorithm is used to arrange data into some order while a search algorithm locates a specific item in a larger collection of data
	--> the selection sort and the binary search are popular sorting and searching algorithms
	--> the selection sort works like this; the smallest value in the array is located and moved to element 0; then the next smallest value is
		located and moved to element 1; and the process continues until all of the elements have been placed in their proper order
	--> the sequential search algorithm is relatively easy to use, understand and implement, compared to the binary search algorithm. Moreso, it doesn't require the
		data to be stored in any particular order. However, it's inefficient, especially when handling large arrays if speed is important
	--> the binary search is a clever algorithm that is much more efficient than the sequential search. It's only requirement is that the values in the array must be
		sorted in ascending order. This algorithm starts testing with the element in the middle, instead of the array's first element
	--> if the element happens to contain the desired value, the search is over. Otherwise, the value in the middle element would be greater than or less than the
		the desired value, thereby, half of the array's elements would be eliminated from further searching
	--> the procedure is repeated for the half of the array that potentially contains the value
	--> the algorithm uses the first, last and middle variables to mark positions within the array.

*/

import java.util.Scanner;

public class Medium711 {

	public static void main(String[] sth) {
		int[] rr = { 5, 7, 3, 8, 9, 1, 14, 2, 18, 19, 17 };
		for (int i = 0; i < rr.length; i++) {
			System.out.printf(rr[i] + " ");
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("\nSorting...\n");
		selectionSort(rr);
		for (int i = 0; i < rr.length; i++) {
			System.out.printf(rr[i] + " ");
		}
		System.out.println("\nDo you wish to search for a value in the array? if no, enter -1, if yes, enter the value...");
		int value = sc.nextInt();
		if (value == -1)
			System.exit(0);
		else {
			int result = binarySearch(rr, value);
			if (result == -1)
				System.out.println("Your value wasn't found");
			else
				System.out.println("Your value is in element number " + result);
		}
	}

	/**illustrates the selection sort algorithm*/
	public static void selectionSort(int[] arr) {
		int index, substitute;
		for (int r = 0; r < (arr.length - 1); r++) {
			index = r;
			substitute = arr[r];
			for (int i = (r + 1); i < arr.length; i++) {
				if (arr[i] < arr[r]) {
					index = i;
					arr[r] = arr[i];
				}
			}
			arr[index] = substitute;
		}
	}

	/**illustrates the binary search algorithm*/
	public static int binarySearch(int[]arr, int v) {
		int last = arr.length - 1;
		int middle;
		int first = 0;
		int returnValue = -1;
		boolean notFound = true;
		while (notFound && first <= last) {
			middle = (first + last) / 2;
			if (arr[middle] == v) {
				notFound = false;
				returnValue = middle;
			} else if (arr[middle] < v)
				first = middle + 1;
			else
				last = middle - 1;
		}
		return returnValue;
	}
}
