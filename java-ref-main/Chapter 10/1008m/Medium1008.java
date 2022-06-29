/* Chapter 10.8 - Abstract Classes and Abstract Methods

	--> an abstract class isn't instantiated, but other classes extend it
	--> an abstract method is a method that appears in a superclass, has only a header (no body) and must be overridden i.e.
				AccessSpecifier abstract ReturnType MethodName(ParameterList);
	--> the keyword 'abstract' appears in the header, and the header ends with a semicolon as there's no body for the method e.g.
				public abstract void setValue(int value);
	--> when an abstract method appears in a class, the method must be overridden in a subclass or otherwise an error occurs
	--> a class containing one or more abstract methods must also be declared as abstract
	--> the abstract class represents the generic or abstract form of all the classes that inherit from it
	--> a class becomes abstract by placing the 'abstract' keyword in the class definition i.e.
				AccessSpecifier abstract class className
	--> in UML, abstract classes are drawn like regular classes, except that the name of the abstract class and the names of
		abstract methods are shown in italics
	--> a subclass that inherits an abstract class has to implement all of the abstract methods in the superclass and if it doesn't, it has to be specified as abstract
	--> the abstract modifier can only be used on instance methods; cannot be applied on static methods or constructors
	--> the 'final' keyword is used to prevent method overriding and class inheritance
	--> declaring a class as 'final' implicitly declares all of its methods as final too
	--> a class can't be both abstract and final!
*/

public class Medium1008 {

	public static void main(String[] sth) {
		Student st1 = new CompSciStudent("Bruce Wayne", "2ASEW2313Z", 2019);
		st1.setMathHours(12);
		System.out.println(st1);
		st1.setCsHours(20);
		st1.setGenEdHours(40);
		System.out.println(st1 + "\nHours Remaining: " + st1.getRemainingHours());
	}	
}
