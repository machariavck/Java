import java.io.*;

public class FileArray {

	public static void writeArray(String n, int... r) {
		try {
			DataOutputStream d = new DataOutputStream(new FileOutputStream(n));
			for (int t : r)
				d.writeInt(t);
			d.close();
		} catch (IOException e) {
			System.out.println("Unknown error occurred");
		}
	}

	public static void readArray(String n, int... r) {
		try {
			DataInputStream d = new DataInputStream(new FileInputStream(n));
			boolean b = true;
			int count = 0;
			while (b) {
				try {
					r[count] = d.readInt();
					count++;
				} catch (EOFException f) {
					b = false;
				}
			}
			d.close();
		} catch (FileNotFoundException f) {
			System.out.println("File was not found");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public static void readArrayBetter(String n, int... r) {
		try {
			RandomAccessFile d = new RandomAccessFile(n, "r");
			for (int i = 0; i < (d.length() / 4); i++)
				r[i] = d.readInt();
			d.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}