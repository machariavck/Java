/* Chapter 10.1 - About Inheritance

	--> inheritance allows a new class to extend an existing class, where the new class inherits the members of the class it extends
	--> in the real world, many objects have are specialized versions of other general objects e.g. a bumblebee is a special kind of insect
	--> when one object is a specialized version of another object, an 'is a' relationship exists between them e.g. a poodle is a dog
	--> that means the specialized object has all of the characteristics of the general object, plus additional characteristics that make it
		special; in OO programming, inheritance enables extending capabilities of a class by creating another specialized version of itself
	--> inheritance involves a superclass and a subclass; the superclass being the general class and the subclass being the specialized class
	--> the subclass inherits fields and methods from the superclass without any of them having to be rewritten; and new fields and methods may be added to the subclass, to make it more specialized (superclass aka 'base classes', subclasses aka 'derived classes')
	--> the example here shows a FinalExam class that is a subclass of the GradedActivity class; the keyword 'extends' is usually used i.e.
				public class FinalExam extends GradedActivity		//to express the relationship here, we say 'a FinalExam is a GradedActivity'
	--> the subclass here (FinalExam) inherits all of the public members of the GradedActivity class; now, members of the FinalExam class are;
				Fields:		totQuestions, failedQuestions, pointsEach
				Methods:	Constructor(FinalExam), getPointsEach, getFailedQuestions, setScore, getScore, getGrade
	--> the GradedActivity class' 'score' field isn't listed because it's private; private members of the superclass are not inherited
	--> when an object of the subclass is created, the private members of the superclass exist in memory, but only methods in the superclass
		can access them; also, the superclass constructor isn't inherited because its purpose is to construct objects of the superclass
	--> moreso, public members of the superclass become public members of the subclass e.g. the exam object here calls the getGrade() method
	--> inheritance in UML diagrams is shown by connecting two classes with a line that has an open arrowhead at one end, which points to the
		superclass
	--> in an inheritance relationship, the superclass constructor always executes before the subclass constructor e.g. when a FinalExam
		object is created below, the GradedActivity class' default constructor executes just before the FinalExam constructor is executed
	--> if a superclass has either a default constructor or a no-arg constructor written into the class, then that constructor is
		automatically called just before the subclass constructor executes; other situations do arise with superclass constructors
	--> inheritance doesn't work in reverse; a superclass cannot call a subclass' method
*/

import javax.swing.*;

public class Medium1001 {

	public static void main(String[] sth) {

		String q = JOptionPane.showInputDialog("Enter the number of questions in the final exam");
		String m = JOptionPane.showInputDialog("How many questions did the student miss?");

		FinalExam exam = new FinalExam(Integer.parseInt(q), Integer.parseInt(m));

		JOptionPane.showMessageDialog(null, "Each question has " + exam.getPointsEach() + " points.\nThe exam score is " +
					exam.getScore() + ".\nThe exam grade is " + exam.getGrade());
		System.exit(0);
	}
}
