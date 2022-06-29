import java.util.Scanner;

public class CashRegisterProgram {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		RetailItem book = new RetailItem("The Bold and the Beautiful", 500, 234.89);
		System.out.println("\nHello. How many items are you purchasing?");
		int q = sc.nextInt();
		CashRegister cr = new CashRegister(book, q);
		System.out.println("\n" + cr);
	}
}