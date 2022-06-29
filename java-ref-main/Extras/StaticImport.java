//	enables direct import of static MEMBERS i.e. methods or variables

import static java.lang.Math.*;
import static java.lang.System.*;

/*
	--Other alternative import statements for Math class--

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

*/

public class StaticImport {

	public static void main(String[] sth) {
		//	Evaluating a quadratic equation, ax² + bx + c = 0, using the formula; x = (-b ± √(b² - 4ac)) / 2a

		double a, b, c, x;

		//	Solve 4x² + x - 3 = 0;

		a = 4;
		b = 1;
		c = -3;

		//	First Solution

		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		out.println("First Solution: " + x);

		//	Second Solution

		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		out.println("Second Solution: " + x);

	}
}
