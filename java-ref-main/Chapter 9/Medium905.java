/* Chapter 9.5 Tokenizing Strings

	--> tokenizing a string refers to breaking a string down into its components (i.e. tokens) using the String class 'split' method
	--> sometimes a string contains a series of words or other items of data separated by spaces or other characters e.g.
				"peach raspberry strawberry vanilla"	or	"17;32;83;23;33;189"	or	"3-22-15"	or	"/home/root/documents"
	--> in programming terms, these items are referred to as 'tokens'; and the character separating tokens is known as a 'delimiter'
	--> some programming problems require reading a string containing a list of items and then extracting all of the tokens from the
		string for processing e.g. extracting directory names from a pathname, extracting the month, day and year from a date
	--> the split() method from the String class is used to tokenize strings and returns an array of String objects; an argument is
		is usually passed which indicates the delimiter i.e. example1
	--> the argument passed to the split method is a 'regular expression'; a regular expression is a string that specifies a pattern
		of characters; regular expressions can be powerful tools commonly used to search for patterns that exists in strings, files,
		or other collections of text; some basic uses of regular expressions are used in tokenizing strings
	--> the 'split' method enables use of multi-character delimiters, where the delimiter takes multiple characters i.e. example2
	--> moreso, a series of characters can be specified where each would be a delimiter, and these are enclosed in brackets inside
		the regular expression i.e. example3
	--> when using characters other than whitespaces as delimiters, it's good to trim the string before tokenizing it i.e. example4

*/

public class Medium905 {

	public static void main(String[] sth) {

		//example1
		String s = "one two three four";
		String[] tokens = s.split(" ");
		for (String i : tokens)
			System.out.println(i);

		//example2
		String s = "one and two and three and four";
		String[] tokens = s.split(" and ");
		for (String i : tokens)
			System.out.println(i);
		
		//example3
		String s = "java@code.com";
		String[] tokens = s.split("[@.]");
		for (String i : tokens)
			System.out.println(i);
		
		//example4
		String s = " one;two;three;four ";
		String[] tokens = (s.trim()).split(";");
		for (String i : tokens)
			System.out.println("*" + i + "*");
	}
}
