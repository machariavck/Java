/* Chapter 4.10c Specifying the File Location, Reading Data from a File

	--> on a Windows computer, paths contain backslash characters and since these characters have been used to represent escape sequences in
		string literals, two backslash characters are used in paths to represent a single backslash character
	--> if the program asks the user to enter a path into a String object, which is then passed to the PrintWriter or FileWriter constructor,
		the user doesn't have to enter double backslashes
	--> moreso, Java enables substituting double backslashes in Windows with single forward-slashes
	--> when using the Scanner class previously, System.in was passed as an argument to the Scanner class constructor, which represents the
		input from the keyboard. To read input from a file, a reference to a File object is passed as an argument
	--> when a file is opened for reading, a special value called read position is internally maintained for that file, which is set to
		the first item in the file. After an item is read, the read position advances to the next item in the file
	--> the string returned from the nextLine method will not contain the newline character

*/

import java.util.Scanner;
import java.io.*;

public class Simple410c {

	public static void main(String[] sth) throws IOException {
		Scanner newScan = new Scanner(System.in);
		FileWriter appendFile = new FileWriter("/home/victor/Friends.txt", true);
		PrintWriter writeFile = new PrintWriter(appendFile);
		writeFile.println("This is a new chapter in my life");
		writeFile.println("I will try to make this world a better place");
		writeFile.close();
		File readingFile = new File("/home/victor/Friends.txt");
		Scanner anotherScan = new Scanner(readingFile);
		System.out.println("The first line is: ");
		System.out.println(anotherScan.nextLine());
		System.out.println("The second line is: ");
		System.out.println(anotherScan.nextLine());
		anotherScan.close();
	}
}





