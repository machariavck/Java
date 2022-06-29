import java.util.Scanner;
import java.io.*;

public class SalesReceipt {

	public static void main(String[] sth) throws IOException {

		Scanner sc = new Scanner(System.in);
		RetailItem book = new RetailItem("The Bold and the Beautiful", 500, 100.00);
		System.out.println("\nHello. How many items are you purchasing?");
		int q = sc.nextInt();
		CashRegister cr = new CashRegister(book, q);
		System.out.println("\n" + cr);
		File of = new File("SalesReceipt.txt");
		PrintWriter write = new PrintWriter(of);
		write.println("\n" + cr);
		write.close();
		System.out.println("\nReceipt Generated");

	}
}