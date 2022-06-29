/* Chapter 4.8 The 'break' and 'continue' Statements (Optional)

	--> the 'break' statement causes a loop to terminate early
	--> it's perfectly acceptable to use the break statement in a switch statement, but a taboo to use it in a loop (should be avoided)
	--> the 'continue' statement causes a loop to stop its current iteration and begin the next one
	--> when 'continue' is encountered, all the statements in the body of the loop that appear after it are ignored, and the loop
		prepares for the next iteration
	--> the 'continue' statement should also be avoided; like the break statement, it bypasses the loop's logic and makes the code
		difficult to understand and debug

*/

public class Simple408 {
	public static void main(String[] sth) {
		int rowS, columnS;
		for (columnS = 1; columnS < 11; columnS++) {
			System.out.print("|");
			for (rowS = 0; rowS < columnS; rowS++) {
				System.out.print("|_|");
			}
			System.out.println("|_||");
		}
	}
}
