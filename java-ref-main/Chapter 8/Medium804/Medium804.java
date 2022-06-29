/* Chapter 8.4 The toString Method

	--> this method returns a string that represents the state of an object, and it's a method implicitly called under certain circumstances
	--> an object's state is simply the data stored in the object's fields at any given moment
	--> creating a string that represents the state of an object is such a common task that many programmers equip their classes with a
		method that returns such a string, which in Java, it's standard practice to name this method toString
	--> for instance, for the Stock class below, the toString method can be called as shown here;
			Stock abcCompany = new Stock("ABC", 13.11);
			System.out.println(abcCompany.toString());
	--> however, it's unnecessary to explicitly call the toString method because Java automatically calls the toString method when the object
		is passed as an argument to print or println methods, or when concatenated to a string in the forementioned methods i.e.
				System.out.println(abcCompany);		//OR
				System.out.printnl("The stock data is:\n" + abcCompany);
	--> every class automatically has a toString method that returns a string containing the object's class name, followed by the @ symbol,
		followed by an integer that is usually based on the object's memory address. This method is called when necessary if the toString
		method has not been provided by the programmer
*/


public class Medium804 {

	public static void main(String[] sth) {
		Stock abcCompany = new Stock("ABC", 24.23);
		System.out.println("The stock data is:\n" + abcCompany);
	}
}
