/* Chapter 4.10b Appending Data

	--> appending to a file refers to writing new data after the end of the data that already exists in the file
	--> in order to append data to an existing file, an instance of the FileWriter class is initially created, then pass two arguments
		to the FileWriter constructor; a string containing the name of the file, and the boolean value true i.e.
						FileWriter sampleInstance = new FileWriter("SampleFile.txt", true); 	//if file is non-existent, it is created
	--> the statement opens the file for writing and any data written to the file will be appended to the file's existing contents
	--> to write data to the file, a PrintWriter object has to be created so as to use the print and println methods
	--> when the PrintWriter object is created, the FileWriter object reference is passed as an argument to the PrintWriter constructor i.e.
				PrintWriter samplePrint = new PrintWriter(sampleInstance); //samplePrint object can be used to write data to SampleFile.txt
	--> the FileWriter class also throws an exception if the file cannot be opened for any reason

*/

import java.util.Scanner;
import java.io.*;

public class Simple410b {
	public static void main(String[] sth) throws IOException {
		Scanner newScan = new Scanner(System.in);
		System.out.print("Do you want to add some extra friends to Friends.txt? ");
		String answerS = newScan.nextLine();
		if ( answerS.charAt(0) == 'y') {
			FileWriter appendingFile = new FileWriter("Friends.txt", true);
			PrintWriter writingFile = new PrintWriter(appendingFile);
			System.out.print("How many friends will you add? ");
			int friendsNumber = newScan.nextInt();
			newScan.nextLine();
			for (int count = 1; count <= friendsNumber; count++) {
				System.out.printf("Enter the name of friend number %d: ", count);
				answerS = newScan.nextLine();
				writingFile.println(answerS);
			}
			writingFile.close();
			System.out.println("Data written to the file.");
		} else {
			System.out.println("Bye.");
		}
	}
}





