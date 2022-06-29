import java.io.*;
import java.util.*;

public class WorldSeriesChampions {

	public static void main(String[] sth) throws IOException {
		System.out.println("\nHello user. Enter the name of a team. I'll display the number of times that team has won the World Series in the time period from 1903 through 2009.");
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		File of = new File("WorldSeriesWinners.txt");
		Scanner scf = new Scanner(of);
		ArrayList<String> winners = new ArrayList<>();
		while (scf.hasNext())
			winners.add(scf.nextLine());
		int count = 0;
		for (String n : winners) {
			if (g.equalsIgnoreCase(n))
				count++;
		}
		System.out.printf("The team has won " + count + " times from 1903 through 2009.");
	}
}