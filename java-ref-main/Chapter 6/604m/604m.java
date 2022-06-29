/*	Chapter 6.4 Constructors

	--> a constructor is a method that is automatically called when an object is created; they take the same name as the class
	--> they perform initialization or setup operations, such as storing initial values in instance fields; 'constructor' as they help construct an object
	--> a constructor's header doesn't specify a return type - not even void; because constructors aren't executed by explicit method calls and can't return a value
	--> the general format for a constructor's header is as follows;
			AccessSpecifier ClassName(Parameters...)
	--> in a UML diagram, a constructor is treated the same as any other method, except with no return type
	--> local reference variables can be declared without being initialized but similar to local primitive variables, they must be initialized or must reference an object before they can be used
	--> when an object is created, its constructor is always called; which if the programmer doesn't provide one, Java automatically does (i.e. the default constructor)
	--> the default constructor takes no arguments, sets all the object's numeric fields to 0, boolean fields to false and if the object has any fields that are reference variables, it sets them to the special value 'null', which means they don't reference anything
	--> the default constructor will only be called if the programmer doesn't provide a constructor; in the example below, since we added our own constructor, which requires two arguments, the class no longer has a default constructor. The length and width arguments must be passed, else a compilation error will occur
	--> a constructor that doesn't accept arguments is called a no-arg constructor; an example is the default constructor
	--> as observed earlier, primitive variables are created with simple declaration statements, while objects are created with the new operator
	--> however, there's one class that can be instantiated without using the new operator; the String class
	--> since string operations are so common, Java allows you to create String objects in the same way that you create primitive variables e.g. String name = "May Guan"; 	//A String object is created in memory, initialized with the string literal "May Guan" and referenced by the name variable
	--> if you wish, you can use the new operator to create a String object, and initialize the object by passing a string literal to the constructor i.e. String name = new String("May Guan");
	--> String objects are a special case in Java such that there are numerous shortcut operations while working with them i.e. apart from creating String objects without using the new operator, the = operator can be used to assign the values to String objects, the + operator to concatenate strings etc.
*/

import javax.swing.JOptionPane;

public class Medium604 {

	public static void main(String[] nu) {
		Rectangle box = new Rectangle(7.0, 14.0); //Initialized box variable
		Rectangle toolbox;	//Uninitialized reference variable
		toolbox = new Rectangle(3.0, 4.0);	
		JOptionPane.showMessageDialog(null, "The box length is " + box.getLength() + " and width is " + box.getWidth() + ". The area is therefore " + box.getArea());
	}
}
