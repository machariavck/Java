/* Chapter 3.9 The Switch Statement

	--> it allows the value of a variable or expression determine where the program will branch to
	--> it is a multiple alternative decision structure
			switch (testExpression) {		//testExpression is a variable or an expression that gives a char, byte, short, int or string value
					case value_1:
							//block of statements
							break;				//when this is encountered, the program jumps out of the switch statement
					case value_N:
							//block of statements
							break;
					default:					//executes if the testExpression is not equal to any of the case values; it's optional
							//block of statements
							break;				//for the default case, this is optional
			}
	--> the switch statement can be used as an alternative to the if-else-if statement
	--> without the break statement, the program would execute all of the statements below the matching case statement. This is useful at times.

*/

import java.util.Scanner;

public class Simple309 {

	public static void main(String[] sth) {
		String foodInput;
		char foodGrade;
		Scanner inputSth = new Scanner(System.in);
		System.out.println("Enter the food you want as long as it either starts with A, B or C.");
		foodInput = inputSth.nextLine();
		foodGrade = foodInput.charAt(0);
		switch (foodGrade) {
			case 97:
			case 65:
				System.out.println("You have chosen food that starts with letter A.");
				break;
			case 98:
			case 66:
				System.out.println("You have chosen food that starts with letter B.");
				break;
			case 99:
			case 67:
				System.out.println("You have chosen food that starts with letter C.");
				break;
			default:
				System.out.println("Error. That is incorrect");
		}
	}
}
// la primavera, el verano, el etono, el invierno
