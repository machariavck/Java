/* Chapter 4.10d Detecting the End of a File and Checking for a File's Existence

	--> a throws clause should always be included in the method header when a File object reference is passed to a Scanner class constructor
	--> the Scanner class has a method hasNext() used to determine if a file has more data to be read
	--> the hasNext() method is usually called before any other methods to read from the file
	--> if there's more data to be read from the file, hasNext() method returns true, and if the file's end has been reached, it returns false
	--> primitive values can also be read from a file and used to perform some mathematical operations
	--> to check if a file exists, you can use the File class' exists() method thus preventing an exception from being thrown if it doesn't exist, and thereby displaying a user-friendly error message while gracefully shutting down, instead of a cryptic error message
	--> when opening a file for output, sometimes you want to make sure the file doesn't exist. Using a PrintWriter object to open a file deletes an existing file. If you don't want to erase the existing file, you have to check for its existence before creating the PrintWriter object; the File class's exists() method can be used in this type of situation

*/

import java.util.Scanner;
import java.io.*;

public class Simple410d {
	public static void main(String[] sth) throws IOException {
		Scanner kbInput = new Scanner(System.in);
		File rdFile = new File("/home/victor/lF/Numbers.txt");
		if (!rdFile.exists()) {
			System.out.println("Your file does not exist");
			System.exit(0);
		}
		Scanner fileInput = new Scanner(rdFile);
		float total = 0, nuMber = 1;
		while (fileInput.hasNext()) {
			float newValue = fileInput.nextFloat();
			total += newValue;
			System.out.printf("Value %.0f is %.2f thus running total is %.2f\n", nuMber, newValue, total);
			nuMber++;
		}
		System.out.printf("The overall total is %.2f\n", total);
		fileInput.close();
	}
}





