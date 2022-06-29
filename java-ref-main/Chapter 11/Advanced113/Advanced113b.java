/* Chapter 11.3 - Advanced Topics: Random Access Files

	--> so far, all programs created have been accessing files sequentially i.e. when a file is opened for input, its read position is at the file's
		beginning, and as reading continues, the file's read position advances sequentially through the file's contents
	--> sequential file access poses a problem, where in order to read a specific byte from the file, all bytes preceding it must be read first
		e.g. to access data stored at the hundredth byte of a file, a program has to read the first 99 bytes to reach it
	--> this can slow down a program tremendously, especially when a file is very large
	--> alternatively, Java allows a program to perform random file access, where a program may immediately jump to any location in the file without
		first reading the preceding bytes; the RandomAccessFile class in the java.io package is used i.e.
				RandomAccessFile(String fileName, String mode)
	--> first argument is the name of the file; the second argument indicates the mode in which to use the file, either "r" for reading or "rw" for
		reading and writing
	--> if a file is opened in "r" mode, a FileNotFoundException is thrown if the file is non-existent and an IOException is thrown if one tries to
		write it
	--> if an existing file is opened in "rw" mode, it isn't deleted, and the file's existing contents are preserved; if a non-existent file is
		opened in "rw" mode, it's created
	--> a file opened or created with the RandomAccessFile class is treated as a binary file and can be processed sequentially with this class; in
		fact, the RandomAccessFile class has the same methods as the DataOutputStream and DataInputStream classes for writing and reading data
	--> the RandomAccessFile treats a file as a stream of bytes; the bytes are numbered with the first byte being byte 0 and the last byte number
		being one less than the number of bytes in the file (similar to an array's subscripts)
	--> internally, the RandomAccessFile class keeps a long integer value known as the 'file pointer' which holds the byte number of a location in
		the file; when a file is first opened, the file pointer is set to zero (pointing to the first byte in the file)
	--> when an item is read from the file, it's read from the byte that the file pointer points to; reading causes the file pointer to advance to
		the byte just beyond the item that was read e.g. if the file pointer points to byte 0 and an int is read, since an int is 4 bytes in size,
		4 bytes will be read from the file starting at byte 0; after the value is read, the file pointer advances to byte number 4, which is the 5th
		byte in the file; if another item is immediately read, the reading begins at byte number 4; if the file pointer refers to a byte number that
		is beyond the end of the file, an EOFException is thrown when a read operation is performed
	--> writing also takes place at the location pointed to by the file pointer; if the file pointer points to the end of the file when a write
		operation is performed, then data will be appended; if the file pointer holds the number of a byte within the file, at a location where data
		is already stored, then a write operation causes data to be written over the existing data at that location
	--> the RandomAccessFile class allows moving the file pointer such that reading or writing data can be done instantly at any byte location in the
		file; to move the file pointer, the 'seek' method is used i.e.
				void seek(long position)	// the argument is the number of the byte where the file pointer is moved to
	--> although a file might contain chars, ints, doubles, strings, etc., the RandomAccessFile sees it only as a stream of bytes; the class is
		unaware of the data types of the data stored in the file, and it can't determine where one item of data ends and another begins; it's ones'
		responsibility to know how the data is structured from a random access file; one should remember to take a data type's size into account
	--> the length of a file is returned by the RandomAccessFile class' length method, and has a long data type

*/

import java.io.*;

public class Advanced113b {

	public static void main(String[] sth) throws IOException {
		//writingChars();
		readChars();
		//writeBool();
	}


	public static void writeBool() throws IOException {
		RandomAccessFile r = new RandomAccessFile("bool.dat", "rw");
		r.writeBoolean(true);
		r.close();
		RandomAccessFile n = new RandomAccessFile("bool.dat", "r");
		System.out.println(n.readByte());
		n.close();
	}


	public static void readChars() throws IOException {
		RandomAccessFile r = new RandomAccessFile("letters.dat", "r");
		final int CHAR_SIZE = 2;
		r.seek(CHAR_SIZE * 18);
		System.out.println(r.readChar());
		r.close();
	}


	public static void writingChars() throws IOException {
		char[] letters = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
		RandomAccessFile r = new RandomAccessFile("letters.dat", "rw");
		for (char l : letters)
			r.writeChar(l);
		r.close();
		System.out.println("Done");
	}
}
