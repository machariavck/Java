/* Chapter 4.9 Deciding Which Loop to Use

	--> the 'while' loop is ideal when you don't want the loop to iterate if the condition is false from the beginning; also ideal when a 
		sentinel value is used to terminate the loop
	--> the 'do-while' loop is ideal in situations where the loop is to iterate at least once
	--> the 'for' loop contains built-in expressions (initialization, testing and updating) which make it very convenient to use a loop
		control variable as a counter; ideal when an exact number of iterations is known

*/

public class Simple409 {
	public static void main(String[] sth) {
		int rowS, columnS;
		for (columnS = 1; columnS <= 8; columnS++) {
			for (rowS = 1; rowS < columnS; rowS++) {
				System.out.print("  ");
			}
			System.out.println("#");
		}
	}
}
