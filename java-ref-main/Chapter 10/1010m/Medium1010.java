/* Chapter 10.10 - Anonymous Inner Classes

	--> an inner class is a class defined inside another class; an anonymous inner class is an inner class that has no name
	--> an anonymous inner class must implement an interface or extend another class
	--> when one needs a simple class that would be instantiated only once in the code, an anonymous inner class is used
	--> the 'new' operator is used to simultaneously define an anonymous inner class and create an instance of it i.e.
					new ClassOrInterfaceName() {
						(fields and methods of the anonymous class...)
					}
	--> the object created either extends the specified superclass or implements the specified interface, and a reference to the
		object is returned (neither extends or implements keyword is used in the expression)
	--> if an anonymous inner class extends a superclass, the superclass' no-arg constructor is called when the object is created
	--> an anonymous inner class must override all of the abstract methods specified by the interface it is implementing or the
		superclass it is extending
	--> because an anonymous inner class' definition is written inside a method, it can access that method's local variables, but
		only if they are declared final or if they are 'effectively final' (an effectively final variable is a variable whose
		value is never changed, but isn't declared with the final key word) otherwise a compile error will occur

*/

import java.util.*;

public class Medium1010 {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);

		IntCalculator cube = new IntCalculator() {
			public int calculate(int number) {
				return (int)Math.pow(number, 3);
			}
		};												//the semicolon has to be included because it's a complete statement
		
		System.out.print("Enter an integer number: ");
		int num = sc.nextInt();
		System.out.println("Its cube is " + cube.calculate(num));
	}
}
		
		
		
		
		
		