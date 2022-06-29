/* Chapter 11.3 - Advanced Topics: Object Serialization

	--> objects fields can be retrieved and saved to a file as fields in a record; but if an object contains other types of objects as fields, the
		process of saving its contents can become complicated; Java allows 'serializing' objects, which simplifies how objects are saved to a file
	--> serializing an object converts it to a series of bytes containing the object's data; if the object is set up properly, even other objects it
		might contain as fields are automatically serialized; the resulting set of bytes can then be saved to a file for later retrieval
	--> in order for an object to be serialized, its class must implement the 'Serializable' interface from the java.io package; it has no methods or
		fields and it's only used to let the compiler know that objects of the class might be serialized; moreso, if a class contains objects of other
		classes as fields, those classes must also implement the Serializable interface in order to be serialized
	--> to write a serialized object to a file, an ObjectOutputStream object is used to perform serialization (converting an object to a series of bytes)
		and to write the bytes to a file, an output stream object must be used i.e. FileOutputStream
	--> the ObjectOutputStream class' writeObject method is used to serialize an object and write it to a file; it throws IOException if an error occurs
	--> the process of reading a serialized object's bytes and constructing an object from them is known as 'deserialization'; it's done with an
		ObjectInputStream object, along with a FileInputStream object
	--> to read a serialized object from a file, the ObjectInputStream class' readObject method is used; the method returns a deserialized object which
		must be casted to the desired class type; this method can throw a number of different exceptions if an error occurs (more on API documentation)
	--> when a class implements the Serializable interface, all of its fields must be serializable; primitive variables happen to be serializable just
		the way they are; for reference variables, the object referenced by that variable should also be serializable; if it doesn't, the 'transient'
		keyword should be used in the reference variable declaration e.g.
			private transient SomeClass refVar;
	--> the transient keyword makes the object referenced by the refVar be skipped by the compiler during the serialization process; the String class
		and most of the other classes found in the Java API implement the Serializable interface

*/

import java.io.*;
import java.util.*;

public class Advanced113c {

	public static void main(String[] sth) throws IOException {
		Scanner sc = new Scanner(System.in);
		//writeObjects(sc);
		readObjects();
	}


	public static void writeObjects(Scanner s) throws IOException {
		FileOutputStream out = new FileOutputStream("Objects.dat");
		ObjectOutputStream o = new ObjectOutputStream(out);
		float balance;
		final int NUM_ITEMS = 3;
		BankAccount[] acc = new BankAccount[NUM_ITEMS];
		for (int i = 0; i < NUM_ITEMS; i++) {
			System.out.print("\nEnter balance for account " + (i + 1) + ": ");
			try {
				acc[i] = new BankAccount(s.nextFloat());
				o.writeObject(acc[i]);
			} catch (NegativeStartingBalance e) {
				System.out.println(e.getMessage());
			}
		}
		o.close();
	}


	public static void readObjects() throws IOException {
		FileInputStream in = new FileInputStream("Objects.dat");
		ObjectInputStream o = new ObjectInputStream(in);
		//BankAccount acc = (BankAccount) o.readObject();
		int count = 0;
		boolean stop = false;
		while (!stop) {
			count++;
			try {
				System.out.println("Account " + count + " " + (BankAccount)(o.readObject())); 
			} catch (Exception e) {
				stop = true;
				System.out.println("done");
			}
		}
	}
}