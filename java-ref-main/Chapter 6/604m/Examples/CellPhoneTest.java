import java.util.Scanner;

public class CellPhoneTest {
	public static void main(String[] sth) {
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nSo, who's the phone's manufacturer? ");
		String testManuf = new String(in.nextLine());
		System.out.print("\nAnd what's it's model? ");
		String testModel = in.nextLine();
		System.out.print("\nOkay, now name your price: ");
		float price = in.nextFloat();
		CellPhone phone1 = new CellPhone(testManuf, testModel, price);
		System.out.println("\n\nThis is what you've provided about the phone;");
		System.out.println("Manufacturer: " + phone1.getManuf());
		System.out.println("Model: " + phone1.getModel());
		System.out.printf("Price: $%,.2f\n", phone1.getRetailPrice());
	}
}
		
