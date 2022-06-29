/*
	--> only used on long, int, short, char or byte
	--> used in systems-level programming tasks in which status info from a device must be interrogated or constructed
		'AND' - commonly used to turn bits off; any bit that's 0 in either operand will set the corresponding bit in the outcome to 0
		'OR' - is a reverse of AND, turns bits on; any bit set to 1 in either operand sets the corresponding bit in the result to 1
		'XOR' - results in a set bit strictly if the bits being compared are different; the outcomes of two XORs using the same key produces the original value
		'NOT' - unary NOT (one's complement) reverses the state of all the bits of the operand
	--> it's possible to shift the bits that make up a value to the left or to the right by a specified amount
		value { << | >> | >>> } num-bits		- 'value' is the value being shifted by the number of bit positions specified by 'num-bits'
	--> each left shift causes all bits within the specified value to be shifted left one position and a 0 bit be brought in on the right (same idea on right shift)
	--> Java uses 'two's complement' to represent negative values; where negative values are stored by first reversing the bits in the value and then adding 1
	--> a right shift on a negative number brings in a 1 on the left; for a positive value, a 0 is brought in from the left
	--> an unsigned right shift always brings in a 0 on the left, thus doesn't preserve the sign bit (also called 'zero-fill' right shift)
	--> in all shifts, the bits shifted out are lost and there's no way to retrieve them back
	--> in an expression, byte and short values are first automatically promoted to int and then they are evaluated
	--> when shifting a negative byte or short value, it is sign-extended when it's promoted to int i.e. high-order bits of the resulting int value are filled with ones
	--> a normal right shift would proceed normally, but a zero-fill right shift would have to shift 24 ones before the byte value begins to see zeros 

*/

class BitwiseOperations {

	public static void main(String[] sth) {
		//and();
		//or();
		//xor();
		//not();
		shift();
	}

	static void shift() {
	//	System.out.println((byte)0b1011_1111);	//prints -65
		int var = -100;
		print((char)var);
		System.out.println("\n\nvar after a right shift:");
		var = var >> 1;
		print((char)var);
		System.out.println("\n\nvar after 20 unsigned right shifts:");
		var = var >>> 20;
		print((char)var);
		System.out.println("\n\nvar after two left shifts:");
		var <<= 2;
		print((char)var);
	}

	static void not() {
		char ch = 65;
		System.out.println("Before: ");
		print(ch);
		ch = (char) ~ch;	// tilde symbol
		System.out.println("\nAfter: ");
		print(ch);
	}


	static void xor() {
		//cipher program
		String message = "%$7$-.1$3";
		System.out.println("Here's the message: " + message);
		System.out.print("Here's the encoded message: ");
		for (char n : message.toCharArray())
			System.out.print(((char) (n ^ 65)) + " ");

	}


	static void or() {
		//changing uppercase to lowercase, increment 32
		char ch = 'A';
		ch = (char) (ch | 0b0010_0000);
		System.out.println("ch has the value " + ch);
	}


	static void and() {
		//changing lowercase to uppercase, decrement 32
		char ch = 'a';
		ch = (char) (ch & 0b1101_1111);
		System.out.println("ch has the value " + ch);

		//determining whether a bit is on or off
		if ((ch & 64) != 0) System.out.println("bit 7 is on");
	
		//display the bits within a byte
		print(ch);
	}


	static void print(char ch) {
		for (int t = (int)(Math.pow(2, 15)); t > 0; t /= 2) {
			if ((ch & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}
}
