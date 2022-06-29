/* Chapter 4.10e Checking for a File's Existence When Using it for Output

	--> when opening a file for output, sometimes you want to make sure the file doesn't exist; using a PrintWriter object to open a file usually deletes
		an existing file
	--> if you dont want to erase the existing file, you have to check for its existence before creating the PrintWriter object; the File class' 
		exists() method can be used in this type of situation
	--> if you have a reference to a File object that represents the file you wish to open, you have the option of passing it to the PrintWriter constructor

*/

import java.util.Scanner;
import java.io.*;

public class Simple410e {

	public static void main(String[] sth) throws IOException {
		Scanner newScan = new Scanner(System.in);
		System.out.print("T'sup bro. How many friends do you have? ");
		int friendsNumber = newScan.nextInt();
		System.out.print("Enter the filename: ");
		newScan.nextLine();
		String fileName = newScan.nextLine();
		File readFile = new File(fileName);
		if (readFile.exists()) {
			System.out.println("That file exists!");
			System.exit(0);
		}
		PrintWriter newFile = new PrintWriter(readFile);
		for (int count = 1; count <= friendsNumber; count++) {
			System.out.printf("Enter the name of friend number %d: ", count);
			fileName = newScan.nextLine();
			newFile.println(fileName);
		}
		newFile.close();
		System.out.println("Data written to the file.");
	}
}





