import java.util.*;

public class LargerThanN {

	public static void main(String[] sth) {
		System.out.println("\nHello. Welcome to the larger than n program. Provide me with " +
				"values to fill up an array. Enter -1 when done..");
		Scanner sc = new Scanner(System.in);
		System.out.println("How big will your array be?");
		int size = sc.nextInt();
		while (size < 2 || size > 15) {
			System.out.println("Incorrect value. Try again..");
			size = sc.nextInt();
		}
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("Enter value for numbers[%d]: \n", i);
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter a number to see those numbers in the array greater than it");
		int value = sc.nextInt();
		meth(numbers, value);
	}

	public static void meth(int[] arr, int n) {
		System.out.printf("\nThe numbers greater than the number %d in the array are: \n", n);
		for (int i : arr) {
			if (i > n)
				System.out.print(i + " ");
		}
	}
}