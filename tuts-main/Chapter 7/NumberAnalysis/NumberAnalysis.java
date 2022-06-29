import java.util.*;
import java.io.*;

public class NumberAnalysis {
	
	private int[] arr;
	private int index;
	
	public NumberAnalysis(String g) throws IOException {
		arr = new int[100];
		File of = new File(g);
		if (!of.exists()) {
			System.out.println("That file doesn't exist. Bye.");
			System.exit(0);
		}
		Scanner sc = new Scanner(of);
		index = 0;
		while (sc.hasNext() && index < arr.length) {
			arr[index] = sc.nextInt();
			index++;
		}
	}

	public void getNumbers() {
		for (int i = 0; i < index; i++)
			System.out.print(arr[i] + " ");
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < index; i++)
			total += arr[i];
		return total;
	}

	public int getAverage() {
		return (int)(getTotal() * 1.0 / index);
	}

	public int getHighest() {
		int highest = arr[0];
		for (int i = 0; i < index; i++) {
			if (arr[i] > highest)
				highest = arr[i];
		}
		return highest;
	}

	public int getLowest() {
		int lowest = arr[0];
		for  (int i = 0; i < index; i++) {
			if (arr[i] < lowest)
				lowest = arr[i];
		}
		return lowest;
	}
}
			