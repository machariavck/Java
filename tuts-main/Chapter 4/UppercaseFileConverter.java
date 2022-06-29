
import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter {
	public static void main(String[] sth) throws IOException {
		String statements;
		Scanner userIn = new Scanner(System.in);		
		System.out.println("Welcome to the uppercase file converter. Which file do you want to convert?");
		String inputFileName = userIn.nextLine();
		File readFile = new File(inputFileName);
		while (!readFile.exists()) {
			System.out.println("This file does not exist. Please retry again.");
			inputFileName = userIn.nextLine();
			readFile = new File(inputFileName);
		}
		Scanner newReadFile = new Scanner(readFile);
		System.out.println("Where should I send the output?");
		String outputFileName = userIn.nextLine();
		File checkingFile = new File(outputFileName);
		while (!checkingFile.exists()) {
			System.out.println("This file does not exist. Please retry.");
			outputFileName = userIn.nextLine();
			checkingFile = new File(outputFileName);
		}
		FileWriter appendFile = new FileWriter(outputFileName, true);
		PrintWriter editFile = new PrintWriter(appendFile);
		while (newReadFile.hasNext()) {
			statements = newReadFile.nextLine();
			editFile.println(statements.toUpperCase());
		}
		System.out.println("Your file has been converted successfully. Go check.");
		newReadFile.close();
		editFile.close();
		System.exit(0);		
	}
}
