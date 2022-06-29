/* Chapter 9.4 The StringBuilder Class

	--> the StringBuilder class is similar to the String class, except that you may change the contents of StringBuilder objects
		and it also provides several useful methods the String class doesn't have
	--> String objects are immutable i.e. once you set the contents of a String object, you cant change the string value it holds
	--> objects from the StringBuilder class have methods that allow modification of their contents without creating a new object
		in memory; also, these objects grow or shrink in size as needed to accomodate changes
	--> the fact that String objects are immutable is rarely a problem, but in case a lot of changes are to be made by a program
		to one or more strings, StringBuilder objects are preferrable; efficiency is improved by reducing the number of String
		objects that must be created and then removed by the garbage collector
	--> The following is a list of three StringBuilder constructors i.e.
			StringBuilder()		StringBuilder(int length)		StringBuilder(String str)
	--> StringBuilder() constructor takes no arguments and gives the object enough space to hold 16 characters, but no characters
		are stored in it. StringBuilder(int length) gives an object enough space to hold 'length' characters, while no characters
		are stored in it. StringBuilder(String str) initializes an object with the string in str and the object's initial storage
		would be the length of the string plus 16
	--> one limitation with StringBuilder objects is that you can't use the assignment operator to assign strings to them
	--> the StringBuilder class provides many of the same methods as the String class i.e. charAt(), getChars(), substring(),
		indexOf(), lastIndexOf()
	--> the StringBuilder class also provides some additional methods that the String class doesn't have
	--> among them is the 'append' method which has several overloaded versions; those versions accept an argument, which can
		be of any primitive type, a char array or a String object. This method appends a string representation of their
		argument to the calling object's current contents i.e. object.append(item)
	--> another method is the 'insert' method which also has several overloaded versions similar to those of the 'append' method;
		this method inserts a value into the calling object's string; it accepts two arguments, an int specifying position where
		insertion should begin and the value to be inserted (a char array, a primitive type or a String object)
			object.insert(start, item)
	--> the StringBuilder class has a replace method that slightly differs from the String class' replace method; while the String
		class' replace method replaces the occurrences of one character with another character, the StringBuilder class' replace
		method replaces a specified substring with a string i.e. object.replace(start, end, str)
	--> 'start' and 'end' are integers that specify the start and end positions of a substring in the calling object (end position
		isn't part of the substring); after method execution, the substring is replaced with str
	--> the 'delete' and 'deleteCharAt' methods delete a substring or a character from a StringBuilder object; the setCharAt
		method changes a specified character to another value i.e.
			delete(start, end)		deleteCharAt(position)		setCharAt(position, char ch)
	--> in order to convert a StringBuilder object to a regular string, the object's toString method is called
	--> the Java API has a class named StringBuffer, which is essentially the same as the StringBuilder class, with the same
		constructors and methods. The difference is that the methods in the StringBuffer class are synchronized, thus safe to
		use in a multi-threaded application
	--> a multithreaded application runs multiple threads of execution concurrently; this makes it possible for more than one
		thread to access the same objects in memory at the same time; multithreaded applications demand that the methods be
		synchronized to prevent the possibility of data corruption
	--> the StringBuffer class is slower than the StringBuilder class because synchronization requires extra steps be taken;
		in an application where the object will not be accessed by multiple threads, the StringBuilder class should be used
		for best performance

*/

public class Medium904 {

	public static void main(String[] sth) {
	/*	StringBuilder city = new StringBuilder("In Washington DC");
		System.out.println(city);

		//append
		StringBuilder s = new StringBuilder();
		s.append("We sold ");
		s.append(12);
		s.append(" bushels of apples for KES ");
		s.append(800.95);
		System.out.println(s);

		//insert
		StringBuilder n = new StringBuilder("New City");
		char[] arr = { '3', '0', 'D', 'F' };
		n.insert(4, "York ");
		n.insert(13, arr);
		System.out.println(n);

		//replace
		StringBuilder s = new StringBuilder("We moved from Chicago to Atlanta");
		System.out.println(s);
		s.replace(14, 21, "New York");
		System.out.println(s);
0
		//delete, deleteCharAt, setCharAt
		StringBuilder s = new StringBuilder("I ate 100 blueberries");
		System.out.println(s);
		s.deleteCharAt(8);
		System.out.println(s);
		s.delete(9, 13);
		System.out.println(s);
		s.setCharAt(6, '5');
		System.out.println(s);
*/
		//toString
		StringBuilder s = new StringBuilder("Converting to a string object shortly...");
		String sn = s.toString();
		System.out.println(sn);
	}
}