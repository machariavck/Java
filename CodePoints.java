/*
	CODEPOINTS
	==========
	~ in the past, all Unicode characters could be held by 16 bits, which is the size of a char
	~ the character values ranged from 0 to FFFF
	~ currently, the Unicode character set has been expanded, supporting upto 32-bit Unicode Characters
	~ characters now range from 0 from 10FFFF
	~ 'code point' is a character in the range of 0 to 10FFFF
	~ characters that have values greater than FFFF are called 'supplemental characters'
	~ characters betweeen 0 and FFFF are referred to as the 'basic multilingual plane (BMP)'
	~ since supplemental characters have a value greater than a 'char' can hold, Java uses two ways to address this
	~ first, Java uses two characters to represent a supplemental character
	~ the first 'char' is called the 'high surrogate', and the second is called the 'low surrogate'
	~ methods such as codePointAt() were provided to translate between code points and supplemental characters
	~ secondly, Java overloaded several preexisting methods in the Character class, to use 'int' rather than 'char' data

*/

public class CodePoints {

	public static void main(String... sth) {
		/*
			static int codePointAt(CharSequence c, int t)
			static int codePointAt(char c[], int t)
		*/
		System.out.println(Character.codePointAt("abc", 1));					// prints 98

		/*
			static int codePointBefore(CharSequence c, int t)
			static int codePointBefore(char c, int t)
		*/
		System.out.println(Character.codePointBefore("abc", 1)); 				//	prints 97

		//	static int charCount(int cp) => returns 1 or 2
		System.out.println(Character.charCount(98));							//	prints 1
		System.out.println(Character.charCount(123456789));						//	prints 2

		//	static boolean isValidCodePoint(int cp)
		System.out.println(Character.isValidCodePoint(123456));					//	prints true
		System.out.println(Character.isValidCodePoint(1234567));				//	prints false

		// static boolean isSupplementaryCodePoint(int cp)
		System.out.println(Character.isSupplementaryCodePoint(123456));			// prints true
		System.out.println(Character.isSupplementaryCodePoint(12345));			// prints false
		System.out.println(Character.isSupplementaryCodePoint(1234567));		// prints false

		// static boolean isBmpCodePoint(int cp)
		System.out.println(Character.isBmpCodePoint(12345));					// prints true, max 65,535
		System.out.println(Character.isBmpCodePoint(1));						// prints true
		System.out.println(Character.isBmpCodePoint(123456));					// prints false

		/*
			static char[] toChars(int cp)
			static int toChars(int cp, char target[], int start) => return is either 1 or 2
		*/
		System.out.println(Character.toChars(65));								//	prints A
		char[] x = new char[2];
		System.out.println(Character.toChars(123456, x, 0));					//	prints 2

		//	Character Literals
		System.out.println('\141');												//	prints the letter 'a', octal (\ddd)
		System.out.println('\u0061');											//	prints the letter 'a', hex (\uXXXX)

	}
}
