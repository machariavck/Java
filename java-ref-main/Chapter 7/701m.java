/*	Chapter 7.1 Introduction to Arrays

	--> an array is an object that can store a group of values, all of the same data type, simultaneously
	--> like any other type of object, a reference variable is declared and the new keyword is used to create an instance of the array in memory i.e.
			int[] numbers;		//numbers is declared as an array reference variable
	--> to create an array, the new keyword is used which assign's the the array's address to the numbers variable i.e.
			numbers = new int[6];
	--> the number inside the brackets is the array's size declarator; which indicates the number of elements the array can hold
	--> as with any other type of object, it's possible to declare a reference variable and create an instance of an array with one statement i.e.
			int[] numbers = new int[6];
	--> arrays of any data type can be declared. An array's size declarator must be a non-negative integer expression. It can be a literal value or a variable
	--> it's common practice to use a final variable as a size declarator. Once an array is created, it's size cannot change
	--> elements in the array may be accessed and used as individual variables using their respective subscripts
	--> a subscript is used as an index to pinpoint a specific element within an array. The first element is assigned the
		subscript 0, the second element 1, etc. In the numbers array above, the six elements would have the subscripts 0 through 5
	--> subcript numbering always starts 0. The subscript of the last element in an array is one less than the total number of elements in the array
	--> each element of an array, when accessed by its subscript, can be used as an int variable i.e.
			numbers[3] = 20;	//storing 30 in the fourth array element, read as "numbers sub three is assigned twenty"
	--> by default, Java initializes array elements with 0.
	--> since subscript numbers can be stored in variables, this makes it possible to use a loop to "cycle through" an entire
		array, performing the same operation on each element.
	--> Java performs array bounds checking; meaning it doesn't allow a statement to use a subscript that's outside the range of
		valid subscripts for an array. Bounds checking occurs at runtime and an exception is thrown in case of an invalid subscript
	--> moreso, off-by-one errors can occur, watch out e.g. starting with array index 1 instead of 0
	--> just like regular variables, Java allows one to initialize an array's elements when one creates the array e.g.
			int[] days = {31, 28, 31, 30};
	--> the series of values inside the braces and separated with commas is called an initialization list and these values are
		stored in the array element in the order they appear in the list e.g. days[2] has the value 31
	--> the new keyword isn't used when one uses an initializion list.
	--> two different styles can be used when declaring array reference variables, and both accomplish the same thing;
			int[] numbers;		//first style
			int numbers[];		//second style
	--> however, their difference can be noted when more than one variable is declared in the same statement;
			int[] numbers, codes, scores;		//all three are references to int arrays
			int numbers[], codes, scores;		//numbers is a reference to an int array; codes, scores are regular int variables
			int numbers[], codes[], scores[];	//all three are references to int arrays

*/

import java.util.Scanner;

public class Medium701 {

	public static void main(String[] sth) {

		final int EMPLOYEES = 3;
		int[] hours = new int[EMPLOYEES];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
		
		for (int index = 0; index < EMPLOYEES; index++) {
			System.out.print("Employee " + (index + 1) + ": ");
			hours[index] = sc.nextInt();
		}

		System.out.println("The hours you entered are:");
	
		for (int index = 0; index < EMPLOYEES; index++)
			System.out.println(hours[index]);
	}
}	
