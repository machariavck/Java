import java.util.*;

public class PhoneBookEntryProgram {

	public static void main(String[] sth) {
		System.out.println("Say Hello to Phone Book Entry Console Program.");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		ArrayList<PhoneBookEntry> pbe = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.print("Person " + (i + 1) + ":\n**************\nName: ");
			String in = sc.nextLine();
			System.out.print("Phone Number: ");
			String p = sc.nextLine();
			pbe.add(new PhoneBookEntry(in, p));
		}
		System.out.println("\n\n####################################");
		System.out.println("These are the contacts present");
		System.out.println("####################################");
		System.out.println("####################################\n\n");
		for (PhoneBookEntry b : pbe) {
			System.out.println("**************************");
			System.out.println("Contact Name: " + b.getName() + "\nPhone Number: " + b.getPhoneNum());
		}
		System.out.println("**************************");
	}
}