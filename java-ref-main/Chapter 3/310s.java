/* Chapter 3.10 Displaying formatted output with String.format and System.out.printf methods

	--> System.out.printf allows one to format output in a variety of ways, and String.format allows one to format a string without having to display it
	--> in most cases, the System.out.printf method is called in the following manner:		System.out.printf(FormatString, ArgumentList)
	--> FormatString contains text, special formatting specifiers or both while ArgumentList represents argument(s) which will be formatted according to the format specifiers
	--> a format specifier is a placeholder for a value that will be inserted into the string when it is displayed e.g. %f (floating-point values), %d (integers), %s (strings)
	--> there's a one-to-one correspondence between the format specifiers and the arguments that appear after the format string
	--> the general sysntax for writing a format specifier:		%[flags][width][.precision]conversion		(those in square brackets are optional)
	--> flags can be used to left-justify numbers, pad numbers with leading zeros, display numbers with comma separators etc.
	--> width specifies the minimum field width, which is the minimum number of spaces to be used to display values
	--> precision refers to the number of decimal points that are to be displayed
	--> when formatting string arguments, one uses format specifier %s, optionally specify field width and optionally left-justify
	--> to display formatted output in a graphical display, the String.format method is used which has the same syntax of formatting as System.out.printf method

*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Simple310 {
	public static void main(String[] sth) {
		float num1 = 123.345F, num2 = 53.5756F;
		double num3 = 2332.632, num4 = 9.98782;
		float num6 = 1223.2F, num7 = 991334.2F;
		System.out.printf("%f and %f\n", num1, num2);		//using one-to-one correspondence
		System.out.printf("%12.1f\n%12.1f\n%12.1f\n%12.1f\n", num3, num4, num6, num7);		//combining minimum field width and precision
		System.out.printf("%09.1f\n%09.1f\n%09.1f\n%09.1f\n", num3, num4, num6, num7);		//combining padding with precision and field width
		System.out.printf("%,9.1f\n%,9.1f\n%,9.1f\n%,9.1f\n", num3, num4, num6, num7);		//using commas as flags while specifying width and precision
		System.out.printf("%-9.1f\n%-9.1f\n%-9.1f\n%-9.1f\n", num3, num4, num6, num7);		//left-justifying
		JOptionPane.showMessageDialog(null, String.format("This is a formatted number %06.2f", num4));
	}
}

