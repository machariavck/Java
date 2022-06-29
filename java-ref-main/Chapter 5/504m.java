/* Chapter 5.4 Returning a Value from a Method

	--> value-returning methods are able to return back data to statements that called them
	--> when writing a value-returning method, one must specify the data type of the return value in the method header
	--> a return statement is a must in a value-returning method, whose general format is as follows;
				return Expression; //where Expression is the value to be returned; can be a variable, a literal or a mathematical expression
	--> the return statement's expression must be of the same data type as the return type specified in the method header; if necessary, Java can automatically widen the value of the return expression, but won't narrow it automatically
	--> the @return tag is used to provide a description of the method's return value; general format is;
				@return Description
	--> the @return tag in the method's documentation comment must appear after the general description of the method and since it can span multiple lines, it should end at the end of the documentation comment or at the beginning of another tag
	--> a value-returning method can also return a reference to a non-primitive type, such as a String object

*/

import javax.swing.JOptionPane;

public class Medium504 {

    public static void main(String[] sth) {
		int value1 = 50, value2 = 70;
		double average = sum(value1, value2) / 2.0;
		JOptionPane.showMessageDialog(null, "The sum is " + sum(value1, value2) + " and average is " + average);
		if (isValid((int)average))
			JOptionPane.showMessageDialog(null, "The average is valid");
		else
			JOptionPane.showMessageDialog(null, "Your average isn't valid");
		String userName = fullNames("Cain", "Marko");
		JOptionPane.showMessageDialog(null, "A program by " + userName);
	}

	/**Illustrates return type of the method sum(), whose return value has the data type int as defined in the method header
		@param num1 The first value to be added
		@param num2 The second value to be added
		@return The sum of num1 and num2
	*/
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	/**This method returns a boolean value
		@return if the number fed to the method is valid
	*/
	public static boolean isValid(int num) {
		boolean status = num >= 1 && num <= 100 ? true: false;
		return status;
	}

	/**This method returns concatenates two String arguments into a single String object
		@param first refers to first name
		@param last refers to last name
		@return a reference to a String object that contains the first and last names
	*/
	public static String fullNames(String first, String last) {
		String name = first + " " + last;
		return name;
	}
}
