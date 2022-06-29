import java.util.*;
import java.io.*;

public class RetailItemProgram {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nProvide items for retail below..");
		sc.nextLine();
		String d;
		ArrayList<RetailItem> items = new ArrayList<>();
		RetailItem i;
		do {
			try {
				items.add(new RetailItem());
			} catch (NegativePriceError | NegativeUnitsError e) {
				System.out.println("Error");
			}
			System.out.print("\nRetail Item " + items.size() + ":\nDescription: ");
			i = items.get(items.size() - 1);
			i.setDescription(sc.nextLine());
			setPrice(i, sc);
			setUnits(i, sc);
			sc.nextLine();
			System.out.println("\nDo you want to add another item? Enter yes or no below..");
			d = sc.nextLine();
		} while ( Character.toUpperCase(d.charAt(0)) == 'Y');
		System.out.println("Here are your retail item objects:\n" + items.toString());
	}


	public static void setPrice(RetailItem i, Scanner sc) {
		boolean b = true;
		while (b) {
			System.out.print("Price: ");
			try {
				i.setPrice(sc.nextDouble());
				b = false;
			} catch (NegativePriceError n) {
				System.out.println(n.getMessage() + " Enter again..");
			}
		}
	}


	public static void setUnits(RetailItem i, Scanner sc) {
		boolean b = true;
		while (b) {
			System.out.print("Units Available: ");
			try {
				i.setUnitsOnHand(sc.nextInt());
				b = false;
			} catch (NegativeUnitsError n) {
				System.out.println(n.getMessage() + " Enter again..");
			}
		}
	}
}