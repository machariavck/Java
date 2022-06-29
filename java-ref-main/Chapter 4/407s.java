/* Chapter 4.7 Nested Loops

	--> nested loops are necessary when a task performs a repetitive operation and that task itself must be repeated e.g. clock
	--> they can be used to print patterns

*/

public class Simple407 {
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
