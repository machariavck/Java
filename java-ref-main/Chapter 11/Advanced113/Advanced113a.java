/* Chapter 11.3 - Advanced Topics: Binary Files

	--> a binary file is a file containing raw binary data; it's content isn't formatted as text and isn't meant to be opened in a text editor
	--> all the files previously worked with are text files; even a number, when stored in a text file, is converted to text i.e. when a number
		is written to a text file, it is stored as characters e.g. an int 1297 is stored as '1', '2', '9', '7'
	--> when a number is stored in the computer's memory, it isn't stored as text, however, it's formatted to a binary number e.g.
			int 1297 to binary:		00000000	00000000	00000101	00010001		//int variables occupy 4 bytes
	--> the above is a representation of the way raw data is stored in memory (raw binary format)
	--> storing data in its binary format is more efficient than storing it as text; that's because there are fewer conversions to take place
		and there are some types of data that should only be stored in their raw binary format e.g. images
	--> when data is stored in a binary file, the file can't be opened in a text editor (a text editor opens a file assuming it contains text)
	--> to write data to a binary file, objects have to be created from the following classes; FileOutputStream and DataOutputStream
	--> FileOutputStream allows opening a file for writing binary data and establishes a connection with it; however, basic functionality of
		writing bytes to files is provided
	--> DataOutputStream allows writing data of any primitive type or String objects to a binary file; the class itself cannot directly access
		a file, thus is used in conjunction with a FileOutputStream object that has a connection to a file e.g.
			FileOutputStream f = new FileOutputStream("MyInfo.dat");
			DataOutputStream d = new DataOutputStream(f);					//these two are part of the java.io package
	--> if the file being opened with the FileOutputStream object already exists, it's erased and an empty file by the same name is created
	--> the FileOutputStream constructor throws an IOException if an error occurs when it attempts to open the file
	--> once the DataOutputStream object is created, binary data can be written to the file using the some of the DataOutputStream methods
		below (each method listed throws an IOException if an error occurs) i.e.
			void {close(), writeBoolean(boolean b), writeByte(byte b), writeChar(int c), writeDouble(double d), writeFloat(float f), 
					writeInt(int i), writeLong(long n), writeShort(short s), writeUTF(String s)}
	--> close() closes the file; writeChar() accepts an int assumed to be a character code and writes the character represented to the file
		as a two-byte Unicode character, writeUTF writes the String object passed in the parameter to the file using Unicode Text Format
	--> to read data from a binary file, the FileInputStream and DataInputStream are used; the FileInputStream allows opening a file for
		reading binary data and establish a connection with it, and only provides the basic functionality of reading bytes from the file
	--> DataInputStream allows reading data of any primitive type, or String objects, from a binary file; it can't directly access the file,
		thus used in conjunction with a FileInputStream object that has a connection with the file; both classes are imported from java.io
	--> to open a binary file for input, a DataInputStream object is wrapped around a FileInputStream object
	--> the FileInputStream constructor throws a FileNotFoundException if the file named by the string argument can't be found; here are
		examples of DataInputStream methods (which throw an EOFException if the end of the file has already been reached) i.e.
			void close, boolean readBoolean, byte readByte, char readChar, datatype read[int,long,double,short,float] , String readUTF
	--> readChar reads a char value from a file an returns it; the character is expected to be stored as a two-byte Unicode character, as
		written by the DataOutputStream class' writeChar method; readUTF reads a string from the file and returns it as a String object; the
		string must have been written with the DataOutputStream class' writeUTF method
	--> to write a string to a binary file, the DataOutputStream class' writeUTF method should be used; this method writes its string arg in a
		format called 'UTF-8 encoding'; this encoding first writes a two-byte integer indicating the number of bytes that the string occupies,
		then it writes the string's characters in Unicode; when the DataInputStream class' readUTF method reads from the file, it expects the
		first two bytes to contain the number of bytes the string occupies, then it reads that many bytes and returns them as a string
	--> to append new data to a file, the FileOutputStream constructor takes an optional second argument, which must be a boolean value; if
		true, the file isn't erased if it already exists and new data is appended; if false, the file is erased if it already existed

*/

import java.io.*;

public class Advanced113a {

	public static void main(String[] sth) {
		binaryFiles();
	}

	public static void binaryFiles() {
		try {
			//writeBinaryFile();
			//appendData();
			readBinaryFile();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}


	public static void writeBinaryFile() throws IOException {
		int[] num = { 2, 4, 6, 8, 10, 12, 14 };
		DataOutputStream d = new DataOutputStream(new FileOutputStream("sales.dat"));
		System.out.println("\nWriting numbers to the file...");
		for (int i : num)
			d.writeInt(i);
		System.out.println("Done");
		d.close();
	}


	public static void appendData() throws IOException {
		int[] num = { 10, 12, 14 };
		DataOutputStream d = new DataOutputStream(new FileOutputStream("sales.dat", true));
		System.out.println("\nAppending numbers to the file...");
		for (int i : num)
			d.writeInt(i);
		System.out.println("Done");
		d.close();
	}


	public static void readBinaryFile() throws IOException {
		System.out.println("Reading numbers..");
		DataInputStream d = new DataInputStream(new FileInputStream("sales.dat"));
		boolean stop = false;
		while (!stop) {
			try {
				System.out.println(d.readInt());
			} catch (EOFException e) {
				stop = true;
			}
		}
		System.out.println("Done...");
		d.close();
	}
}