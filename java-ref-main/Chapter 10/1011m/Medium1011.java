/* Chapter 10.11 - Functional Interfaces and Lambda Expressions

	--> a functional interface is an interface that has one abstract method; a lambda expression creates an object that implements a
		functional interface
	-->	the two features were introduced since Java 8 and provide a way to easily create and instantiate anonymous inner classes
	--> in the example, since Calculator is a functional interface, it's not needed to define a class that implements the interface (even
		the anonymous inner class isn't needed)
	--> instead, a 'lambda expression' is used to create an object that implements the interface, and overrides its abstract method
	--> a lambda expression can be thought of as an anonymous method, or a method with no name; like regular methods, it can accept
		arguments and return values i.e.
					parameter -> expression
	--> the lambda expression begins with a parameter variable, followed by the 'lambda operator' (->), followed by an expression e.g.
					x -> x * x		//x is the parameter variable, x * x is the value returned
	--> the above lambda expression can be used to create an object that implements the Calculator interface e.g.
					Calculator square = x -> x * x;
	--> the data type of x is automatically determined by the compiler, thus no need for specifying
	--> if a functional interface's abstract method is void, any lambda expression to be used should also be void e.g.
					x -> System.out.println(x);
	--> if a functional interface's abstract method has multiple parameters, any lambda expression to be used with the interface must
		also have multiple parameters; it's achieved by writing a comma-separated parameter list enclosed in parentheses e.g.
					(a,b) -> a + b;
	--> if a functional interface's abstract method has no parameters, any lambda expression to be used with the interface must also
		have no parameters; it's achieved by writing a set of empty parentheses as the parameter list e.g.
					() -> System.out.println("nothing");
	--> explicitly declaring a parameter's data type isn't a must; but it's done by enclosing the parameter declaration in parentheses e.g.
					(int x) -> x * x;
					(int a, int b) -> a + b;
	--> to write multiple statements in the body of a lambda expression, a set of curly braces is used to enclose them, and if the
		expression returns a value, a return statement has to be written e.g.
					(int x) -> {
						int a = x * 2;
						return a;
					};
	--> a lambda expression can access variables that are declared in the enclosing scope, as long as those variables are final or effectively final e.g. in the example below

*/

import java.util.*;

public class Medium1011 {
//www.downloadha.com
	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		final int FACTOR = 18;
		Calculator value = x -> FACTOR * x * x;
		
		System.out.println("Enter an integer number");
		int n = sc.nextInt();
		System.out.println("The square is " + value.calculate(n));
	}
}
