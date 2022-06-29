/* Chapter 7.2 Processing Array Elements

	--> individual array elements are processed like any other type of variable e.g.
			grossPay = hours[3] * payRate;
			++score[2];					//pre-increment operation
			if (cost[20] < cost[0])				//relational expressions
	--> each array in Java has a public field named length that contains the number of elements in the array e.g.
			double[] temperatures = new double[25];
			int size = temperatures.length;			//25 is assigned to the variable size
	--> the length field is useful when processing the entire contents of an array; the value of an array's length field cannot change
	--> Java provides an enhanced for loop that simplifies array processing. The general format is:
			for (dataType elementVariable : array)
				statement;
	--> this loop iterates once for every element in an array. Each time the loop iterates, it copies an array element to a variable
			dataType elementVariable - is a variable declaration. This variable receives a value of a different array element during each loop
					iteration. The variable and the array elements should be of compatible data types
			array - refers to an array on which the loop would operate on. The loop iterates once for every element in the array
	--> the enhanced for loop is used when accessing the values stored in an array from the first element to the last, making it better than the
		the traditional for loop. However, the enhanced for loop can be inadequate, such as in the following circumstances:
			+ if intending to change the contents of an array element
			+ if intending to work through the array elements in reverse order
			+ if intending to access some of the array elements, but not all of them
			+ if intending to simultaneously work with two or more arrays within the loop
			+ if one intends to refer to the subscript number of a particular element
	--> it's possible to reassign an array reference variable to a different array, as demonstrated below;
			int[] numbers = new int[10];
			numbers = new int[5];		\\numbers has reassigned to a new array, making the 10-element array no longer referenced, thus inaccessible
	--> when copying arrays, there's a distinction between an array and the variable that references it i.e.
			int[] array1 = {2, 4, 5, 10};
			int[] array2 = array1;		\\makes a copy of the address stored in array1 and stores it in array2; both now reference the same array
	--> that type of assignment operation is called a reference copy. Regardless of which variable a program uses, it's working with the same array
	--> to copy an array, the individual elements of one array are copied to another, usually best achieved with a loop e.g.
			int[] firstArray = { 5, 10, 14, 20, 25 };
			int[] secondArray = new int[5];
			for (int i = 0; i < firstArray.length; i++)
				secondArray[i] = firstArray[i];
*/

import java.util.Scanner;

public class Medium702 {
	
	public static void main(String[] sth) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHow many tests do you have?");
		int tests = sc.nextInt();
		int[] score = new int[tests];

		for (int index = 0; index < score.length; index++) {
			System.out.print("Enter test score " + (index + 1) + ": ");
			score[index] = sc.nextInt();
		}
		System.out.println("\nHere are the scores you entered:");
		for (int i : score)
			System.out.print(i + " ");
	}
}
