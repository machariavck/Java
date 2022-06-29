/* Chapter 10.9 - Interfaces

	--> an interface specifies behavior for a class; in its simplest form, an interface is like a class with only abstract methods
	--> an interface can't be instantiated, it's implemented by other classes; when implemented, the classes have to override those
		methods specified by the interface
	--> an interface looks similar to a class, except the key word 'interface' is used in place of 'class', and the methods
		specified in an interface have no bodies, only headers that are terminated by semicolons i.e.
				public interface InterfaceName {
					(Method headers...)
				}
	--> all methods in an interface must be public, and they are made implicitly public (it's optional to use public)
	--> any class that implements an interface must provide an implementation of the methods present in the interface (each method
		must have the exact signature and a similar return type as specified in the interface)
	--> when a class is to implement an interface, the keyword 'implements' is used in the class header
	--> an interface can be described as a 'contract'; any class implementing an interface must adhere to the contract; it is
		agreeing to provide all of the methods that are specified by the interface
	--> when designing a class that implements an interface, one can choose what those methods present in the interface should
		do; but is always expected to comply with the intent
	--> an interface can contain field declarations, but all fields in an interface are treated as final and static; any class
		implementing such an interface has access to those variables
				public interface Doable {
					int FIELD1 = 1;			//has to be initialized as it's final
					(Method headers...)
				}
	--> abstract classes and interfaces seem quite similar but both are very useful; a class can extend only one superclass, but
		Java allows a class to implement multiple intefaces; they are implemented in the following manner i.e.
				public class MyClass implements interface1, interface2, interface3
	--> in a UML diagram, an interface is drawn like a class, but the interface name and the method names are italicized, and an
		<<interface>> tag is shown above the interface name
	--> the relationship between a class and an interface is called a 'realization relationship' (the class realizes the interfaces)
	--> a realization relationship is shown by connecting a class and an interface with a dashed line that has an open arrowhead
		at one end pointing towards the interface
	--> since Java 8, interfaces may have default methods; a default method is an interface method that has a body and its method
		header begins with the keyword 'default' i.e.
				default void display()
	--> the default keyword is required for an interface method that has a body; when a class implements an interface with a default
		method, it's optional for a class to override the default method
	--> default methods allow addition of new methods to an existing interface without causing errors in the classes that already
		implement the interface
	--> Java allows creation of reference variables of an interface type, such that the interface reference variable can reference
		any object that implements the interface, regardless of its class type
	--> however, when an interface variable references an object, the variable can only call methods specified in the interface
	--> it's possible to cast an interface reference variable to the type of object it references, and then call methods that are
		members of that type; awkward syntax it is however; it's shown in the example below
*/

public class Medium1009 {

	public static void main(String[] sth) {

		Relatable rr = new FinalExam(100, 30);
		FinalExam exam1 = new FinalExam(100, 20);
		FinalExam exam2 = new FinalExam(100, 30);
	
	//	System.out.println("Exam *: " + rr.getScore());		//won't run
		System.out.println("Exam *: " + ((FinalExam)rr).getScore());	//runs

		System.out.println("Exam 1: " + exam1.getScore());
		System.out.println("Exam 2: " + exam2.getScore());
	
		if (exam1.equals(exam2))
			System.out.println("The exam scores are equal.");
		else if (exam1.isLess(exam2))
			System.out.println("Exam1 has a lower score.");
		else if (exam1.isGreater(exam2))
			System.out.println("Exam1 has a greater score.");
		exam1.display();*/
	}
}