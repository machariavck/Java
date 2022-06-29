/* Chapter 10.6 The Object Class

	--> every class in Java, those in the API and the classes you create, directly or indirectly inherit from  a class
		named Object, which is part of the java.lang package
	--> when a class doesn't use the 'extends' keyword to inherit from another class, Java automatically extends it
		from the Object class e.g.
			public class MyClass {
	--> the above class doesn't explicitly extend any other class, so Java treats it as though it were written as follows;
			public class Myclass extends Object {
	--> because ultimately every class extends the Object class, every class inherits the Object class' members; two of
		the most useful are the toString and equals methods (every class has a toString and an equals method)
	--> in the Object class, the toString method returns a reference to a String containing the object's class name,
		followed by the @ sign, followed by the object's hash code, which is a hexadecimal number; the equals method
		accepts a reference to an object as its argument and returns true if the argument references the calling object
	--> in order to change the behaviour of either of these methods for a given class, one must override them in the class		

*/

public class Medium1006 {

	public static void main(String[] sth) {
		PassFailExam exam1 = new PassFailExam(1,0,0);
		PassFailExam exam2 = new PassFailExam(1,0,0);

		System.out.println(exam1);
		System.out.println(exam2);
		if (exam1.equals(exam2))
			System.out.println("They are the same");
		else
			System.out.println("They are not the same");
	}
}