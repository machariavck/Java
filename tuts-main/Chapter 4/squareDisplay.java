
import java.util.Scanner;
import java.util.Random;

public class squareDisplay {
	public static void main(String[] sth) {
		System.out.println("Hello. Provide me with a positive integer, no greater than 15 and I'll print a proportional square.");
		Scanner userInput = new Scanner(System.in);
		int lineNo = userInput.nextInt();
		while (lineNo > 15 || lineNo < 1) {
			System.out.println("Incorrect number provided. Please try again.");
			lineNo = userInput.nextInt();
		}
		for (int x = 1; x <= lineNo; x++) {
			for (int y = 1; y <= lineNo; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
