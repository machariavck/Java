/* Chapter 4.2 The While loop

	--> a loop is a control structure that causes a statement or a group of statements to repeat
	--> Java has 3 looping control structures: the while loop, the do-while loop and the for loop
	--> the while loop consists of a Boolean expression, tested for true or false, and a statement or block of statements
					while (BooleanExpression) {		//this is referred to as the loop header
						[block of statements]		//this is the body of the loop
					}
	--> first, the BooleanExpression is tested, if it is true, the statements execute; then the BooleanExpression is tested again, if it's true, the statement(s) execute and
			this cycle repeats until the BooleanExpression tests false. The statements here can be considered as conditionally executed statements
	--> each repetition of a loop is known as an iteration
	--> the while loop is known as a pretest loop, as it tests its expression before each iteration
*/


public class Simple402 {             
	public static void main(String[] sth) {
		int num1 = 1; //variable is declared and initialized here
		//if num1 was initialized with a value greater than 5, the loop would never execute
		while (num1 <= 5) {	//the variable is tested here, if the BooleanExpression is true, the statements in the body of the loop are executed
			System.out.println("Hello Bro");
			num1++;	//this is the loop control variable
			//if num1++ was lacking here, the loop would be an infinite loop and would repeat until the program is interrupted
		}
	}
}
