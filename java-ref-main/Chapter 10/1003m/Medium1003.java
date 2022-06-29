/* Chapter 10.3 - Overriding Superclass Methods

	--> a subclass method can have the same signature as a superclass method; where it's said to override the superclass method
	--> since a subclass is more specialized than the superclass, it can be necessary for the subclass to replace inadequate
		superclass methods with more suitable ones; this is known as 'method overriding' and is illustrated below
	--> in order for overriding to occur, the subclass method must have the same signature as the superclass method
	--> an '@Override' annotation usually appears before the method that is meant to override a method in the superclass
	--> the annotation is not required, but is recommended; if a method fails to correctly override a method in the superclass,
		the compiler would let us know by displaying an error that the subclass doesn't override any superclass method
	--> a subclass may call an overridden superclass method by prefixing its name with the 'super' keyword and a dot '.' e.g.
				super.setScore(rawScore * percentage);
	--> when a subclass overrides a method in the superclass, a subclass object would call its overridden version of the method
		in a statement while if the object was from a superclass, it would call its superclass version of the method
	--> both overloading and overriding can take place in an inheritance relationship; for overloading, if class A is a
		superclass and class B is a subclass, a method in B can overload a method in A, or another method in class B; for
		overriding, which only takes place in an inheritance relationship, a method in class B may override a method in class A
	--> when a subclass overloads a superclass method, both methods may be called with a subclass object; however, when a
		subclass overrides a superclass method, only the subclass' version of the method can be called with a subclass object
	--> to prevent a method from being overridden in a subclass, the method should be declared with the 'final' modifier' e.g.
				public final void message()
	--> an attempt to override a 'final' method will result to a compile error;

*/

import javax.swing.*;

public class Medium1003 {

	public static void main(String[] sth) {
		String l = JOptionPane.showInputDialog("Enter the student's raw numeric score");
		String p = JOptionPane.showInputDialog("Enter the curve percentage");

		CurvedActivity curvedExam = new CurvedActivity(Double.parseDouble(p));
		curvedExam.setScore(Double.parseDouble(l));

		JOptionPane.showMessageDialog(null, "The curved score is " + curvedExam.getScore());
		JOptionPane.showMessageDialog(null, "The exam grade is " + curvedExam.getGrade());
	}
}