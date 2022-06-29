import java.io.*;

class tryWithResources {

	public static void main(String[] sth) {
		write();
	}


	public static void write() {
		try (var r = new RandomAccessFile("bool.dat", "rw")) {
			r.writeBoolean(true);
			System.out.println("File written");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}