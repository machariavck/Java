/* Chapter 7.4 Some Useful Array Algorithms and Operations

	--> just like you wouldn't copy an array by simply assigning its reference variable to another array's reference variable, you cannot use the ==
		operator to compare two array reference variables so as to determine whether the arrays are equal
	--> using the == operator with reference variables compares the memory addresses that the variables contain, not the objects' contents
	--> in order to compare the contents of two arrays, you must compare the elements of the two arrays, as shown in the comparingArrays method below
	--> to sum the values in a numeric array, you use a loop with an accumulator variable, as shown in the summingArray method below
	--> to get the average of the values in a numeric array, first you sum the values and save the total in an accumulator then divide that sum with
		the number of elements in the array, as shown in the gettingAverage method below
	--> the algorithm for finding the highest and lowest values in an array are very similar, and are demonstrated in the highestLowest method below
	--> sometimes, there can be partially filled arrays; where the actual number of items stored in an array is less than the number of elements
	--> to process a partially filled array, you must process only the elements containing valid data items. This is achieved using an accompanying
		integer that holds the number of items stored in the array. It is illustrated in the partiallyFilled method below. When passing a partially
		filled array as an argument to a method, the variable that holds the count of items in the array must also be passed as an argument
	--> saving the contents of an array to a file is a straightforward procedure, where a loop is used to step through each element of the array,
		writing its contents to the file, as illustrated in writeFile and readFile method
	
*/

import java.util.Scanner;
import java.io.*;

public class Medium704 {

	public static void main(String[] sth) throws IOException {
		highestLowest();
		gettingAverage();
		summingArray();
		comparingArrays();
		partiallyFilled();
		writeFile();
		readFile();
	}

	/**finding the highest and lowest values in a numeric array*/
	public static void highestLowest() {
		int[] numbers = { 54, 34, 73, 78, 29, 13, 53, 36, 77 };
		
		int highest = numbers[0];
		for (int i : numbers) {
			if (i > highest)
				highest = i;
		}
		System.out.println("The highest number is " + highest);

		int lowest = numbers[0];
		for (int i : numbers) {
			if (i < lowest)
				lowest = i;
		}
		System.out.println("The lowest number is " + lowest);
	}


	/**getting average of the values in a numeric array*/
	public static void gettingAverage() {
		double[] scores = { 54, 34, 73, 78, 29, 13, 53, 36, 77 };
		double total = 0;
		for (double i : scores)
			total += i;
		double average = total / scores.length;
		System.out.println("average: " + average);
	}

	/**summing values in a numeric array*/
	public static void summingArray() {
		int[] units = { 54, 34, 73, 78, 29, 13, 53, 36, 77 };
		int total = 0;
		for (int i : units)
			total += i;
		System.out.println("total: " + total);
	}

	/**comparing if two arrays are equal*/
	public static void comparingArrays() {
		int[] arr1 = { 2, 5, 6, 7, 8, 0 };
		int[] arr2 = { 2, 0, 6, 7, 8, 0 };

		boolean ifEqual = true;
		int index = 0;

		if (arr1.length != arr2.length)
			ifEqual = false;

		while (ifEqual && index < arr1.length) {
			if (arr1[index] != arr2[index])
				ifEqual = false;
			index++;
		}

		if (ifEqual)
			System.out.println("The arrays are equal");
		else
			System.out.println("The two arrays are not equal");
	}

	/**illustrating partially filled arrays*/
	public static void partiallyFilled() {
		final int ARRAY_SIZE = 100;
		int[] arr = new int[ARRAY_SIZE];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number or -1 to quit: ");
		int number = sc.nextInt();
		while (number != -1 && count < arr.length) {
			arr[count] = number;
			count++;
			System.out.println("Enter a number or -1 to quit: ");
			number = sc.nextInt();
		}
		
		for (int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}

	/**working with arrays and files*/
	public static void writeFile() throws IOException {
		int[] numbers = { 10, 20, 30, 40, 50 }
		PrintWriter wf = new PrintWriter("Values.txt");
		for (int i : numbers)
			wf.println(i);
		wf.close();
	}

	/**working with arrays and files*/
	public static void readFile() throws IOException {
		final int SIZE = 5;
		int[] numbers = new int[SIZE];
		int index = 0;
		
		File of = new File("Values.txt");
		Scanner sc = new Scanner(of);
		while (sc.hasNext() && index < numbers.length) {
				numbers[index] = sc.nextInt();
				index++;
		}
		sc.close();
	}
}
