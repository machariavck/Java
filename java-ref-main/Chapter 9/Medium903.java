/* Chapter 9.3 More String Methods

	--> the String class provides several methods for searching and working with String objects
	--> the term 'substring' is commonly used to refer to a string that is part of another string; the String class provides several methods that
		search for substrings; some of these methods are listed below, where each returns a boolean value indicating whether the string was found
				boolean {startsWith(), endsWith(), regionMatches()}
	--> startsWith() determines whether the calling object's string begins with a specified substring, and it does a case-sensitive comparison
	--> endsWith() determines whether the calling string ends with a specified substring, and it also does a case-sensitive comparison
	--> the String class provides overloaded versions of the regionMatches method, which determines whether specified regions of two strings match i.e.
			boolean regionMatches(int start, String str, int start2, int n)							--> case-sensitive
			boolean regionMatches(Boolean IgnoreCase, int start, String str, int start2, int n)		--> case-insensitive when boolean is true
	--> start indicates the starting position of the region within the calling string, start2 indicates the starting position of the region within
		str, n parameter indicates the number of characters in both regions, str is the string to compare with
	--> the String class also provides methods that not only search for items within a string, but also report the location of those items i.e.
			int {indexOf(char ch), indexOf(char ch, int start), indexOf(String str), indexOf(String str, int start), lastIndexOf(...)}
	--> if a character or a substring provided as argument is found, the position of its first occurrence is returned; the start indicates the position 
		from which to begin the search going till the end of the string; the lastIndexOf works the same way except that it returns the position of its
		last occurrence, and a start parameter provided is used to set the position from which to begin the search, that is conducted backwards through
		the string to position 0. If the character is not found, -1 is returned.
	--> the String class also provides methods that allow retrieval of a substring from a string i.e.
		String {substring(int start), substring(int start, int end)}, void getChars(int start, int end, char[] array, int arrayStart), char[] toCharArray()
	--> the substring() method returns a copy of a substring from the calling object and it has two overloaded versions; the first version returns a
		reference to a String object containing all of the characters from the starting position to the end of the string; the second version takes two int
		arguments, where the second argument specifies the end position; in both method calls, the character at the start position is included in the
		substring. In the second version, the character at the end position isn't included in the substring
	--> the getChars() and toCharArray() convert the calling String object to a char array; the getChars method can be used to convert a substring, while
		the toCharArray method converts the entire string
	--> some methods return a modified string i.e.
			String {concat(String str), replace(char OldChar, char NewChar), trim()}
	--> the concat method performs the same operation as the '+' operator when used with strings
	--> the replace method returns a copy of a String object, where every occurrence of a specific field character has been replaced with another character
	--> the trim method returns a copy of a String object with all leading and trailing whitespace characters deleted
	--> another method is the static valueOf() method that accepts a value of any primitive type as its argument (through its various overloaded versions)
		and returns a string representation of the value i.e.
		 String {valueOf(boolean b, char c, char[] c, double n, float n, int n, long n)}, String valueOf(char[] arr, int subscript, int count)

*/

public class Medium903 {

	public static void main(String[] sth) {
		String in = "four score and seven years ago";
		String in2 = "those seven years passed quickly";
		String in3 = "and a one and a two and a three";
		String in4 = "      Hello    ";
		String fullName = "Donald Duck Gusling";

		//valueOf
		boolean b = true;
		char[] letters = { 'a', 'b', 'c', 'd', 'e' };
		double d = 2.492343;
		int i = 77;
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(letters));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(letters, 2, 2));
		System.out.println(String.valueOf(letters));
/*		
		//replace
		System.out.println(fullName.replace('D', 'T'));
		
		//trim
		System.out.println(in4.trim());

		//substring
		String lastName = fullName.substring(fullName.indexOf('G'));
		String middleName = fullName.substring(fullName.lastIndexOf('D'), fullName.lastIndexOf(' '));

		char[] nameArr = new char[fullName.length() - lastName.length()];
		
		//toCharArray
		char[] nameArray = fullName.toCharArray();

		//getChars
		fullName.getChars(fullName.indexOf('D'), fullName.lastIndexOf(' '), nameArr, 0);
		for (char r : nameArray)
			System.out.print(r);
			
		//concat
		System.out.println(middleName.concat(lastName));

		/*
		//startsWith()
		if (in.startsWith("four"))
			System.out.println("The string starts with 'four'");
		
		//endsWith()
		if (in.endsWith("ago"))
			System.out.println("The string ends with 'ago'");
			
		//regionMatches() case-sensitive comparison
		if (in.regionMatches(15, in2, 6, 11))
			System.out.println("The regions match");
		
		//regionMatches() case-insensitive comparison
		if (in.regionMatches(true, 15, in2.toUpperCase(), 6, 11))
			System.out.println("The regions still match");
			
		//indexOf(), char
		System.out.println("r appears at the following locations");
		int position = in.indexOf('r');
		while (position != -1) {
			System.out.println(position);
			position = in.indexOf('r', position + 1);
		}
		
		//indexOf(), substring
		System.out.println("'and' appears at the following locations");
		int position = in3.indexOf("and");
		while (position != -1) {
			System.out.println(position);
			position = in3.indexOf("and", position + 1);
		}

		//lastIndexOf()
		System.out.println("r appears at the following locations in reverse order");
		position = in.lastIndexOf('r');
		while (position != -1) {
			System.out.println(position);
			position = in.lastIndexOf('r', position - 1);
		}

		//lastIndexOf()
		System.out.println("'and' appears at the following locations");
		int position = in3.lastIndexOf("and");
		while (position != -1) {
			System.out.println(position);
			position = in3.lastIndexOf("and", position - 1);
		}
		*/
	}
}
