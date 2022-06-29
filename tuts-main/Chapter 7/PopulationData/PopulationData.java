import java.io.*;
import java.util.*;


public class PopulationData {

	public static void main(String[] sth) throws IOException {
		int[] arr = new int[41];
		File of = new File("USPopulation.txt");
		Scanner sc = new Scanner(of);
		int index = 0;
		while (sc.hasNext() && index < arr.length) {
			arr[index] = sc.nextInt();
			index++;
		}
		sc.close();
		//display annual average change in population
		int change = 0;
		int p = arr[0];
		for (int i : arr) {
			change += (i - p);
			p = i;
		}
		int average = (int)(change * 1.0/(arr.length - 1));
		System.out.println("The annual average population change was " + average);
		//the year with the greatest increase in population
		change = 0;
		int highestChange = 0;
		int year = 1950;
		for (int i = 1; i < arr.length; i++) {
			change = arr[i] - arr[i - 1];
			if (change > highestChange) {
				highestChange = change;
				year = 1950 + i;
			}
		}
		System.out.println("The year with the greatest increase in population was " + year);
		//the year with the smallest increase in population
		change = 0;
		int leastChange = arr[40] - arr[0];
		year = 1950;
		for (int i = 1; i < arr.length; i++) {
			change = (arr[i] - arr[i - 1]);
			if (change < leastChange) {
				leastChange = change;
				year = 1950 + i;
			}
		}
		System.out.println("The year with the least increase in population was " + year);
	}
}