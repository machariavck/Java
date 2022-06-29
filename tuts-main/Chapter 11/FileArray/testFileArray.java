
public class testFileArray {

	public static void main(String[] sth) {
		//writeArray();
		readArray();
	}


	public static void readArray() {
		System.out.println("\nReading an array from the file Arr.dat..\n");
		int[] r = new int[11];
		FileArray.readArray("Arr.dat", r);
		for (int i : r)
			System.out.print("{" + i + "} ");
		System.out.println("\n\nFile has been read\n");
	}


	public static void writeArray() {
		int[] rr = { 1, 3, 4, 5, 6, 7, 19, 20, 30, 20, 10 };
		System.out.println("\nHere's the array:\n");
		for (int i : rr)
			System.out.print("{" + i + "} ");
		FileArray.writeArray("Arr.dat", rr);
		System.out.println("\n\nIt has been written to the file Arr.dat");
	}
}