/*	Chapter 7.9 Two-Dimensional Arrays

	--> a two-dimensional array is an array of arrays; can be thought of having rows and columns
	--> 2D arrays can hold multiple sets of data unlike 1D arrays which hold only one set of data
	--> to declare a 2D array, two sets of brackets and two size declarators are required i.e.
				double[][] scores = new double[3][4];		//3 rows, 4 columns
	--> to access one of the elements in a 2D array, both subscripts have to be used i.e.
				scores[2][1] = 95;
	--> when initializing a 2D array, each row's initialization list is enclosed in its own set of braces e.g.
				int[][] numbers = { { 1, 2, 3 },			row 0 has the values 1,2,3	
									{ 4, 5, 6 },			row 1 has the values 4,5,6
									{ 7, 8, 9 } }			row 2 has the values 7,8,9
	--> a 2d array has multiple length fields; one that holds the number of rows, and then each row has a length field that holds the number of columns
	--> an array's length fields provide a better approach to display all the elements of a 2D array
	--> to sum all the elements of a 2D array, a pair of nested loops can be used to add the contents of each element to an accumulator i.e. if you wish to sum the
		columns of a 2D array, you would nest two loops with the outer loop controlling the column subscript and the inner loop controlling the row subscript
	--> when passing a 2D array to a method, the parameter must be declared as a reference to a 2D array i.e.
			public static void showArr(int[][] arr)
	--> when the rows of a 2D array are of different lengths, the array is known as a ragged array. It's created by first creating a 2D array with a
		specific number of rows, but no columns e.g. int[][] ragged = new int[4][];
	--> the statement partially creates a 2D array, that can have four rows, but the columns haven't yet been created. Next, they can be created as follows;
			ragged[0] = new int[3];		-> row 0 has 3 columns
			ragged[1] = new int[4];		-> row 1 has 4 columns
			ragged[2] = new int[5];		-> row 2 has 5 columns
			ragged[3] = new int[6];		-> row 3 has 6 columns	
	--> to display the number of columns in each row;
					for (int i = 0; i < ragged.length; i++)
						System.out.println("The number of columns in row " + i + " is " + ragged[i].length);

*/

import java.util.Scanner;

public class Medium709 {

	public static void main(String[] sth) {
		using2Darrays();
		displayLengthFields();
	}

	/**shows accessing and displaying 2D arrays*/
	public static void using2Darrays() {
		final int DIVS = 3;
		final int QTRS = 4;
		double totalSales = 0.0;
		double[][] sales = new double[DIVS][QTRS];
		Scanner sc = new Scanner(System.in);
		System.out.println("This program calculates the total sales of the company's divisions. Enter the following sales data:");
		for (int r = 0; r < DIVS; r++) {
			for (int c = 0; c < QTRS; c++) {
				System.out.printf("Division %d, Quarter %d: KES ", (r + 1), (c + 1));
				sales[r][c] = sc.nextDouble();
			}
			System.out.println();
		}
		for (int r = 0; r < sales.length; r++) {
			double total = 0;
			for (int c = 0; c < sales[r].length; c++) { 
				total += sales[r][c];
			}
			System.out.printf("The sales of division %d are KES %,.1f\n", (r + 1), total);
			totalSales += total;
		}
		System.out.printf("Total Company Sales: KES %,.1f\n", totalSales);
	}

	/**shows the length fields in a 2D array*/
	public static void displayLengthFields() {
		int[][] numbers = { { 1, 2, 3, 4 },
							{ 5, 6, 7, 8 },
							{ 9, 10, 11, 12 } };
		showArray(numbers);
		System.out.println("The number of rows is " + numbers.length);
		for (int i = 0; i < numbers.length; i++)
			System.out.println("The number of columns in row " + (i + 1) + " is " + numbers[i].length);
	}

	/**passing a 2D array to a method*/
	public static void showArray(int[][] arr) {
		System.out.println("Here are the values in the array");
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
