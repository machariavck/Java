/* Chapter 11.2 - Throwing Exceptions

	--> code can either throw one of the standard exceptions or an instance of a custom-designed exception class
	--> a 'throw' statement can be used to throw an exception manually i.e.
					throw new ExceptionType(MessageString);		//an exception object is created and thrown
	--> ExceptionType is an exception class name and MessageString is an optional string argument passed to the exception object's constructor
	--> the MessageString contains a custom error message that can be retrieved from the exception object's getMessage method; if no message is passed
		to the constructor, the exception will have a null message e.g.
					throw new Exception("Out of fuel");
	--> the above statement creates an object of the Exception class and passes a string to its constructor; the object is then thrown, causing the
		exception-handling process to begin
	--> a 'throw' statement causes an exception to be thrown; a 'throws' clause informs the compiler a method can throw exception(s)
	--> to create custom exception classes, the Exception class or one of its subclasses is extended e.g. for a BankAccount object used below, a number
		of errors would cause it to perform its duties incorrectly e.g. a negative starting balance passed to the constructor, a negative number passed
		to the deposit/ withdraw method, an amount passed to withdraw method exceeding the balance
	--> custom exceptions can be created to represent each of the errors above, and the class be rewritten to throw each exception when any error occurs
	--> when extending an Exception class or one of its subclasses, a string message is passed to the superclass constructor; this is the error message
		that is retrievable from the object's getMessage method
	--> when writing documentation comments for a method, the exceptions thrown by the method can be documented using an '@exception' tag i.e.
				@exception ExceptionName Description
	--> ExceptionName is the name of an exception; Description is a description of the circumstances that cause the exception
	--> the @exception tag must appear after the general method description and since the description can span several lines, it should end at the end of
		the documentation comment (the "*[\]/" symbol), or at the beginning of another tag
	--> the javadoc utility creates a Throw section in the method's documentation when a method contains an @exception tag, and it's where the
		descriptions of the exceptions thrown by the method will be listed


*/

public class Advanced112 {

	public static void main(String[] sth) {
	//	simple();
	//	diceExceptionDemo();
		accountTest();
	}


	public static void accountTest() {
		try {
			BankAccount acc = new BankAccount(-200);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		}
	}


	public static void diceExceptionDemo() {
		Die die = new Die(1);
		System.out.println(die);
	}


	public static void simple() {
		String m = "th";
		if (!m.equals("sth"))
			throw new IllegalArgumentException("Something's wrong here");
	}
}