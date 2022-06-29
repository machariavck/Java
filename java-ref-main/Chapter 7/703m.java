/* Chapter 7.3 Passing Arrays as Arguments to Methods

	--> arrays are commonly passed as arguments to a method
	--> when a single array element is passed to a method, it's handled like any other variable as shown below
	--> if the method was to accept the entire array as an argument, the parameter would be declared as an array reference variable
	--> and thus the argument would be an array, not a single value
	--> passing an entire array into a method is similar to passing an object into a method. The actual array itself isn't passed, but a reference
		to the array is passed into the parameter. Consequently, this means the method has direct access to the original array

*/

import java.util.Scanner;

public class Medium703 {
	
	public static void main(String[] sth) {

		final int ARRAY_SIZE = 4;
		int[] numbers = new int[ARRAY_SIZE];
		
		getValues(numbers);
		
		System.out.println("Here are the numbers that you entered:");
		
		for (int i = 0; i < numbers.length; i++) 
			showValue(numbers[i]);
		
		showArray(numbers);
	}
	
	private static void getValues(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + arr.length + " numbers.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": " );
			arr[i] = sc.nextInt();
		}
	}
	
	/**illustrates when each array element is passed as an argument to the parameter n which is an integer variable */
	public static void showValue(int n) {
		System.out.print(n + " ");
	}
	
	/** illustrates when the numbers array is passed as an argument to the parameter arr which is an array reference variable*/
	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
