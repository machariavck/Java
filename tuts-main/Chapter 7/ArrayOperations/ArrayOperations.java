//simplest tutorial
public class ArrayOperations {
	public static void main(String[] sth) {
		int[] arr = { 3, 4, 5, 7, 10, 32, 52, 23, 93, 74, 22 };
		System.out.print("\nThe array has the values: ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println("\n\nThe total of the values in the array is " + getTotal(arr));
		System.out.println("\nThe average of the values in the array is " + getAverage(arr));
		System.out.println("\nThe lowest value in the array is " + getLowest(arr));
		System.out.println("\nThe highest value in the array is " + getHighest(arr));
	}

	public static int getTotal(int[] rr) {
		int total = 0;
		for (int i : rr)
			total += i;
		return total;
	}

	public static int getAverage(int[] tt) {
		return (int)(getTotal(tt) * 1.0 / tt.length);
	}

	public static int getHighest(int[] nn) {
		int highest = nn[0];
		for (int i : nn) {
			if (i > highest)
				highest = i;
		}
		return highest;
	}

	public static int getLowest(int[] ii) {
		int lowest = ii[0];
		for (int i : ii) {
			if (i < lowest)
				lowest = i;
		}
		return lowest;
	}
}