/* Chapter 5.2 Passing Arguments to a Method

	--> a parameter (or parameter variable) is a special variable that holds a value that is being passed into a method
	--> contents of variables and values of expressions can also be passed as arguments
	--> the argument and parameter data type should be compatible; if an argument being passed to a method has a lower-ranked data type than the 
		parameter data type, an automatic widening conversion will take place; however, if the argument passed has higher ranked data type than 
		the parameter, an error will take place, unless a cast operator is used
	--> no statement outside the method can access a parameter variable by its name(it's scope is limited to the method)
	--> oftenly, it's useful to pass more than one argument to a method, where a parameter list is featured in the method header; arguments are 
		passed into the parameter variables in the order that they appear in the method call
	--> if a parameter variable is changed inside a method, it has no effect on the original argument
	--> when an object is passed as an argument e.g. a string, it is actually the reference to the object that is passed to the parameter variable
		***However, string objects in java are immutable i.e. they cannot be changed
	--> the tag @param is used in documentation comments to give a description about a parameter; the general format is;
				@param parameterName description
	--> all @param tags in a method's documentation comment must appear after the general method description; also, since the description can possibly span several lines, it should end at the end of the documentation comment or at the beginning of another tag
*/

import javax.swing.JOptionPane;

public class Medium502 {

    public static void main(String[] sth) {
		displayValue(5); //a call to the display value method, passing 5 as an argument
		displayValue(Integer.parseInt("700")); //passes 700
		int x = 30;
		byte newB = 2;
		double newD = 3.0;
		String name = "Book";
		displayValue(x*30); //passes 900
		displayValue(newB); //converts byte to int automatically
		displayValue((int)newD); //manually converts double to int using a cast operator
		showSum(5, 3);
		showLength(name);
	}

	/**simply displays an argument that has been passed*/
	public static void displayValue(int num) {	//this is declaration of a parameter variable, int num
		System.out.println("The value to be printed is " + num);
	}

	/**illustrates passing multiple arguments to a method
		@param num1 The first number
		@param num2 The second number
	*/
	public static void showSum(int num1, int num2) {	//each parameter variable must have a data type listed before its name
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
	}
	
	/**illustrates passing of an object reference to a reference variable in the parameter*/
	public static void showLength(String str) {
		System.out.println("The string " + str + " is " + str.length() + " characters long.");
	}
}
