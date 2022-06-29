/* Chapter 8.6 Methods That Copy Objects

	--> the process of duplicating objects can be simplified by equipping a class with a method that returns a copy of an object
	--> to copy an object, create a new object and then set the new object's fields to the same values as the fields of the object that's
		being copied. It's simply achieved by equipping the class with a method that performs this operation and then returns a reference
		to the duplicate object
	--> another way to create a copy of an object is to use a copy constructor. This is simply a constructor that accepts an object of the
		same class as an argument thereby making the object that is being created a copy of the object that was passed as an argument

*/

public class Medium806 {

	public static void main(String[] sth) {
		Stock abcGroup = new Stock("ABC", 11.43);
		Stock abc = new Stock(abcGroup);

		//alternative way to copy an object using a copy method
		Stock absa;
		absa = abcGroup.copy();

		System.out.println("abcGroup:\n" + abcGroup);
		System.out.println("ABC:\n" + abc);
		System.out.println("ABSA:\n" + absa);
	
		if (abcGroup == abc)
			System.out.println("abcGroup and abc variables reference the same object");
		else
			System.out.println("abcGroup and abc variables reference different objects");
	}
}
