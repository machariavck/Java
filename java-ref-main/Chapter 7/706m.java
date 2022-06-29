/*	Chapter 7.6 String Arrays

	--> an array of String objects may be created, and if not initialized, each String in the array must be created individually
	--> in memory, an array of String objects is arranged differently than an array of a primitive data type
	--> an array of String objects is really an array of references to String objects e.g.
				String[] names = { "Bill", "Susan", "Steven", "Jean" };
	--> when you create an uninitialized array of String objects, a value must be assigned to each element in the array that's intended to be used e.g.
				String[] names = new String[2];
					names[0] = "bill";
					names[1] = "susan";
	--> because each element of a String array is a String object, an element can be used to call a String method e.g.
				System.out.println(names[0].toUpperCase()):
				char letter = names[1].charAt(3);
	--> watch out when using the array field length and the String object length method e.g.
				for (int i = 0; i < names.length; i++)
					System.out.println(names[i].length());

*/

import java.util.Scanner;

public class Medium706 {

	public static void main(String[] sth) {

		String[] months = { "January", "February", "March", "April", "May", "June" };
		int[] days = { 31, 28, 31, 30, 31, 30 };
		
		for (int i = 0; i < months.length; i++)
			System.out.println(months[i] + " has " + days[i] + " days.");
		
	}
}
