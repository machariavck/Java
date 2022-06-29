/* Chapter 9.6 Wrapper Classes for the Numeric Data Types

	--> other than Character wrapper class, the Java API provides wrapper classes for all of the numeric primitive data types
	--> these classes have methods that perform useful operations involving primitive numeric values e.g. the 'parse' methods
		used to convert strings to values of the primitive types e.g. Integer.parseInt()
	--> each of numeric wrapper classes has the static 'toString' method that converts a number to a string
	--> the Integer and Long wrapper classes have static 'toBinaryString', 'toHexString' and 'toOctalString' that accept an
		integer as an argument and return a string representation of that number converted to binary, hexadecimal or octal
	--> the numeric wrapper classes each have a set of static final variables named MIN_VALUE and MAX_VALUE which hold the
		minimum and maximum values for a particular data type
	--> objects can be created from wrapper classes; one way is by passing an initial value to the constructor e.g.
			Integer number = new Integer(7);	//object initialized with the value 7, referenced by the variable number
	--> another way is to declare a wrapper class variable, and then assign a primitive value to it i.e.
			Integer number;		//creates an Integer variable named 'number', doesn't create an object
			number = 7;			//assigns a primitive value 7 to the variable
	--> this doesn't cause an error, despite that number is a reference variable not a primitive variable; however, since
		number is a wrapper class variable, Java performs an autoboxing operation
	--> 'Autoboxing' is a Java's process of automatically 'boxing up' a value inside an object, and then assigns the address
		of that object to the number variable
	--> Unboxing is the opposite of boxing, where a wrapper class object is converted to a primitive type e.g.
			Integer myInt = 5;		//autoboxes the value 5
			int n;
			n = myInt;				//unboxes the object
	--> although it's rare to need to create an instance of a wrapper class, Java's autoboxing and unboxing features make 
		some operations more convenient; where one needs to perform an operation using a primitive variable, but the
		operation can only be used with an object
	--> for instance, the ArrayList is an array-like object that can be used to store other objects, and one cannot store
		primitive values in it
	--> however, wrapper classes can be stored in an ArrayList e.g. when one needs to store int values in an ArrayList, the
		ArrayList can be specified to hold Integer objects e.g.
			ArrayList<Integer> list = new ArrayList<>();
	--> 'list' references an ArrayList that can hold Integer objects; one way to store an int value in the ArrayList is to
		instantiate an Integer object, initialize with the desired int value, and then pass the Integer object to the 
		ArrayList's 'add' method i.e.
			Integer myInt = new Integer(5);
			list.add(myInt);
	--> However, Java's autoboxing and unboxing features make it unnecessary to create the int object and also unboxes the
		values that are retrieved from the ArrayList when necessary ie.
			list.add(5);					//autoboxing
			int p = list.get(0);			//unboxing
	

*/
import java.util.ArrayList;


public class Medium906 {

	public static void main(String[] sth) {

		int i = 22;
		double d = 14.98;
		
		//toString
		System.out.println("The following are now strings: " + Integer.toString(i) + Double.toString(d));
		
		//toBinaryString, toHexString, toOctalString
		System.out.println(i + " in binary is: " + Integer.toBinaryString(i));
		System.out.println(i + " in hexadecimal is: " + Integer.toHexString(i));
		System.out.println(i + " in octal is: " + Integer.toOctalString(i));
		
		//MIN_VALUE, MAX_VALUE
		System.out.println("The minimum value for a byte is: " + Byte.MIN_VALUE);
		System.out.println("The maximum value for a byte is: " + Byte.MAX_VALUE);
		
		//Autoboxing, Unboxing
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		int p = list.get(0);
		System.out.println(p);

	}
}