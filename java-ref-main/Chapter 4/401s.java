/* Chapter 401 - The Increment and Decrement operators

	--> increment refers to increasing a value by 1, and decrement is to decrease the value by one
	--> ++ and -- are unary operators that add and subtract one from their operands respectively e.g. num = num + 1 (or num += 1) is simplified to num++
	--> they can be used in prefix or postfix mode

*/

import java.util.Scanner;

public class Simple401 {           
	public static void main(String[] sth) {
		int num1 = 5;
		int num2 = 7;
		int num3 = 4;
		int num4 = 9;
		int num5, num6;
		System.out.print("Num1 holds the value 5. When incremented in postfix mode in the System.out.println method, the value printed is: ");
		System.out.println(num1++); //prints 5
		System.out.print("Num2 holds the value 7. When decremented in prefix mode in the System.out.println method, the value printed is: ");
		System.out.println(--num2); //prints 6
		num5 = num3++; //num5 will have the value 4
		num6 = --num4; //num6 will have the value 8
		System.out.println("Num3 holds the value 4, num4 holds the value 9. The new values of num5 and num6 are displayed below.");
		System.out.println("num5 = num3++ = " + num5 + "\nnum6 = --num4 = " + num6);
	}
}

