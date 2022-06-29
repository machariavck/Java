/* Chapter 4.10a Introduction to File Input and Output

	--> several classes can be used to write and read data from a file
	--> to write data to a file, PrintWriter class can be used or FileWriter class
	--> to read data from a file, the Scanner class can be used or the File class
	--> in order to work with files, a number of classes are provided by the java API, which are imported using java.io.*
	--> if the file to be opened with the PrintWriter object already exists, it is erased and an empty file by the same name is created
	--> the application should always close files when finished with them. This is because the system creates one or more buffers when a
			file is opened. When a program writes data to a file, the data is first written to the buffer. When the buffer is filled, all
			the info stored there is written to the file. This technique increases the system's performance because writing data to memory
			is faster than writing it to a disk. The close method writes any unsaved data remaining in the file buffer
	--> once a file is closed, the connection between it and the PrintWriter object is removed. In order to perform further operations
			on the file, it must be opened again
	--> a newline character separates the contents of a file into lines and also serves as a delimiter (an item that separates other items)
	--> an exception is thrown when an unexpected event occurs in a Java program. When an exception is thrown, the method that is
			executing must either deal with the exception or throw it again.
	--> PrintWriter objects are capable of throwing exceptions, which, for now, they can simply be rethrown by writing a throws clause
			in the method header. The throws clause must indicate the type of exception that might be thrown.
	--> any method that calls a method that uses a PrintWriter object should have a throws IOException clause in its header.

*/

import java.util.Scanner;
import java.io.*;

public class Simple410sa {

	public static void main(String[] sth) throws IOException {
		Scanner newScan = new Scanner(System.in);
		System.out.print("T'sup bro. How many friends do you have? ");
		int friendsNumber = newScan.nextInt();
		System.out.print("Enter the filename: ");
		newScan.nextLine();
		String fileName = newScan.nextLine();
		PrintWriter newFile = new PrintWriter(fileName);
		for (int count = 1; count <= friendsNumber; count++) {
			System.out.printf("Enter the name of friend number %d: ", count);
			String userInput = newScan.nextLine();
			newFile.println(userInput);
		}
		newFile.close();
		System.out.println("Data written to the file.");
	}
}
