/* Chapter 8.8 The this Reference Variable

	--> 'this' keyword is the name of a reference variable that an object can use to refer to itself and is available to all non-static methods in the class
	--> one use is illustrated in the equals method in the Stocks class
	--> a common use of the this keyword is to overcome shadowing of a field name by a parameter name
	--> designing parameter names can be difficult and time-consuming, and this can be avoided by giving parameters the same names as the fields to which they correspond,
		and then using the this keyword to refer to the field names e.g. the Stocks class' constructor clearly illustrates; the parameter names symbol and sharePrice shadow
		the field names symbol and sharePrice but the 'this' keyword overcomes the shadowing
	--> another use of 'this' is to call an overloaded constructor from another constructor in the same class
	--> constructors are called automatically when an object is created and they can never be called explicitly; however, the 'this' keyword provides an exception to this rule
	--> for the Stock class constructor, it takes two parameter variables; if we desired a constructor that only accepts an argument for the symbol field and assigns 0.0 to the
		sharePrice field, the constructor would be written in the following manner;
			public Stock(String sym) {
				this(sym, 0.0);
			}
	--> the 'this' variable is used to call the first constructor and it passes the value in sym as the first argument and the 0.0 as the second argument
	--> when using 'this' to call a constructor, this can only be used to call a constructor from another constructor in the same class; also, it must be the first statement in
		the constructor that is making the call else a compile error will occur

*/

public class Medium808 {

	public static void main(String[] sth) {
		Stocks absa = new Stocks("ABSA", 21.22);
		System.out.println(absa);
	}
}
