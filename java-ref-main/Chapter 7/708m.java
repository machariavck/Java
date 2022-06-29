/*	Chapter 7.8 The Sequential Search Algorithm

	--> a search algorithm is a method of locating a specific item in a larger collection of data
	--> the sequential search algorithm is a simple technique for searching the contents of an array
	--> it uses a loop to sequentially step through an array, starting with the first element
	--> it compares each element with the value being searched for and stops when the value is found or the end of the array is encountered

*/

import java.util.Scanner;

public class Medium708 {

	public static void main(String[] sth) {
		int[] scores = { 23, 84, 88, 92, 82, 66, 81, 33, 52, 49, 67, 73, 17, 16, 28, 29, 88 };
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHello. Which value do you want to search for bro?");
		int value = sc.nextInt();
		int result = searchForScore(scores, value);
		
		if (result == -1)
			System.out.println("Your value is not present in the array.\n");
		else
			System.out.println("Your value is in element number " + result);
	}


	public static int searchForScore(int[] arr, int v) {
		int flag = -1;
		boolean found = false;
		int i = 0;
		while (!found && i < arr.length) {
			if (arr[i] == v) {
				found = true;
				flag = i;
			}
			i++;
		}
		return flag;
	}
}
