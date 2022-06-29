/* Chapter 10.4 - Protected Members

	--> members of a class may be accessed by methods in a subclass, and by methods in the same package as the class
	--> Java provides a third access specification 'protected' where a class member can be directly accessed by methods of the
		same class, methods of a subclass or methods of any class that are in the same package as the protected member's class
	--> a protected class member isn't quite private, because it can be accessed by some methods outside the class; also, it's
		not quite public either as access to it is restricted to methods in the same class, subclasses and classes in the same
		package as the member's class; it's access is somewhere between private and public
	--> protected class members may be denoted in a UML diagram with the '#' symbol
	--> although making a class member protected instead of private might make some tasks easier, this should be avoided if
		possible because any class that inherits from the class, or is in the same package, has unrestricted access to the
		protected member; it's always better to make all fields private and then provide public methods to access those fields
	--> if an access specifier isn't provided for a class member, the class member is given package access by default
	--> there's a subtle difference between protected access and package access; protected members may be accessed by methods
		in the same package or in a subclass (this is true even if the subclass is in a different package); members with
		package access, however, cannot be accessed by subclasses that are in a different package
	--> normally one gives package access to class members by accident rather than by design, as its easy to forget the access
		specifier; it can be helpful in some circumstances but should be avoided; remember to specify an access speficier for
		class members always

*/

import javax.swing.*;

public class Medium1004 {

	public static void main(String[] sth) {
		String q = JOptionPane.showInputDialog("Enter the number of questions in the final exam");
		String m = JOptionPane.showInputDialog("How many questions did the student miss?");

		FinalExam2 exam = new FinalExam2(Integer.parseInt(q), Integer.parseInt(m));

		JOptionPane.showMessageDialog(null, "Each question has " + exam.getPointsEach() + " points.\nThe exam score is " +
					exam.getScore() + ".\nThe exam grade is " + exam.getGrade());
		System.exit(0);
	}
}
