/* Chapter 8.5 Writing an equals method

	--> to compare the contents of objects, a class must have a method such as equals
	--> just as the String class has an equals() method that determines whether two strings are equal, an equals method has to be written (or
		one that works like it) for a class that determines whether two objects of the class contain the same values
	--> in the example below, the equals() method can access ob2's symbol and sharePrice fields directly. That's because ob2 references a
		Stock object, and the equals() method is a member of the Stock class, thus the method can access ob2's private fields
	--> to compare the objects of a given class, always write an equals method for the class
	--> every class automatically has an equals method, which works the same as the == operator, and is usually called when you haven't
		provided your own equals method
*/

public class Medium805 {
	public static void main(String[] sth) {
		Stock abc = new Stock("ABC", 8.20);
		Stock absa = new Stock("ABC", 8.20);
		
		if (abc.equals(absa))
			System.out.println("Both objects are the same.");
		else
			System.out.println("Those are different objects.");
	}
}
