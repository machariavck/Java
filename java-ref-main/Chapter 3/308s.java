/* Chapter 3.8 The Conditional Operator (Optional)

	--> it is a powerful and unique operator that takes three operands (thus ternary operator) and is used to create short expressions that work like if-else statements
				BooleanExpression ? Value1: Value2;			(the operator consists of the question mark and the colon)
	--> if the BooleanExpression is true, then the value of the conditional expression is Value1. Otherwise, the value of the conditional expression is Value2
				e.g.	y = x < 0 ? 10 : 20;	 is similar to		if (x < 0) y = 10; else y = 20;
	--> this conditional operator gives the ability to pack decision-making power into a concise line of code

*/

import java.util.Scanner;

public class Simple308 {             
	public static void main(String[] sth) {
		int score, manip = 10;
		Scanner inputSth = new Scanner(System.in);
		System.out.print("Enter the grade you scored: ");
		score = inputSth.nextInt();
		System.out.println("That's a " + (score < 80 ? "Fail" : "Pass"));
		System.out.println("The manipulation value is " + (score < 60 ? score*manip : Math.pow(score,2)));
	}
}
