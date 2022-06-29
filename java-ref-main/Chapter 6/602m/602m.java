/* Chapter 6.2 Writing a Simple Class

	--> when designing a class, it's often helpful to draw a UML diagram (UML stands for Unified Modeling Language)
	--> UML provides a set of standard diagrams for graphically depicting object-oriented systems
	--> the general layout of a UML diagram is a box divided into three sections. The top section is where the name of the class is written, the middle section holds a list of the class' fields and the bottom section holds a list of the class' methods.
	--> the general format of a class definition is as follows:
					AccessSpecifier class Name
					{
						Members		(refers to the fields and methods that belong to the class)
					}
	--> it's common practice to make all of a class' fields private and to provide access to those fields through methods only
	--> when the private access specifier is applied to a class member, the member cannot be accessed by code outside the class. The member can be accessed only by methods that are members of the same class
	--> when the public access specifier is applied to a class member, the member can be accessed by code inside the class or outside.
	--> when a method is designed to work on an instance of a class, it's called an instance method, and the word 'static' isn't included in the header
	--> a method that gets a value from a class' field but doesn't change it is called an accessor method (or a getter) e.g. getWidth()
	--> a method that stores a value in a field or changes the value of a field in some other way is known as a mutator method (or a setter) e.g. setLength()
	--> data hiding is an important concept in object-oriented programming and is crucial when designing components to be used in large software systems
	--> in order to avoid stale data, calculated data should not be stored in a field, but instead a method should be provided that returns the calculation result
	--> in UML diagrams:
		* a "-" character is used to show the member is private, while the + character shows the member is public. (usually placed before a member name)
		* To indicate the data type of a class member in a UML diagram, a colon is placed after the name of the member, and after the colon, the data type is indicated
						e.g.	- length: double	OR	+ getLength(): double
		* Parameter variables and their data types are listed inside the method's parentheses
						e.g.	+ setLength(len: double): void
	--> in the layout of class members, it's not mandatory to list field declarations before method definitions; whichever the preference, be consistent

*/

public class Medium602 {

	public static void main(String omicron[]) {
		Rectangle box = new Rectangle();
		System.out.println("This illustrates setting a rectangle's attributes.");
		box.setLength(10.0);
		box.setWidth(12.0);
		System.out.println("The current rectangle's length is " + box.getLength() + " and its width is " + box.getWidth() + " thus area is " + box.getArea());
	}
}
