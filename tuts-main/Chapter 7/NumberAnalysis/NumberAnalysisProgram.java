import java.util.*;
import java.io.*;

public class NumberAnalysisProgram {

	public static void main(String[] sth) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Number Analysis Program. Press OK to continue..");
		sc.nextLine();
		System.out.println("Enter the name of a file that contains numbers and then we analyse them");
		String n = sc.nextLine();
		NumberAnalysis na = new NumberAnalysis(n);
		System.out.print("\nThe file has the following numbers: ");
		na.getNumbers();
		System.out.println("\n\nThe numbers total to " + na.getTotal());
		System.out.println("\nThe average of the numbers is " + na.getAverage());
		System.out.println("\nThe lowest number is " + na.getLowest());
		System.out.println("\nThe highest number is " + na.getHighest());
	}
}	