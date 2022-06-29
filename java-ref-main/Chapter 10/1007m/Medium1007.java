/* Chapter 10.7 - Polymorphism

	--> a superclass reference variable can reference objects of a subclass i.e.
				GradedActivity exam;
	--> because of the 'is a' relationship between a superclass and a subclass, an object of a subclass is also an object of a superclass e.g.
			GradedActivity exam2 = new FinalExam(50, 7);			//a final exam is a graded activity
	--> that's perfectly legal and will not cause an error message because a FinalExam object is also a GradedActivity object
	--> the above statement is an example of polymorphism; polymorphism means the ability to take many forms; in Java, a reference variable
		is polymorphic because it can reference objects of types different from its own, as long as those types are subclasses of its type
	--> in the program below, the following declarations are legal as all the classes inherit from GradedActivity;
			GradedActivity exam1 = new FinalExam(50, 7);
			GradedActivity exam2 = new PassFailActivity(70);
			GradedActivity exam3 = new PassFailExam(100, 10, 70);
	--> despite the GradedActivity variable references objects of any class that extends GradedActivity, there's a limit to what a variable can do with those objects; regardless of the type of object the variable references, the GradedActivity variable can only call the three methods in its class i.e. setScore, getScore and getGrade
	--> in case a superclass variable references a subclass object (or when a variable contains a polymorphic reference), and an overridden
		method happens to be called, Java performs dynamic (or late) binding where the JVM determines at runtime which method to call,
		depending on the type of object that the variable references
	--> the object's type determines which method is called, not the variable's type
	--> parameters can also be used to accept arguments to methods polymorphically
	--> the 'is a' relationship doesn't work in reverse; 'a final exam is a graded activity' but 'a graded activity is not a final exam' i.e.
		not all graded activities are final exams; so not all GradedActivity objects are FinalExam objects; this is wrong;
				GradedActivity activity = new GradedActivity();
				FinalExam exam = activity;							//	ERROR!
	--> interestingly, the Java compiler allows such an assignment if a type cast is used; albeit the program would crash when it runs i.e.
				FinalExam exam = (FinalExam) activity;		// compiles, but won't run
	--> 'instanceof' operator in Java allows one to determine whether an object is an instance of a particular class i.e.
				refVar instanceof ClassName
	--> refVar is a reference variable, ClassName is the name of a class; this is the form of a boolean expression that returns true if the
		object referenced by refVar is an instance of ClassName; otherwise, the expression returns false
	--> the instanceof operator understands the 'is a' relationship that exists when a class inherits from another class
*/

public class Medium1007 {

	public static void main(String[] sth) {

		GradedActivity[] tests = new GradedActivity[3];
		tests[0] = new GradedActivity();
		tests[0].setScore(95);
		tests[1] = new PassFailExam(20, 5, 60);
		tests[2] = new FinalExam(50, 7);
		
		if (tests[1] instanceof GradedActivity)	//returns true
			System.out.println("Yes, tests[1] is a GradedActivity");
		if (tests[1] instanceof PassFailExam) 	//returns true
			System.out.println("Yes, tests[1] is a PassFailExam");
		/*
		for (int i = 0; i < tests.length; i++) {
			System.out.println("Test: " + (i + 1) + "\n==========");
			displayGrades(tests[i]);
		}*/
	}


	public static void displayGrades(GradedActivity g) {
			System.out.println("Score " + g.getScore() + ", grade " + g.getGrade());
	}
}
