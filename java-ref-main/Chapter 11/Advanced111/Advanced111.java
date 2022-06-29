/*	Chapter 11.1 - Handling Exceptions

	--> an exception is an object that is generated in memory as the result of an error or an unexpected event
	--> when an exception is generated, it's said to have been 'thrown'; if the code written doesn't do exception handling (intercepting and
		responding to exceptions), the default exception handler deals with it by printing an error message and crashing the program
	--> Java allows creation of 'exception handlers' that detect that an exception has been thrown and prevent it from halting the app
	--> an 'exception handler' is a section of code that gracefully responds to exceptions when they are thrown
	--> exception objects are created from classes in the Java API which consists of an extensive hierarchy of exception classes; all of the classes
		in the hierarchy inherit from the 'Throwable' class and just below it are the classes 'Error' and 'Exception'
	--> classes that inherit from 'Error' are for exceptions that are thrown when a critical error occurs e.g. internal error in the JVM or running
		out of memory; an application shouldn't try to handle these errors as they are a result of a serious condition
	--> all of the exceptions to be handled here are instances of classes that inherit from 'Exception' e.g. IOException, RuntimeException
	--> IOException serves as a superclass for exceptions that are related to input and output operations; RuntimeException serves as a superclass
		for exceptions that result from programming errors e.g. an out-of-bounds array subscript
	--> EOFException and FileNotFoundException inherit from the IOException class; an EOFException object is thrown when an application attempts to
		read beyond the end of a file and a FileNotFoundException object is thrown when an application tries to open a non-existent file
	--> exception classes are in packages in the Java API e.g. the FileNotFoundException is in the java.io package; when handling an exception that
		isn't in the java.lang package, use the appropriate import statement
	--> to handle an exception, a 'try' statement is used i.e.
				try {
						(try block statements...)
				} catch (ExceptionType parameterName) {				***Braces are always required
						(catch block statements...)
				}
	--> a 'try block' consists of one or more statements that are executed and can potentially throw an exception; the code in the try block is
		'protected' since the application wouldn't halt if the try block throws an exception; when an exception is thrown in a try block, the
		program immediately exits the try block, skipping the remaining statements in the block and jumps to the catch clause
	--> a catch clause consists of the keyword catch and a parameter variable declaration; if code in the try block throws an exception of the
		ExceptionType class, then the parameter variable will reference the exception object and code in the catch block executes
	--> after the catch block is executed, the program resumes with the code that appears after the entire try/catch construct; if no exception
		was thrown in the try block, the program jumps to the statement that immediately follows the try/catch construct
	--> the Java API documentation lists all of the exceptions that can be thrown from each method
	--> each exception object has a method named getMesage that retrieves the default error message; this is the same message displayed when
		the exception is not handled and the application halts
	--> when handling exceptions, a polymorphic reference can be used as a parameter in the catch clause e.g. a catch clause that uses a
		parameter variable of the Exception type is capable of catching any exception that inherits from the Exception class
	--> in many cases, the code in a try block is capable of throwing more than one type of exception, thus multiple catch clauses would
		be written to handle each type of exception that could potentially be thrown; when an exception is thrown, the JVM searches for a
		catch clause that can handle it and passes control to the first catch clause with a parameter that's compatible with the exception
	--> through effective exception handling, a program attempts to recover from as many exceptions as possible
	--> a try statement may have only one catch clause for each specific type of exception, or else an error results; this error can also be
		caused by using polymorphic references; this can be avoided by handling the more specialized exception classes before the more general
		exception classes
	--> the try statement may have an optional finally clause, which must appear after all of the catch clauses; the code in the finally block
		always executes whether an exception occurs or not
	--> a 'call stack' is an internal list of all the methods that are currently executing; when an exception is thrown by a method executing
		under several layers of method calls, it can be helpful to know which methods were responsible for the method being called
	--> a 'stack trace' is a list of all the methods in the call stack; it indicates the method that was executing when an exception occurred
		and all of the methods that were called in order to execute that method i.e. when an unhandled exception occurs, the default error
		message shows a stack trace (a chain of methods) listing the methods that were called when the exception was thrown
	--> all exception objects have a printStackTrace method, inherited from the Throwable class, which can be used to print a stack trace
	--> beginning with Java 7, a catch clause can handle more than one type of exception; this easily reduces a lot of duplicated code in
		a try statement that needs to catch multiple exceptions, but perform the same operation for each one; exception types can be separated
		by the '|' symbol; the ability to catch multiple types of exceptions with a single catch clause is called 'multi-catch'
	--> when an exception is thrown, the method throwing it stops and the JVM searches for a compatible exception handler inside the method; if
		none is found, then control of the program is passed to the previous method up the call stack; if that method cannot handle the
		exception, control is passed again up the call stack; this continues until control reaches the main method, which if it still can't
		handle, the program is halted and the default exception handler handles the exception
	--> in Java, there are two categories of exceptions: unchecked and checked
	--> 'unchecked' exceptions inherit from the Error class or the RuntimeException class; exceptions that inherit from Error are thrown when a
		critical error occurs and conditions that cause them can rarely be dealt with in the program, thus shouldn't be handled; exceptions that
		inherit from RuntimeException are a result of programing errors which can be avoided with properly written code
	--> 'unchecked' exceptions should not be handled
	--> all of the remaining exceptions (those that don't inherit from Error and RunTimeException) are 'checked exceptions'; if the code in a
		method can potentially throw a checked exception, then that method must either handle the exception or have a throws clause listed in the
		method header; a throws clause informs the compiler of the exceptions that could get thrown from a method
	--> the code in method checkedUnchecked() is capable of throwing a FileNotFoundException, which is a checked exception; without a throws
		clause, it wouldn't compile
	--> the keyword 'throws' is written at the end of the method header, followed by a list of the types of exceptions that the method can throw
		(if there's more than one type of exception, they are separated with commas)

*/

import java.util.*;
import java.io.*;

public class Advanced111 {

	public static void main(String[] sth) throws FileNotFoundException {

	/*	effectiveExceptionHandling();
		usingMultipleCatch();
		aboutStackTrace();
		multiCatch();
	*/	checkedUnchecked("sth.txt");
		
	}


	public static void checkedUnchecked(String n) throws FileNotFoundException {
		File file = new File(n);
		Scanner in = new Scanner(file);
		while (in.hasNext())
			System.out.println(in.nextLine());
		in.close();
	}


	public static void multiCatch() {
		try {
			File file = new File("Sales.txt");
			Scanner in = new Scanner(file);
			while (in.hasNext())
				System.out.println(in.nextLine());
			in.close();
		} catch (NumberFormatException | InputMismatchException | IOException e) {
			System.out.println("Error processing the file");
		}
	}


	public static void aboutStackTrace() {
		System.out.println("calling myMethod...");
		myMethod();
		System.out.println("we're done here");
	}


	public static void myMethod() {
		System.out.println("calling makeError...");
		makeError();
		System.out.println("done with myMethod...");
	}


	public static void makeError() {
		String s = "abc";
		System.out.println(s.charAt(3));
		System.out.println("makeError is done...");
	}


	public static void usingMultipleCatch() {
		String m = "sth";
		
		try {
			int num = Integer.parseInt(m);
			
		} catch (NumberFormatException e) {
			System.out.println("Conversion error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("UNDEFINED ERROR: " + e.getMessage());
		}
	}


	public static void effectiveExceptionHandling() {
		Scanner sc = new Scanner(System.in);
		int months = 0;
		double total = 0;
		double oneMonth, averageSales;

		System.out.println("\nEnter the name of a file");
		String m = sc.nextLine();
		Scanner in = openFile(m);

		while (in == null) {
			System.out.println("\nError. That file is non-existent. Enter again...");
			m = sc.nextLine();
			in = openFile(m);
		}
		
		while (in.hasNext()) {
			try {
				oneMonth = in.nextDouble();
				total += oneMonth;
				months++;

			} catch (InputMismatchException e) {
				System.out.print("Non-numeric data found in the file. Press enter to skip it...");
				in.nextLine();
				sc.nextLine();
			}
		}
		in.close();
		averageSales = total / months;
		System.out.printf("\nNumber of Months: %d\nTotal Sales: $%,.2f\nAverage Sales: $%,.2f\n\n", months, total, averageSales);
	}


	public static Scanner openFile(String m) {
		Scanner sc;
		File file = new File(m);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			sc = null;
		} finally {
			System.out.println("Just scanned for existing file");
		}
		return sc;
	}
}