/* Chapter 3.5 Logical Operators

	--> these connect two or more relational expressions into one or reverse the logic of an expression
	--> there are two binary logical operators in java && and ||, which combine two boolean expressions into a single expression
	--> there is also the unary operator !, which reverses the truth of a boolean expression
			&& (AND) - both boolean expressions have to be true for the overall expression to be true
			|| (OR) - one or both boolean expressions have to be true for the overall expression to be true, one is necessary - doesn't matter which
			! (NOT) - if applied to an expression that's true, the operator returns false; the operand should always be enclosed in parentheses i.e.
							!(x > y) means is the expression x > y NOT true?
	--> the && operator performs short-circuit evaluation where if the expression on the left side of the operator is false, the expression on the right side
		will not be checked; it short-circuits and doesn't evaluate the expression on the right thus saves on CPU time
	--> logical operators can also be used with boolean variables; they also evaluate expressions from left to right
	--> the || operator also performs short-circuit evaluation
	--> order of precedence: ! > && > ||. && and || operators rank lower in precedence than the relational operators, thus parentheses use is optional i.e.
				x > y || a == b && z <= 2		is similar to		(x > y) || ((a == b) && (z <= 2))
	--> order of precedence of all operators;
				-(unary negation)	!			(evaluates first)
					/	*	%
					+	-
					<	>	<=	>=
					==	!=
					&&
					||
					=	-=	*=	+=	/=	%=		(evaluates last)
	--> for numeric ranges, the AND operator is best used to check if a value is within a range while the OR operator is best used to check if its outside a range

*/

import javax.swing.JOptionPane;

public class Simple305 {               
	public static void main(String[] sth) {
		int testScore;
		String sthInput;
		sthInput = JOptionPane.showInputDialog("Please enter you grade");
		testScore = Integer.parseInt(sthInput);
		if (testScore < 60) {
			JOptionPane.showMessageDialog(null, testScore + " is a poor score, category F");
		} else {
			JOptionPane.showMessageDialog(null, testScore + " is an unreal score");
		}
		System.exit(0);
	}
}
