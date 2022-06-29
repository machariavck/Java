import java.io.*;
import java.util.*;

public class FileEncryption {

	public static void main(String[] sth) throws IOException {
		//writeFile();
		//encryptFile();
		//readEncryptedFile();
		readDecryptedFile();
		
	}


	public static void readDecryptedFile() throws IOException {
		RandomAccessFile r = new RandomAccessFile("encryptedFile.dat", "rw");
		System.out.println("\nEnter the decryption key below in the following format: DIGIT-CHARACTER-DIGIT-CHARACTER");
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		while (g.length() != 4 || !Character.isLetter(g.charAt(1)) || !Character.isDigit(g.charAt(0)) || !Character.isDigit(g.charAt(2)) || !Character.isLetter(g.charAt(3))) {
			System.out.println("Incorrect format. Enter the key again");
			g = sc.nextLine();
		}
		System.out.println("\nHere are the contents of the decrypted file..\n");
		for (int i = 0; i < (r.length() / 4); i++)
			System.out.print("{" + decrypt(r.readInt(), g) + "} ");
		System.out.println("\n\nFile decrypted and read successfully..\n");
		r.close();
	}


	public static int decrypt(int t, String g) {
		return (t - ((g.charAt(1) * g.charAt(2)) - g.charAt(3))) / (int)(Math.pow(3, Integer.parseInt(g.substring(0,1))));
	}


	public static void readEncryptedFile() throws IOException {
		RandomAccessFile r = new RandomAccessFile("encryptedFile.dat", "rw");
		System.out.println("\nContents of the encrypted file..\n");
		for (int i = 0; i < (r.length() / 4); i++)
			System.out.print("{" + r.readInt() + "} ");
		System.out.println("\n\nFile read successfully..\n");
		r.close();
	}

	public static void encryptFile() throws IOException {
		RandomAccessFile r1 = new RandomAccessFile("rawFile.dat", "r");
		RandomAccessFile r2 = new RandomAccessFile("encryptedFile.dat", "rw");
		System.out.println("\nEnter the encryption 4-digit key in this format: DIGIT-CHARACTER-DIGIT-CHARACTER");
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		while (g.length() != 4 || !Character.isLetter(g.charAt(1)) || !Character.isDigit(g.charAt(0)) || !Character.isDigit(g.charAt(2)) || !Character.isLetter(g.charAt(3))) {
			System.out.println("Incorrect. Enter the key again");
			g = sc.nextLine();
		}
		int t;
		for (int i = 0; i < (r1.length() / 4); i++) {
			t = r1.readInt();
			r2.writeInt(encrypt(t, g));
		}
		r1.close();
		r2.close();
		System.out.println("\nrawFile.dat has been encrypted and saved to encryptedFile.dat\n");
	}


	public static int encrypt(int t, String g) {
		return (t * (int)Math.pow(3, Integer.parseInt(g.substring(0,1)))) + ((g.charAt(1) * g.charAt(2)) - g.charAt(3));
	}


	public static void writeFile() throws IOException {
		int[] t = { 1, 3, 4, 5, 6, 9, 19, 23, 29 };
		System.out.println("\nThe following array will be written to a file..\n");
		RandomAccessFile r = new RandomAccessFile("rawFile.dat", "rw");
		for (int i : t) {
			System.out.print("{" + i + "} ");
			r.writeInt(i);
		}
		r.close();
		System.out.println("\n\nThe array data has been written to the file rawFile.dat\n");
	}
}