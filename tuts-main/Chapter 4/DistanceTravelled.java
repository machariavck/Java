
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class DistanceTravelled {
	public static void main(String[] sth) throws IOException {
		byte time;
		short speed, distance;
		Scanner userIn = new Scanner(System.in);
		System.out.print("Hello, I calculate distance travelled. First, provide me with speed in miles-per-hour: ");
		speed = userIn.nextShort();
		while (speed < 1 || speed > 200) {
			System.out.print("\nIncorrect value. Try again: ");
			speed = userIn.nextShort();
		}
		System.out.print("\nNow provide with the hours the vehicle took: ");
		time = userIn.nextByte();
		while (time < 1 || time > 100) {
			System.out.print("\nIncorrect time value. Try again: ");
			time = userIn.nextByte();
		}
		PrintWriter writingFile = new PrintWriter("/home/victor/sP/report.txt");
		writingFile.println("\n\tHour			Distance Travelled");
		writingFile.println("\t-------------------------------------------");
		for (int count = 1; count <= time; count++) {
			distance = (short)(count * speed);
			writingFile.printf("\t %d					%d\n", count, distance);
		}
		writingFile.close();
		System.exit(0);
	}
}
