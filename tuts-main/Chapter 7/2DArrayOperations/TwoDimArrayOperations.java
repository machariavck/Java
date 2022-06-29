import java.util.*;

public class TwoDimArrayOperations {

	public static void main(String[] sth) {
		int[][] arr = new int[4][4];
		//assign values into array
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++)
				arr[i][c] = r.nextInt(9) + 1;
		}
		//print array
		System.out.println("Here are your array values");
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++)
				System.out.print(arr[x][y]);
			System.out.println();
		}
		System.out.println("============================");
		//print total
		System.out.println("The total is " + getTotal(arr));
		//print average
		System.out.printf("The average is %.2f\n", getAverage(arr));
		//print random row total
		int row = r.nextInt(arr.length);
		System.out.println("The total of values in row " + (row + 1) + " is " + getRowTotal(arr, row));
		//print random column total
		int col = r.nextInt(arr.length);
		System.out.println("The total of values in column " + (col + 1) + " is " + getColumnTotal(arr, col));
		//get highest in row
		row = r.nextInt(arr.length);
		System.out.println("The highest in row " + (row + 1) + " is " + getHighestInRow(arr, row));
		//get lowest in row
		row = r.nextInt(arr.length);
		System.out.println("The lowest in row " + (row + 1) + " is " + getLowestInRow(arr, row));
	}

	public static int getTotal(int[][] t) {
		int total = 0;
		for (int r = 0; r < t.length; r++) {
			for (int c = 0; c < t[r].length; c++)
				total += t[r][c];
		}
		return total;
	}

	public static double getAverage(int[][] t) {
		int allValues = 0;
		for (int r = 0; r < t.length; r++)
				allValues += t[r].length;
		return getTotal(t) * 1.0 / allValues;
	}

	public static int getRowTotal(int[][] t, int n) {
		int total = 0;
		for (int c = 0; c < t[n].length; c++)
			total += t[n][c];
		return total;
	}

	public static int getColumnTotal(int[][] t, int n) {
		int total = 0;
		for (int r = 0; r < t.length; r++)
			total += t[r][n];
		return total;
	}

	public static int getHighestInRow(int[][] t, int n) {
		int highest = 0;
		for (int c = 1; c < t[n].length; c++) {
			if (t[n][c] > highest)
				highest = t[n][c];
		}
		return highest;
	}

	public static int getLowestInRow(int[][] t, int n) {
		int lowest = t[n][0];
		for (int c = 1; c < t[n].length; c++) {
			if (t[n][c] < lowest)
				lowest = t[n][c];
		}
		return lowest;
	}
}

