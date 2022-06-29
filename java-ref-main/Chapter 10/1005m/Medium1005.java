/* Chapter 10.5 - Chains of Inheritance

	--> at times it's desirable to establish a chain of inheritance in which one class inherits from a second class, which in turn
		inherits from a third class; in some cases, this chaining of classes can go on for many layers
	--> in such a chain, the third class would inherit the second class members, including the ones that the second class inherited
		from the first class
	--> classes are often depicted graphically in a class hierarchy; like a family tree, the class hierarchy shows the inheritance
		relationships between classes where the more general classes are toward the top of the tree and the more specialized classes
		are toward the bottom

*/

import javax.swing.*;

public class Medium1005 {

	public static void main(String[] sth) {
		String q = JOptionPane.showInputDialog("How many questions are on the exam?");
		String m = JOptionPane.showInputDialog("How many questions did the student miss?");
		String l = JOptionPane.showInputDialog("What is the minimum passing score?");

		PassFailExam exam = new PassFailExam(Integer.parseInt(q), Integer.parseInt(m), Double.parseDouble(l));

		JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + " points");
		JOptionPane.showMessageDialog(null, "The exam score is " + exam.getScore());
		JOptionPane.showMessageDialog(null, "The exam grade is " + exam.getGrade());
	}
}